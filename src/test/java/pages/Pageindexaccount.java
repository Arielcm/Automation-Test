package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pageindexaccount extends AbstractPage {

	@FindBy(className = "logout")
	WebElement logoutlink;
	@FindBy(className = "header_user_info")
	WebElement userinfo;
	
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
