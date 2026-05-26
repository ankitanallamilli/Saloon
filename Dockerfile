# Base image
FROM openjdk:21-jdk-slim

# Work directory
WORKDIR /app

# Copy jar from target
COPY target/salon-0.0.1-SNAPSHOT.jar app.jar

# Run application
ENTRYPOINT ["java", "-jar", "app.jar"]
