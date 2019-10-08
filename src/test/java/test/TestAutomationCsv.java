package test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.AbstractactTest;
import pages.PageCreationAccount;
import pages.PageHomeAutomation;
import pages.PageLoginAutomation;
import pages.Pageindexaccount;
import utils.AddPersonas;

public class TestAutomationCsv extends AbstractactTest {

	@Override
	protected String getBaseUrl() {
		return "http://automationpractice.com";
	}

	// Registro de Usuarios con Objetos
	@Test(dataProvider = "Personascsv", dataProviderClass = utils.DataProviderClass.class)
	public void createAccount(AddPersonas persona) {
		PageHomeAutomation home = new PageHomeAutomation(getDriver());
		PageLoginAutomation login = home.loginclick();
		PageCreationAccount create = login.createAccount(persona.getEmail());
		Pageindexaccount indexaccount = create.createAccount(persona);
		indexaccount.logoutclick();
		login.loginExistAccoount(persona.getEmail(), persona.getPass());
		String namelogin = indexaccount.userinfo();
		assertEquals(persona.getName() + " " + persona.getLastname(), namelogin);

	}

}
