FROM openjdk:21-jdk-slim
EXPOSE 8080
ADD target/mysql-project.jar mysql-project.jar
ENTRYPOINT ["java","-jar","/mysql-project.jar"]