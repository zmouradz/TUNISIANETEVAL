#Author Mourad
Feature: Disque ssd

  Scenario: Acceder a la page Disque ssd et cliquer sur produit
    Given Utilisateur accede a la page du disque ssd
    When Utilisateur effectue un tri en cliquant sur "Prix croissants" and clique sur  "En Stock" and clique sur "Disque dur Interne HIKSEMI WAVE / 1 To SSD"
    And Utilisateur clique sur "Ajouter au panier" and clique sur "Commander"
    Then Utilisateur Vérifie la commande "Disque dur Interne HIKSEMI WAVE / 1 To SSD"
