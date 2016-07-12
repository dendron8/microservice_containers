#shamelessly lifted from https://spring.io/guides/gs/spring-boot-docker/
FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
#ADD sample_microservice-1.0.jar app.jar
ADD sample_microservice-1.0.jar
#RUN sh -c 'touch /app.jar'
#ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
ENTRYPOINT ["nohup", "java", "-jar", "sample_microservice/build/libs/sample_microservice-1.0.jar", ">", "sample_microservice.log", "2>&1", "&"]