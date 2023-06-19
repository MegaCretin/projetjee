FROM openjdk:17

WORKDIR /app

COPY mvnw pom.xml ./
RUN chmod +x mvnw

COPY src ./src

EXPOSE 3000

CMD ["./mvnw", "spring-boot:run"]