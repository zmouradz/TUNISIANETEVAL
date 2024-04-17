package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class DisqueDurexterne {
	@FindBy(xpath="/html/body/main/section/div/div/nav/ol/li[3]/a/span")
	WebElement vpage;
	
	public DisqueDurexterne() {
		PageFactory.initElements(Config.driver, this);
	}
	
	public String verifMessage() {
		String actualMessage = vpage.getText();
		return actualMessage;
		
	}

}
