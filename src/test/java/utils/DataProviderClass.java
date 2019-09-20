package utils;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

	// Datos para creacion de cuentas - Genera mail nombre y apellidos aleatorios
	@DataProvider(name = "Personas")
	public static Object[] personas() {
		return new Object[] { new AddPersonas(), new AddPersonas(), new AddPersonas() };
	
	}

	// Datos para prueba de formato de mail
	@DataProvider(name = "Email")
	public Object[] email() {
		return new Object[] { "asd@asd", "asdasd@asdasd.com", "a" };
	}

	// Datos para login en caso de cuenta existente
	@DataProvider(name = "LoginCorrecto")
	public static Object[][] loginCorrecto() {
		return new Object[][]{
				new Object[] { "xMBY@hwRd.com", "NoseJose", "BRMS", "KTkIL" },
				new Object[] { "nPmP@zcuz.com", "asdasd", "nUjk", "FtrEX" },
				new Object[] { "BWyA@CEnq.com", "TresNoseJose", "FbtB", "ipqeP" }, 
				};
	}

}
