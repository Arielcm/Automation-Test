package utils;

import org.apache.commons.lang3.RandomStringUtils;

public class AddPersonas {

	public static String mail() {
		String mailp = RandomStringUtils.randomAlphabetic(4) + "@";
		mailp += RandomStringUtils.randomAlphabetic(4) + ".com";
		return mailp;
	}

	public static String nombre() {
		return RandomStringUtils.randomAlphabetic(4);

	}

	public static String apellido() {
		return RandomStringUtils.randomAlphabetic(5);

	}
}
