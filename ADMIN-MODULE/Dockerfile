# Use a base image with Java 17 pre-installed
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the executable JAR file from your host to this location in the container
COPY target/admin-0.0.1-SNAPSHOT.jar /app/admin-0.0.1-SNAPSHOT.jar

# Expose the port your application runs on
EXPOSE 8080

# Specify the command to run your application
ENTRYPOINT ["java", "-jar", "admin-0.0.1-SNAPSHOT.jar"]

