FROM eclipse-temurin:17-jdk-focal
ADD target/comp367-0.0.1-SNAPSHOT.jar comp367-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "comp367-0.0.1-SNAPSHOT.jar"]