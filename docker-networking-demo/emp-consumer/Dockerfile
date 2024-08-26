FROM eclipse-temurin:17-jre-alpine
EXPOSE 9191
COPY target/emp-consumer-0.0.1-SNAPSHOT.jar emp-consumer.jar
ENV server.port 9191
ENTRYPOINT ["java","-jar","emp-consumer.jar"]