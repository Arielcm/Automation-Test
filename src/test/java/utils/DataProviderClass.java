package utils;

import java.util.List;

import org.testng.annotations.DataProvider;

import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

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
	
	// Datos para creacion de cuentas - Genera mail nombre y apellidos aleatorios - Tomados desde csv
	@DataProvider(name = "Personascsv")
	public static Object[] personascsv() throws CsvDataTypeMismatchException, CsvRequiredFieldEmptyException {
		rwcsv.writecsv();
		List<AddPersonas> personas = rwcsv.readcsv();
		return new Object[] { personas.get(0), personas.get(1), personas.get(2) };
	
	}

}
