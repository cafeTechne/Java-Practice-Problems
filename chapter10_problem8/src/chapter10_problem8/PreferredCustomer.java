package chapter10_problem8;

public class PreferredCustomer extends Customer {
	

	/*
	 *
	 * A retail store has a preferred customer plan where customers can earn discounts on all their
	 * purchases. The amount of a customer's discount is determined by the amount of all the 
	 * customer's cumulative purchases in the store as follows:
	 * 
	 * * When a preferred customer spends $500, he or she gets a 5 percent discount on all future purchases
	 * 
	 * * When a preferred customer spends $1000, he or she gets a 6 percent discount on all future purchases
	 * 
	 * * When a preferred customer spends $1500, he or she gets a 7 percent discount on all future purchases
	 * 
	 * * When a preferred customer spends $2000, he or she gets a 10 percent discount on all future purchases
	 * 
	 * Design a class named PreferredCustomer, which extends the Customer class you created in #7
	 * 
	 * Needs fields for the amount of the customer's purchases and the customer's discount level.
	 * 
	 * Demonstrate the class in a simple program.
	 * 
	 */
	
	private double totalPurchases;
	private double discountLevel;
	
	
	public PreferredCustomer(){
		super();	
		this.totalPurchases = 0;
		this.discountLevel = 0;
	}

	public PreferredCustomer(String name, String address, String phoneNumber, String customerNumber, Boolean mailingList, double totalPurchases){
		super(name, address, phoneNumber, customerNumber, mailingList);
		this.setTotalPurchases(totalPurchases);
		this.setDiscountLevel();
	}

	
	public double getTotalPurchases() {
		return totalPurchases;
	}

	public void setTotalPurchases(double totalPurchases) {
		this.totalPurchases = totalPurchases;
	}

	public double getDiscountLevel() {
		return discountLevel;
	}

	public void setDiscountLevel() {
		if(this.totalPurchases < 0) this.discountLevel = 0;
		if(this.totalPurchases >= 500 && this.totalPurchases < 1000) this.discountLevel = 5;
		if(this.totalPurchases >= 1000 && this.totalPurchases < 1500) this.discountLevel = 6;
		if(this.totalPurchases >= 1500 && this.totalPurchases < 2000) this.discountLevel = 7;
		if(this.totalPurchases >= 2000) this.discountLevel = 10;

	}
	
	public void displayInfo() {
		System.out.println("Preferred Customer Number: " + this.getCustomerNumber());
		System.out.println("Preferred Customer Subscribed to Mailing List: " + this.getMailingList());
		System.out.println("Preferred Customer Name: " + this.getName());
		System.out.println("Preferred Customer Address: " + this.getAddress());
		System.out.println("Preferred Customer Phone Number " + this.getPhoneNumber());
		System.out.println("Preferred Customer Total Purchases " + this.getTotalPurchases());
		System.out.println("Preferred Customer Discount Level " + this.getDiscountLevel() + "%");
	}
	
	
}
