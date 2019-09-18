package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutomationPracticeHome extends AbstractPage {

	@FindBy(xpath = "//a[@class='login']")
	WebElement loginlink;
	public AutomationPracticeHome(WebDriver driver) {
		super(driver);
	}
	
	public AutomationPracticeLogin clicklogin() {
		utils.SeleniumUtils.esperarVisibilidadDelElemento(driver, loginlink);
		loginlink.click();
		return new AutomationPracticeLogin(driver);
	}
	

}
