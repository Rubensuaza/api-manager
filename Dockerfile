FROM openjdk:17-jdk-alpine

WORKDIR /app

COPY application/app-service/build/libs/project-manager.jar project-manager.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "project-manager.jar"]