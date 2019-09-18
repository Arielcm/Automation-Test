package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.SeleniumUtils;

public class PageLoginAutomation extends AbstractPage {

	@FindBy(id = "email_create")
	WebElement emailtxt;
	@FindBy(id="SubmitCreate")
	WebElement btnCreate;
	@FindBy(id = "email")
	WebElement emailexisttxt;
	@FindBy(id = "passwd")
	WebElement passtxt;
	@FindBy(id="SubmitLogin")
	WebElement btnlogin;
	
	public PageLoginAutomation(WebDriver driver) {
		super(driver);
	}
	
	public PageCreationAccount Create_Account(String email) {
		SeleniumUtils.esperarVisibilidadDelElemento(driver, emailtxt);
		emailtxt.sendKeys(email);
		btnCreate.click();
		return new PageCreationAccount(driver);
	}
	
	public Pageindexaccount Login_Exist_Accoount(String email, String pass) {
		emailexisttxt.sendKeys(email);
		passtxt.sendKeys(pass);
		btnlogin.click();
		return new Pageindexaccount(driver);
		
	}
	

}
