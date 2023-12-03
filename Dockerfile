#FROM openjdk:8-alpine
#VOLUME /tmp
#COPY target/*.jar app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]
#EXPOSE 8080

FROM openjdk:8-alpine
ADD ./docker-spring-boot.jar docker-spring-boot.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8080
