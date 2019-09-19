package test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;


import static org.testng.Assert.assertEquals;


import javax.swing.JOptionPane;

import pages.AbstractactTest;
import pages.PageCreationAccount;
import pages.PageHomeAutomation;
import pages.PageLoginAutomation;
import pages.Pageindexaccount;

public class TestAutomation extends AbstractactTest {

	@Override
	protected String getBaseUrl() {
		return "http://automationpractice.com";
	}
	
	
	@Test(enabled = false)
	public void ControlMail() {
		PageHomeAutomation home = new PageHomeAutomation(getDriver());
		PageLoginAutomation login = home.loginclick();
		String email=JOptionPane.showInputDialog("Ingrese mail a controlar!");
		boolean control = login.mailControl(email);
		assertEquals(false, control,"Error en caso de mail correcto!");
	}
	
	/*Verificar el mensaje de error cuando el email ingresado en el campo de registración 
	no es un mail valido*/
	@Test(dataProvider = "Email", dataProviderClass = utils.DataProviderClass.class)
	public void MessageError(String email) {
		PageHomeAutomation home = new PageHomeAutomation(getDriver());
		PageLoginAutomation login = home.loginclick();
		boolean control = login.mailControl(email);
		assertEquals(false, control,"Error en caso de mail correcto!");
	}
	
	//Registro de Usuarios
	@Test(dataProvider = "Personas", dataProviderClass = utils.DataProviderClass.class)
	public void createAccount(String email, String name,String lastname, String pass, String address, String city,String postcode,String phone) {
		PageHomeAutomation home = new PageHomeAutomation(getDriver());
		PageLoginAutomation login = home.loginclick();
		PageCreationAccount create = login.createAccount(email);
		Pageindexaccount indexaccount = create.createAccount(name, lastname, pass, address, city, postcode, phone);
		indexaccount.logoutclick();
		login.loginExistAccoount(email, pass);
		String namelogin = indexaccount.userinfo();
		assertEquals(name +" "+lastname, namelogin);

	}
	
	//Credenciales Correctas
	@Test(dataProvider = "LoginCorrecto", dataProviderClass = utils.DataProviderClass.class)
	public void Login_Correcto(String email, String pass, String name, String lastname) {
		PageHomeAutomation home = new PageHomeAutomation(getDriver());
		PageLoginAutomation login = home.loginclick();
		Pageindexaccount indexaccount= login.loginExistAccoount(email, pass);
		String namelogin = indexaccount.userinfo();
		AssertJUnit.assertEquals("Error en caso de Datos Incorrectos!",name +" "+lastname, namelogin);

	}
	
	

}
