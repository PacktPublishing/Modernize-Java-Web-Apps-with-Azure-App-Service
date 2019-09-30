FROM openjdk:8-jdk-alpine
RUN mkdir dist
COPY MyFirstPackApp/build/libs/ ./dist
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","dist/MyFirstPackApp-0.0.1-SNAPSHOT.jar"]