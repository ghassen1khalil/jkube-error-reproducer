FROM adoptopenjdk/openjdk11:latest
VOLUME /tmp
EXPOSE 8080
COPY maven/target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
