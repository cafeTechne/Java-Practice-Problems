package chapter8_problem8;

public class PoliceOfficer {

	private String badgeNumber;
	private String officerName;
	
	
	public PoliceOfficer() {
		this.badgeNumber = "123456";
		this.officerName = "anonymous";
	}
	
	public String getBadgeNumber() {
		return badgeNumber;
	}
	public void setBadgeNumber(String badgeNumber) {
		this.badgeNumber = badgeNumber;
	}
	public String getOfficerName() {
		return officerName;
	}
	public void setOfficerName(String officerName) {
		this.officerName = officerName;
	}
	
	
	
	/** 
	 *  to examine a parkedCar object and a Parking meter object, and determine whether the car's time has expired 
	 * @param car
	 * @param meter
	 * @return true means that there is a parking violation
	 */
	
	public void examineCarForParkingViolation(ParkedCar car, ParkingMeter meter)
	{
		if(car.getNumberOfMinutesParked() > meter.getParkingTimePurchased()) issueTicket(car, meter);
		
	}
	
	
	public void issueTicket(ParkedCar car, ParkingMeter meter) {
		
		ParkingTicket ticket = new ParkingTicket();
		ticket.setOfficerIssuingTicket(this);
		ticket.setAssociatedCar(car);
		ticket.setFineAmount(car, meter);
		ticket.ticketInfo();
	}
	
	//to issue a parking ticket (generate a parking ticket object) if the car's time has expired
	
	
}
