FROM java:8

WORKDIR /usr/src/service

ADD target/employee-producer-0.0.1-SNAPSHOT.jar /usr/src/service/service.jar

EXPOSE 9090

ENTRYPOINT ["java", "-jar", "/usr/src/service/service.jar"]