FROM openjdk:17

# Définition du repertoir de travail
WORKDIR /app

# Copie des fichier dans le container
COPY mvnw pom.xml ./

# Excusion de la comment d'installastion de maven
RUN chmod +x mvnw

# Copie des fichier dans le container
COPY src ./src

# Expose le port utiliser
EXPOSE 3000

# Définie le volume de stockage
VOLUME /var/

# Démarre le serveur
CMD ["./mvnw", "spring-boot:run"]