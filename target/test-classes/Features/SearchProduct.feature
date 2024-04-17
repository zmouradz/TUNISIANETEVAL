#Author Mourad
Feature: Recherche produit

  Scenario: vérification de la recherche
    Given Utilisateur accede a la page dacceuil tunisianet
    When Utilisateur ecrit le produit a rechercher "film de protection nano glass 9h pour samsung a12" and clique sur rechercher
    Then Utilisateur Vérifier la resultat de recherche "film de protection nano glass 9h pour samsung a12"
