FROM maven:latest
WORKDIR /var/www/cinema
COPY pom.xml .
RUN mvn dependency:resolve
COPY . .
RUN mvn package -DskipTests

FROM frolvlad/alpine-oraclejdk8:slim
WORKDIR /var/www/cinema
COPY --from=0 /var/www/cinema/target/projet_cinema-0.0.1-SNAPSHOT.jar target/app.jar
RUN sh -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","target/app.jar"]
EXPOSE 8181