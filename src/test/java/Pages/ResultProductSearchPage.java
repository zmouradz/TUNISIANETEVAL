package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class ResultProductSearchPage {
	@FindBy(xpath="/html/body/main/section/div/div/div[2]/section/section/div[3]/div/div/div/div/article/div/div[2]/h2/a")
	WebElement vpage;
	
	public ResultProductSearchPage() {
		PageFactory.initElements(Config.driver, this);
	}
	
	public String verifMessage() {
		String actualMessage = vpage.getText();
		return actualMessage;
		
	}


}
