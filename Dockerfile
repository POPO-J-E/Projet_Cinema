FROM maven:latest
WORKDIR /var/www/cinema
RUN mvn dependency:resolve
RUN mvn package -DskipTests

FROM frolvlad/alpine-oraclejdk8:slim
WORKDIR /var/www/cinema
RUN pwd
RUN ls
COPY target/-0.0.1-SNAPSHOT.jar target/app.jar
RUN sh -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","target/app.jar"]