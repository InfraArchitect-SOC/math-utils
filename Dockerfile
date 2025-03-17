# Use an official OpenJDK runtime as a parent image
FROM openjdk:11-jre-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the jar file from the target folder into the container at /app
COPY target/MathUtils-1.0-SNAPSHOT.jar app.jar

# Expose the port your application listens on (adjust if needed)
EXPOSE 8080

# Run the jar file when the container starts
ENTRYPOINT ["java", "-jar", "app.jar"]
