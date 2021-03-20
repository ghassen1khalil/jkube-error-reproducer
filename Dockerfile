FROM adoptopenjdk/openjdk11:latest
VOLUME /tmp
COPY maven/target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
