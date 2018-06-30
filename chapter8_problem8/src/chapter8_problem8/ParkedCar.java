package chapter8_problem8;

public class ParkedCar {

	/**
	 This class should simulate a parked car.
	 
	 Responsibilities:
	 To know the car's make, model, color, license number, and the number of minutes that the car has been parked
	 */
	
	private String make;
	private String model;
	private String color;
	private String licenseNumber;
	private int numberOfMinutesParked;
	
	//default Constructor
	public ParkedCar() {
		
		this.setMake("Toyota");
		this.setModel("Prius");
		this.setColor("Black");
		this.setLicenseNumber("123456789");
		this.setNumberOfMinutesParked(1);
		
	}
	
	public ParkedCar(String make, String model, String color, String licenseNumber, int numberOfMinutesParked) {
		
		this.setMake(make);
		this.setModel(model);
		this.setColor(color);
		this.setLicenseNumber(licenseNumber);
		this.setNumberOfMinutesParked(numberOfMinutesParked);
		
	}

	//getters
	
	public String getMake() {
		return make;
	}

	
	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}
	public String getLicenseNumber() {
		return licenseNumber;
	}

	public int getNumberOfMinutesParked() {
		return numberOfMinutesParked;
	}

	//setters
	
	public void setMake(String make) {
		this.make = make;
	}

	public void setModel(String model) {
		this.model = model;
	}


	public void setColor(String color) {
		this.color = color;
	}
	
	
	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	
	public void setNumberOfMinutesParked(int numberOfMinutesParked) {
		this.numberOfMinutesParked = numberOfMinutesParked;
	}
	
	
	
	
	

}
