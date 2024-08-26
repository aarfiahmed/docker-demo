FROM eclipse-temurin:17-jre-alpine

COPY /target/emp-producer-0.0.1-SNAPSHOT.jar emp-consumer.jar
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "emp-consumer.jar","--server.port", "8080"]