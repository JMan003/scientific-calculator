# Use the official Ubuntu image as the base
FROM ubuntu:latest

# Update package lists and install Java 11 (headless is smaller as it excludes GUI libraries)
RUN apt-get update && \
    apt-get install -y openjdk-11-jre-headless && \
    apt-get clean;

# Set the working directory inside the container
WORKDIR /app

# Copy the packaged .jar file from your host's target directory to the container
COPY target/scientific-calculator-1.0-SNAPSHOT.jar /app/calculator.jar

# Command to execute the application
ENTRYPOINT ["java", "-jar", "/app/calculator.jar"]
