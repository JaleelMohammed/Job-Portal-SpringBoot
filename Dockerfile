# Stage 1: Build the Spring Boot app using Maven
FROM maven:3.8.5-openjdk-17 AS build

WORKDIR /app

# Copy only the pom.xml and download dependencies
COPY pom.xml .

RUN mvn dependency:go-offline

# Now copy the rest of the source code
COPY src ./src

# Build the application
RUN mvn clean package -DskipTests

# Stage 2: Run the app using a lightweight JDK image
FROM openjdk:17-jdk-slim

WORKDIR /app

# Copy the built JAR from the build stage
COPY --from=build /app/target/*.jar app.jar

# Expose the port (must match server.port in application.properties)
EXPOSE 8080

# Run the Spring Boot app
ENTRYPOINT ["java", "-jar", "app.jar"]
