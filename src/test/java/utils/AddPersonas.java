package utils;

import org.apache.commons.lang3.RandomStringUtils;

public class AddPersonas {

	public String mail() {
		String mailp=RandomStringUtils.randomAlphabetic(4)+"@";
		mailp+=RandomStringUtils.randomAlphabetic(4)+".com";
		return mailp;
	}
	
	public String nombre() {
		String nomp=RandomStringUtils.randomAlphabetic(4);
		return nomp;
	}
	
	public String apellido() {
		String app=RandomStringUtils.randomAlphabetic(5);
		return app;
	}
}
