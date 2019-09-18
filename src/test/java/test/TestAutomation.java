package test;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import pages.AbstractactTest;
import pages.AutomationPracticeHome;
import pages.AutomationPracticeLogin;
import pages.PageCreationAccount;
import pages.PageHomeAutomation;
import pages.PageLoginAutomation;
import pages.Pageindexaccount;

public class TestAutomation extends AbstractactTest {

	@Override
	protected String getBaseUrl() {
		return "http://automationpractice.com";
	}
	
	/*Verificar el mensaje de error cuando el email ingresado en el campo de registración 
	no es un mail valido*/
	@Test(dataProvider = "Email", dataProviderClass = utils.DataProviderClass.class,enabled = true)
	public void MessageError(String email) {
		AutomationPracticeHome home = new AutomationPracticeHome(getDriver());
		AutomationPracticeLogin login = home.clicklogin();
		boolean control = login.mail_control(email);
		if(control) {
			assertTrue(control);
		}else
			assertFalse(control);
	}
	
	//Registro de Usuarios
	@Test(dataProvider = "Personas", dataProviderClass = utils.DataProviderClass.class,enabled = false)
	public void create_Account(String email, String name,String lastname, String pass, String address, String city,String postcode,String phone) {
		PageHomeAutomation home = new PageHomeAutomation(getDriver());
		PageLoginAutomation login = home.loginclick();
		PageCreationAccount create = login.Create_Account(email);
		Pageindexaccount indexaccount = create.Create_Account(name, lastname, pass, address, city, postcode, phone);
		indexaccount.logoutclick();
		login.Login_Exist_Accoount(email, pass);
		String namelogin = indexaccount.userinfo();
		assertEquals(name +" "+lastname, namelogin);

	}
	
	//Credenciales Correctas
	@Test(dataProvider = "LoginCorrecto", dataProviderClass = utils.DataProviderClass.class,enabled = false)
	public void Login_Correcto(String email, String pass, String name, String lastname) {
		PageHomeAutomation home = new PageHomeAutomation(getDriver());
		PageLoginAutomation login = home.loginclick();
		Pageindexaccount indexaccount= login.Login_Exist_Accoount(email, pass);
		String namelogin = indexaccount.userinfo();
		assertEquals(name +" "+lastname, namelogin);

	}
	
	

}
