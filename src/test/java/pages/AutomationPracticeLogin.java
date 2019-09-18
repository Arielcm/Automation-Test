package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutomationPracticeLogin extends AbstractPage {

	@FindBy(id="email_create")
	WebElement emailtxt;
	
	public AutomationPracticeLogin(WebDriver driver) {
		super(driver);
	}
	
	public boolean mail_control(String mail) {
		utils.SeleniumUtils.esperarVisibilidadDelElemento(driver, emailtxt);
		emailtxt.sendKeys(mail);
		emailtxt.sendKeys(Keys.TAB);
		return control();
		
	}
	
	private boolean control() {
		String color=emailtxt.getCssValue("color");
		if(color.equals("rgba(241, 51, 64, 1)")) {
			return false;
		}else {
		return true;
				
		}
	}
	

}
