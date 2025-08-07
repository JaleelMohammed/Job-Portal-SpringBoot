# Start with a base image with the JDK
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the pom.xml file to download dependencies
COPY pom.xml .

# Copy the rest of the source code
COPY src ./src

# Use Maven to build the application and create the executable JAR file
# '-Dmaven.test.skip=true' skips tests to speed up the build process
RUN mvn clean package -Dmaven.test.skip=true

# Expose the port on which the Spring Boot application will run (e.g., 8080)
EXPOSE 8080

# Set the entry point to run the JAR file
# Replace 'HireHub-SpringBoot-0.0.1-SNAPSHOT.jar' with your actual JAR file name
ENTRYPOINT ["java", "-jar", "target/HireHub-SpringBoot-0.0.1-SNAPSHOT.jar"]
# Start with a base image with the JDK
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the pom.xml file to download dependencies
COPY pom.xml .

# Copy the rest of the source code
COPY src ./src

# Use Maven to build the application and create the executable JAR file
# '-Dmaven.test.skip=true' skips tests to speed up the build process
RUN mvn clean package -Dmaven.test.skip=true

# Expose the port on which the Spring Boot application will run (e.g., 8080)
EXPOSE 8080

# Set the entry point to run the JAR file
# Replace 'HireHub-SpringBoot-0.0.1-SNAPSHOT.jar' with your actual JAR file name
ENTRYPOINT ["java", "-jar", "target/demos1-0.0.1-SNAPSHOT.jar"]
