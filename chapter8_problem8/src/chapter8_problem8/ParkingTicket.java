package chapter8_problem8;

public class ParkingTicket {

	/**
	 * This class should simulate a parking ticket.
	 * 
	 * Responsibilities: To report the make, model, color and license number of the illegally parked car
	 * 
	 * To report the amount of the fine, which is $25 for the first hour or part of an hour that the car
	 * is illegally parked, plus $10 for every additional hour or part of an hour that the car is illegally parked
	 * 
	 * To report the name and badge number of the police officer issuing the ticket
	 * 
	 */
	

	private String make;
	private String model;
	private String color;
	private String licenseNumber;
	private String badgeNumber;
	private String officerName;
	
	
	private double fineAmount;
	private int minutesOver;
	
	
	//default constructor
	public ParkingTicket() {
		
		this.make="";
		this.model="";
		this.color="";
		this.licenseNumber="";
		this.badgeNumber="";
		this.officerName="";
		this.fineAmount=0;
		this.minutesOver=0;
		
	}
	
	public void setAssociatedCar(ParkedCar car) {
		
		this.make=car.getMake();
		this.model=car.getModel();
		this.color=car.getColor();
		this.licenseNumber=car.getLicenseNumber();

	}
	
	
	//takes parkingTimePurchased from the ParkingMeter and numberOfMinutesParked from the ParkedCar 
	//and calculates a fine amount
	
	//To report the amount of the fine, which is $25 for the first hour or part of an hour that the car
	//is illegally parked, plus $10 for every additional hour or part of an hour that the car is illegally parked
	public void setFineAmount(ParkedCar car, ParkingMeter meter){
		
		//car.getNumberOfMinutesParked();
		//meter.getParkingTimePurchased();
		//we multiply by -1 to change the sign
		this.minutesOver =  -1*(meter.getParkingTimePurchased() - car.getNumberOfMinutesParked());
		
		if(car.getNumberOfMinutesParked() > meter.getParkingTimePurchased()) {
			
			this.calculateFine(car, meter);
			
		}
		else { 
			System.out.println("There is no fine.");
			System.out.println("The driver has: "+ ( meter.getParkingTimePurchased() - car.getNumberOfMinutesParked() ) + "left" );
		}
		
		
		
		
	}
	
	
	public void calculateFine(ParkedCar car, ParkingMeter meter) {
		
				
				if (this.minutesOver < 60) {
					
					this.fineAmount = 25;
					
				}
				
				if (this.minutesOver > 60) {
					
					//TEST THIS!!!
					if ( (this.minutesOver % 60) == 0) {
						
						this.fineAmount = 25 + (((this.minutesOver/60)-1)*10);
					}
					else {
						this.fineAmount = 25 + ((((this.minutesOver/60))*10));
					}
					
				}
	}
	
	//To report the name and badge number of the police officer issuing the ticket
	
	public void setOfficerIssuingTicket(PoliceOfficer cop) {
		this.setOfficerName(cop.getOfficerName());
		this.setBadgeNumber(cop.getBadgeNumber());
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}	
	
	public String getColor() {
		return color;
	}
	
	public String getBadgeNumber() {
		return badgeNumber;
	}

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public String getOfficerName() {
		return officerName;
	}
	
	
	
	public void setMake(String make) {
		this.make = make;
	}


	public void setModel(String model) {
		this.model = model;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setBadgeNumber(String badgeNumber) {
		this.badgeNumber = badgeNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public void setOfficerName(String officerName) {
		this.officerName = officerName;
	}
	
	
	public int getNumberOfMinutesParked(ParkedCar car) {
		return car.getNumberOfMinutesParked();
	}
	
	
	public double getFineAmount() {
		return this.fineAmount;
		
	}
	
	
	public void ticketInfo() {
		
		System.out.println("The make of the car is " + this.make);
		System.out.println("The model of the car is " + this.model);
		System.out.println("The color of the car is " + this.color);
		System.out.println("The license plate number of the car is " + this.licenseNumber);
		System.out.println("The badge number of the issuing Officer is " + this.badgeNumber);
		System.out.println("The name of the issuing Officer is " + this.officerName);
		System.out.println("The fine amount of the ticket is " + this.fineAmount);
		System.out.println("The minutes over the alloted time is " + this.minutesOver);
		
	}
	
	
}
