package utils;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

	// Datos para creacion de cuentas - Genera mail nombre y apellidos aleatorios
	@DataProvider(name = "Personas")
	public static Object[][] personas() {
		return new Object[][] {
				new Object[] { AddPersonas.mail(), AddPersonas.nombre(), AddPersonas.apellido(), "NoseJose",
						"Calle Falsa 123", "Sprindfield", "12345", "123456789" },
				new Object[] { AddPersonas.mail(), AddPersonas.nombre(), AddPersonas.apellido(), "DosNoseJose",
						"Dos Calle Falsa 123", "Sprindfield", "56789", "123456789" },
				new Object[] { AddPersonas.mail(), AddPersonas.nombre(), AddPersonas.apellido(), "TresNoseJose",
						"Tres Calle Falsa 123", "Sprindfield", "01234", "123456789" }, };
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
