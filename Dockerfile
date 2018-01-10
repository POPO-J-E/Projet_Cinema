FROM maven:latest
WORKDIR /var/www/cinema
COPY pom.xml .
RUN pwd
RUN ls
RUN mvn dependency:resolve
COPY . .
RUN ls
RUN mvn package -DskipTests
RUN ls
RUN ls target

FROM frolvlad/alpine-oraclejdk8:slim
WORKDIR /var/www/cinema
RUN pwd
RUN ls
COPY --from=0 /var/www/cinema/target/-0.0.1-SNAPSHOT.jar target/app.jar
RUN sh -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","target/app.jar"]