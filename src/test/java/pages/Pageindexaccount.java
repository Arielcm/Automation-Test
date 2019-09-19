package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pageindexaccount extends AbstractPage {

	@FindBy(className = "logout")
	private WebElement logoutlink;
	@FindBy(className = "header_user_info")
	private WebElement userinfo;
	
	public Pageindexaccount(WebDriver driver) {
		super(driver);
	}
	
	public void logoutclick() {
		logoutlink.click();
	}
	
	public String userinfo() {
		return userinfo.getText();
	}

}
