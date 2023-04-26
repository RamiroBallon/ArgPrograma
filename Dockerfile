FROM amazoncorretto:17-alpine-jdk

MAINTAINER ramiroBd

COPY target/ArgPrograma-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]