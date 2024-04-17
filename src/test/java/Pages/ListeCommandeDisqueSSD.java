package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class ListeCommandeDisqueSSD {
	@FindBy(xpath="/html/body/main/section/div/section/div/div[2]/section/div[1]/div[1]/div/ul/li/div[2]/span[1]")
	WebElement vpage;
		
		public ListeCommandeDisqueSSD() {
			PageFactory.initElements(Config.driver, this);
		}
		
		public String verifMessage() {
			String actualMessage = vpage.getText();
			return actualMessage;
			
		}

}
