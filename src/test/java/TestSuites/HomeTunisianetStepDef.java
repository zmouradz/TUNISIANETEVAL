package TestSuites;

import java.time.Duration;

import org.junit.Assert;

import Helper.Config;
import Pages.DisqueDurexterne;
import Pages.HomeTunisianet;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeTunisianetStepDef {
	@Given("Utilisateur accede a la page dacceuil")
	public void utilisateur_accede_a_la_page_dacceuil() throws Exception {
		Config.confChrome();
		Config.maximaseWindow();
		Config.driver.get("https://www.tunisianet.com.tn/");
	   
	}

	@When("Utilisateur survole la souris sur le menu {string} de la page dacceuil")
	public void utilisateur_survole_la_souris_sur_le_menu_de_la_page_dacceuil(String menutile) throws Exception {
		HomeTunisianet home = new HomeTunisianet();
	    home.mouseHoverOnMenuByName(menutile);
	    
	}

	@When("Utilisateur clique sur le submenu {string}")
	public void utilisateur_clique_sur_le_submenu(String submenutitle) {
		HomeTunisianet home = new HomeTunisianet();
		Config.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    home.clickOnSubMenu(submenutitle);
	  
	}

	@Then("Utilisateur est dirigé vers la page de submenu {string}")
	public void utilisateur_est_dirigé_vers_la_page_de_submenu(String expectedMeaage) {
		DisqueDurexterne page = new DisqueDurexterne();
		String actualMessage = page.verifMessage();
		Assert.assertEquals(expectedMeaage, actualMessage);
	    
	}


}
