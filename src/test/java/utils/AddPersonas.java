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

	public void setEmail(String email) {
		this.email = email;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "AddPersonas [email=" + email + ", name=" + name + ", lastname=" + lastname + ", pass=" + pass
				+ ", address=" + address + ", city=" + city + ", postcode=" + postcode + ", phone=" + phone + "]";
	}

	
	
	
}
