# projet JEE 2023
## Auteur: Estrems Arthur

**Pour construire le container sur une machine:**

1. Cloner le dépôt sur votre machine avec Docker installé.
2.  Dans un terminal, à la racine du projet. Entrer la commande suivante
    `docker build -t 'nom-conteneur'`
3. Lancer le container:
    `docker run -p 3000:3000 'nom-conteneur'`
4. Accéder: http://localhost:3000/