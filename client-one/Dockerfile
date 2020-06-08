FROM openjdk:8

MAINTAINER Krishna Sharma

EXPOSE 8080

WORKDIR /usr/local/bin

COPY ./target/spring-config-client-0.0.1-SNAPSHOT.jar client-one.jar

CMD ["java", "-jar", "client-one.jar"]