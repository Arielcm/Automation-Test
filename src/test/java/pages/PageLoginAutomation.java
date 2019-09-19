package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.SeleniumUtils;

public class PageLoginAutomation extends AbstractPage {

	@FindBy(id = "email_create")
	private WebElement emailtxt;
	@FindBy(id="SubmitCreate")
	private WebElement btnCreate;
	@FindBy(id = "email")
	private WebElement emailexisttxt;
	@FindBy(id = "passwd")
	private WebElement passtxt;
	@FindBy(id="SubmitLogin")
	private WebElement btnlogin;
	
	public PageLoginAutomation(WebDriver driver) {
		super(driver);
	}
	
	public boolean mailControl(String mail) {
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
	
	public PageCreationAccount createAccount(String email) {
		SeleniumUtils.esperarVisibilidadDelElemento(driver, emailtxt);
		emailtxt.sendKeys(email);
		btnCreate.click();
		return new PageCreationAccount(driver);
	}
	
	public Pageindexaccount loginExistAccoount(String email, String pass) {
		SeleniumUtils.esperarVisibilidadDelElemento(driver, btnlogin);
		emailexisttxt.sendKeys(email);
		passtxt.sendKeys(pass);
		btnlogin.click();
		return new Pageindexaccount(driver);
		
	}
	

}
