package utils;

import org.apache.commons.lang3.RandomStringUtils;

public class AddPersonas {

	private String email;
	private String name;
	private String lastname;
	private String pass;
	private String address;
	private String city;
	private String postcode;
	private String phone;

	
	public AddPersonas() {
		email = mail();
		name = randomcorto();
		lastname = randomcorto();
		pass = randomlargo();
	}

	public String getEmail() {
		return email;
	}

	public String getName() {
		return name;
	}

	public String getLastname() {
		return lastname;
	}

	public String getPass() {
		return pass;
	}

	public String getAddress() {
		address = randomlargo();
		return address;
	}

	public String getCity() {
		city = randomlargo();
		return city;
	}

	public String getPostcode() {
		postcode = randomPostCode();
		return postcode;
	}

	public String getPhone() {
		phone = randomPhone();
		return phone;
	}

	private static String mail() {
		String mail = RandomStringUtils.randomAlphabetic(6) + "@";
		mail += RandomStringUtils.randomAlphabetic(6) + ".com";
		return mail;
	}

	private static String randomcorto() {
		return RandomStringUtils.randomAlphabetic(4);

	}

	private static String randomlargo() {
		return RandomStringUtils.randomAlphabetic(6);

	}

	private static String randomPostCode() {
		String postcode = RandomStringUtils.randomNumeric(5);
		return postcode;

	}

	private static String randomPhone() {

		String phone = RandomStringUtils.randomNumeric(9);
		return phone;

	}
}
