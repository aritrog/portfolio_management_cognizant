FROM openjdk:11
COPY target/discovery-service-0.0.1-SNAPSHOT.jar EurekaServer.jar
ENV JAVA_OPTS=""
ENTRYPOINT ["java","-jar","EurekaServer.jar"]
