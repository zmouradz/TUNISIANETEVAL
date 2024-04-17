package Pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class HomePageSearch {
	@FindBy (xpath= "/html/body/main/header/div[2]/div/div/div[2]/div[1]/div[1]/form/input[4]")
	WebElement searchItem;
	
	@FindBy(xpath="/html/body/main/header/div[2]/div/div/div[2]/div[1]/div[1]/form/div[2]/button")
	WebElement btnSearch;
	
	public HomePageSearch() {
		PageFactory.initElements(Config.driver, this);
	}
	
	
	public void searchItem(String rechercher) {
		searchItem.sendKeys(rechercher);
		Config.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
				
	}
	public void clickOnSearch() throws Exception {
		Thread.sleep(3000);
		
		btnSearch.click();
	}

}
