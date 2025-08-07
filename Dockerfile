
# -------- Stage 1: Build with Maven --------
FROM maven:3.8.5-openjdk-17 AS build

WORKDIR /app
COPY . .

RUN mvn clean package -DskipTests

# -------- Stage 2: Run with Java --------
FROM openjdk:17-jdk-slim

WORKDIR /app

COPY --from=build /app/target/demos1-0.0.1-SNAPSHOT.jar demos1-0.0.1-SNAPSHOT.j

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "demos1-0.0.1-SNAPSHOT.jar"]