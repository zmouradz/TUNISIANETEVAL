package TestSuites;

import java.time.Duration;

import Helper.Config;
import Pages.HomePageSearch;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStepDef {
	@Given("Utilisateur accede a la page dacceuil tunisianet")
	public void utilisateur_accede_a_la_page_dacceuil_tunisianet() throws Exception {
		Config.confChrome();
		Config.maximaseWindow();
		Config.driver.get("https://www.tunisianet.com.tn/");
	    
	}

	@When("Utilisateur ecrit le produit a rechercher {string} and clique sur rechercher")
	public void utilisateur_ecrit_le_produit_a_rechercher_and_clique_sur_rechercher(String rechercher) {
		HomePageSearch home = new HomePageSearch();
		home.searchItem("film de protection nano glass 9h pour samsung a12");		
	    
	}

	@Then("Utilisateur Vérifier la resultat de recherche {string}")
	public void utilisateur_vérifier_la_resultat_de_recherche(String rechercher) throws Exception {
		HomePageSearch home = new HomePageSearch();
		Config.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		home.clickOnSearch();
	}


}
