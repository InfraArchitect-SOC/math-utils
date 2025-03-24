# Use an official OpenJDK runtime as a parent image
FROM openjdk:11-jre-slim

# Set the working directory inside the container to /app
WORKDIR /app

# Copy the jar file from the target folder in your build context to the container as app.jar
COPY target/MathUtils-1.0-SNAPSHOT.jar app.jar

# Expose port 8080 (adjust this if your application uses a different port)
EXPOSE 8080

# Run the jar file when the container starts
ENTRYPOINT ["java", "-jar", "app.jar"]
