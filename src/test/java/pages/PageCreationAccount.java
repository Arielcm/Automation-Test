package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import utils.AddPersonas;

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
	public Pageindexaccount createAccount(AddPersonas persona) {
		SeleniumUtils.esperarVisibilidadDelElemento(driver, radio);
		radio.click();
		nametxt.sendKeys(persona.getName());
		lastnametxt.sendKeys(persona.getLastname());
		passtxt.sendKeys(persona.getPass());
		addresstxt.sendKeys(persona.getAddress());
		citytxt.sendKeys(persona.getCity());
		selectState();
		postcodetxt.sendKeys(persona.getPostcode());
		phonetxt.sendKeys(persona.getPhone());
		submitbtn.click();
		return new Pageindexaccount(driver);
		
	}

}
