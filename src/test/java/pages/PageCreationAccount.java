package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import utils.SeleniumUtils;

public class PageCreationAccount extends AbstractPage {

	@FindBy(id="id_gender1")
	WebElement radio;
	@FindBy(id="customer_firstname")
	WebElement nametxt;
	@FindBy(id="customer_lastname")
	WebElement lastnametxt;
	@FindBy(id="passwd")
	WebElement passtxt;
	@FindBy(id="address1")
	WebElement addresstxt;
	@FindBy(id="city")
	WebElement citytxt;
	@FindBy(id="id_state")
	WebElement state_select;
	@FindBy(id="postcode")
	WebElement postcodetxt;
	@FindBy(id="phone_mobile")
	WebElement phonetxt;
	@FindBy(id="submitAccount")
	WebElement submitbtn;
	public PageCreationAccount(WebDriver driver) {
		super(driver);
	}
	
	private void select_state() {
		Select sel = new Select(state_select);
		int numero = (int) (Math.random() * 49) + 1;
		sel.selectByIndex(numero);
	}
	public Pageindexaccount Create_Account(String name,String lastname, String pass, String address, String city,String postcode,String phone) {
		SeleniumUtils.esperarVisibilidadDelElemento(driver, radio);
		radio.click();
		nametxt.sendKeys(name);
		lastnametxt.sendKeys(lastname);
		passtxt.sendKeys(pass);
		addresstxt.sendKeys(address);
		citytxt.sendKeys(city);
		select_state();
		postcodetxt.sendKeys(postcode);
		phonetxt.sendKeys(phone);
		submitbtn.click();
		return new Pageindexaccount(driver);
		
	}

}
