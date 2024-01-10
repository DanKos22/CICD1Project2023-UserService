FROM eclipse-temurin:17-alpine

# Set the working directory inside the container
WORKDIR /app

#copy the JAR file into the container
COPY target/UserService-CICDProject2023-0.0.1-SNAPSHOT.jar /app

# Expsoe the prot that the Spring Boot application will run on
EXPOSE 8080

# Command to run the application
CMD ["java", "-jar", "UserService-CICDProject2023-0.0.1-SNAPSHOT.jar"]