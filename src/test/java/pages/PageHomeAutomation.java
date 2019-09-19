package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PageHomeAutomation extends AbstractPage {

	@FindBy(className = "login")
	private WebElement loginlink;

	
	public PageHomeAutomation(WebDriver driver) {
		super(driver);
	}
	
	public PageLoginAutomation loginclick() {
		utils.SeleniumUtils.esperarVisibilidadDelElemento(driver, loginlink);
		loginlink.click();
		return new PageLoginAutomation(driver);
	}

}
