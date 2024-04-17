package Pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class HomeTunisianet {
	@FindBy(xpath="/html/body/main/header/div[3]/div/div/div/div/div/div/ul/li/div[1]/span")
	List<WebElement> menus;
	
	@FindBy(xpath="/html/body/main/header/div[3]/div/div/div/div/div/div/ul/li[3]/div[2]/div/div[2]/ul/li/a")
	List<WebElement> submenus;
	
	public HomeTunisianet() {
		PageFactory.initElements(Config.driver, this);
	}
	
	public void mouseHoverOnMenuByName(String MenuName) throws Exception {
	
		Thread.sleep(4000);
		for (WebElement menu: menus) {
			System.out.println(menu.getText());
			Config.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			if (menu.getText().contains(MenuName)) {
				Config.actions = new Actions(Config.driver);
				Config.actions.moveToElement(menu).perform();					
				}		
			}		
	}
		
	
		
	public void clickOnSubMenu(String SubMenuName) {
		try {						
		
		for(WebElement submenu: submenus) {
			System.out.println(submenu.getText());
			if(submenu.getText().contains(SubMenuName)) {
				
				submenu.click();
			}
		 }
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
