FROM openjdk:8

MAINTAINER Krishna Sharma

EXPOSE 8081

WORKDIR /usr/local/bin

COPY ./target/client-two-0.0.1-SNAPSHOT.jar client-two.jar

CMD ["java", "-jar", "client-two.jar"]