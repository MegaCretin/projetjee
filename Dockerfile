FROM openjdk:17

WORKDIR /app

COPY mvnw pom.xml ./
RUN chmod +x mvnw

COPY src ./src

CMD ["./mvnw", "spring-boot:run"]