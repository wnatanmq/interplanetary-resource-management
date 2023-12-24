# Use a base image with Java installed
FROM openjdk:11

# Set the working directory inside the container
WORKDIR /app

# Copy the application JAR file to the container
COPY target/myapp.jar .

# Run the application when the container starts with heap limit set to 512MB
CMD ["java", "-Xmx256m", "-jar", "myapp.jar"]
