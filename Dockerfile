FROM openjdk:8-jdk-alpine
VOLUME /tmp
#WORKDIR /home/resul#
ARG JAR_FILE

EXPOSE 3000

ADD target/${JAR_FILE} app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
CMD ["--spring.config.additional-location=file:/config/application.properties"]