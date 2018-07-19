package chapter10_problem7;

public class Customer extends Person {

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
	
	private String customerNumber;
	private Boolean mailingList;
	
	Customer(){
		super();
		this.setCustomerNumber("12345");
		this.setMailingList(false);
	}
	
	Customer(String name, String address, String phoneNumber, String customerNumber, Boolean mailingList){
		super(name, address, phoneNumber);
		this.setCustomerNumber(customerNumber);
		this.setMailingList(mailingList);
	}

	public Boolean getMailingList() {
		return mailingList;
	}

	public void setMailingList(Boolean mailingList) {
		this.mailingList = mailingList;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}
	
	public void displayInfo() {
		System.out.println("Customer Number: " + this.getCustomerNumber());
		System.out.println("Customer Subscribed to Mailing List: " + this.getMailingList());
		System.out.println("Customer Name: " + this.getName());
		System.out.println("Customer Address: " + this.getAddress());
		System.out.println("Customer Phone Number " + this.getPhoneNumber());
		
	}
	
	
}
