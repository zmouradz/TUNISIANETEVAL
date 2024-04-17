#Author Mourad
Feature: page dacceuil TUNISIANET

  Scenario: Verification des menus de la page dacceuil
    Given Utilisateur accede a la page dacceuil
    When Utilisateur survole la souris sur le menu "Stockage" de la page dacceuil
    And Utilisateur clique sur le submenu "Disque Dur externe"
    Then Utilisateur est dirigé vers la page de submenu "Disque Dur externe"
