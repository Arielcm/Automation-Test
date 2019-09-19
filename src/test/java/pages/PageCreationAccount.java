package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import utils.SeleniumUtils;

public class PageCreationAccount extends AbstractPage {

	@FindBy(id="id_gender1")
	private WebElement radio;
	@FindBy(id="customer_firstname")
	private WebElement nametxt;
	@FindBy(id="customer_lastname")
	private WebElement lastnametxt;
	@FindBy(id="passwd")
	private WebElement passtxt;
	@FindBy(id="address1")
	private WebElement addresstxt;
	@FindBy(id="city")
	private WebElement citytxt;
	@FindBy(id="id_state")
	private WebElement stateSelect;
	@FindBy(id="postcode")
	private WebElement postcodetxt;
	@FindBy(id="phone_mobile")
	private WebElement phonetxt;
	@FindBy(id="submitAccount")
	private WebElement submitbtn;
	public PageCreationAccount(WebDriver driver) {
		super(driver);
	}
	
	private void selectState() {
		Select sel = new Select(stateSelect);
		int numero = (int) (Math.random() * 49) + 1;
		sel.selectByIndex(numero);
	}
	public Pageindexaccount createAccount(String name,String lastname, String pass, String address, String city,String postcode,String phone) {
		SeleniumUtils.esperarVisibilidadDelElemento(driver, radio);
		radio.click();
		nametxt.sendKeys(name);
		lastnametxt.sendKeys(lastname);
		passtxt.sendKeys(pass);
		addresstxt.sendKeys(address);
		citytxt.sendKeys(city);
		selectState();
		postcodetxt.sendKeys(postcode);
		phonetxt.sendKeys(phone);
		submitbtn.click();
		return new Pageindexaccount(driver);
		
	}

}
