FROM openjdk:17-jdk-alpine
COPY ./target/FindIntersect-0.0.1-SNAPSHOT.jar FindIntersect-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","FindIntersect-0.0.1-SNAPSHOT.jar"]