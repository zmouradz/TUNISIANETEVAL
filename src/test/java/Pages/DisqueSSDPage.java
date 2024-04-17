package Pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class DisqueSSDPage {
	@FindBy(xpath="/html/body/main/section/div/div/div[2]/section/section/div[1]/div/div[3]/div/div/button")
	WebElement TriBtn;
	
	@FindBy(xpath="/html/body/main/section/div/div/div[2]/section/section/div[1]/div/div[3]/div/div/div/a")
	List<WebElement> menuTris;
	
	@FindBy(xpath="/html/body/main/section/div/div/div[2]/section/section/div[3]/div/div/div/div[1]/article/div/div[2]/h2/a")
	WebElement productBtn;
	
	@FindBy(xpath="/html/body/main/section/div/div/div/section/div[1]/div[3]/div[4]/form/div[2]/div/div[2]/button")
	WebElement addToCard;
	
	@FindBy(xpath="/html/body/div[8]/div/div/div/div[2]/div/div/a")
	WebElement btnCommande;
	
	@FindBy(xpath="/html/body/main/section/div/div/div/section/div/div/div[3]/div/a")
	WebElement btnCommander;
			
	
	public DisqueSSDPage() {
		PageFactory.initElements(Config.driver, this);
	}
	
	public void clickOnTriBtn(String menuTriName) throws Exception {
		System.out.println(menuTriName);
		
		TriBtn.click();		
		Thread.sleep(10000);
		try {
		for(WebElement menuTri: menuTris) {
			Config.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			if (menuTri.getText().contains(menuTriName)) {
				Config.actions = new Actions(Config.driver);
				Config.actions.moveToElement(menuTri).perform();
					}			
				}
					
	}catch (Exception e) {
		// TODO: handle exception
	}
	}
	public void clickOnTriSubMenu(String SubMenuTriName) {
		try {
			
		
		for(WebElement submenu: menuTris) {
			System.out.println(submenu.getText());
			if(submenu.getText().contains(SubMenuTriName)) {
				
				submenu.click();
			}
		}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	
		
			
	
	public void clickOnProduct() {
	
	Config.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	productBtn.click();
		
	}
	public void clickOnAddToCard() throws Exception {
		Thread.sleep(3000);
		
		addToCard.click();
	}
	
	public void clickOnPanier() throws Exception {
		Thread.sleep(3000);
		
		btnCommande.click();
	}
	
	public void clickOnVoirPanier() throws Exception {
		Thread.sleep(3000);
		
		btnCommander.click();
	}
	

}
