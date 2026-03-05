# Use an official lightweight OpenJDK 11 image as the base
FROM openjdk:11-jre-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the packaged .jar file from your host's target directory to the container
COPY target/scientific-calculator-1.0-SNAPSHOT.jar /app/calculator.jar

# Command to execute the application
ENTRYPOINT ["java", "-jar", "/app/calculator.jar"]
