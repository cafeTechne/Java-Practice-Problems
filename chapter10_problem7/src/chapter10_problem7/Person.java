package chapter10_problem7;

public class Person {
	
	/*
	 * Person and Customer Classes, Chapter 10, Problem 7
	 * 
	 * Design a class named Person with fields for holding a person's name, address
	 * and telephone number. 
	 * 
	 * Next, design a class named Customer, which extends toe Person class. The customer 
	 * class should have a field for a customer number and a boolean field indicating 
	 * whether the customer wishes to be on a mailing list. 
	 * 
	 * Demonstrate an object of the Customer class in a simple program.
	 * 
	 */
	
	private String name;
	private String address;
	private String phoneNumber;
	
	
	public Person(){
		this.name = "John Doe";
		this.setAddress("123 Pleasant Court");
		this.setPhoneNumber("555-555-5555");
	}
	public Person(String name, String address, String phoneNumber){
		this.setName(name);
		this.setAddress(address);
		this.setPhoneNumber(phoneNumber);
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	

}
