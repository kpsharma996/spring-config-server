FROM openjdk:8

MAINTAINER Krishna Sharma

EXPOSE 8888

WORKDIR /usr/local/bin

COPY ./target/spring-config-server-0.0.1-SNAPSHOT.jar config-server.jar

CMD ["java", "-jar", "config-server.jar"]