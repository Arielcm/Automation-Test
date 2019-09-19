package utils;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	
	static AddPersonas addp= new AddPersonas();

	//Datos para creacion de cuentas - Genera mail nombre y apellidos aleatorios 
	@DataProvider(name="Personas")
	public static Object[][] Personas()
    {
		return new Object[][] 
				{ new Object[] { addp.mail(),addp.nombre(), addp.apellido(), "NoseJose","Calle Falsa 123", "Sprindfield", "12345", "123456789" }, 
		          new Object[] { addp.mail(),addp.nombre(), addp.apellido(), "DosNoseJose","Dos Calle Falsa 123", "Sprindfield", "56789", "123456789" },
				  new Object[] { addp.mail(),addp.nombre(), addp.apellido(), "TresNoseJose","Tres Calle Falsa 123", "Sprindfield", "01234", "123456789" },
			};
    }
	
	//Datos para prueba de formato de mail
	@DataProvider(name="Email")
	public Object[] email() {
		return new Object[] {"asd@asd", "asdasd@asdasd.com", "a"};
	}
	
	//Datos para login en caso de cuenta existente
	@DataProvider(name="LoginCorrecto")
	public static Object[][] LoginCorrecto()
    {
		return new Object[][] 
				{ new Object[] { "xMBY@hwRd.com","NoseJose","BRMS","KTkIL"}, 
		          new Object[] { "nPmP@zcuz.com","asdasd","nUjk","FtrEX"},
				  new Object[] { "BWyA@CEnq.com","TresNoseJose","FbtB","ipqeP"},
			};
    }
	
	
	

}
