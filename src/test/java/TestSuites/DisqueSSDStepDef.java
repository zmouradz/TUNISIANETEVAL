package TestSuites;

import java.time.Duration;

import Helper.Config;
import Pages.DisqueSSDPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DisqueSSDStepDef {
	@Given("Utilisateur accede a la page du disque ssd")
	public void utilisateur_accede_a_la_page_du_disque_ssd() throws Exception {
		Config.confChrome();
		   Config.maximaseWindow();
		   Config.driver.get("https://www.tunisianet.com.tn/379-disques-ssd");
	}

	@When("Utilisateur effectue un tri en cliquant sur {string} and clique sur  {string} and clique sur {string}")
	public void utilisateur_effectue_un_tri_en_cliquant_sur_and_clique_sur_and_clique_sur(String TriTitle, String MenuTriTitle, String productBtn) throws Exception  {
		DisqueSSDPage home = new DisqueSSDPage();
		Config.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		home.clickOnTriBtn(TriTitle);
		Config.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		home.clickOnTriSubMenu(MenuTriTitle);
		Config.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		home.clickOnProduct();
	    
	}

	@When("Utilisateur clique sur {string} and clique sur {string}")
	public void utilisateur_clique_sur_and_clique_sur(String Ajouteraupanier, String Commander) throws Exception {
		DisqueSSDPage home = new DisqueSSDPage();
		Config.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		home.clickOnAddToCard();
		Config.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		home.clickOnPanier();
	    
	}

	@Then("Utilisateur Vérifie la commande {string}")
	public void utilisateur_vérifie_la_commande(String string) throws Exception {
		DisqueSSDPage home = new DisqueSSDPage();
		Config.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		home.clickOnVoirPanier();
	   
	}

}
