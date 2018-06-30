package chapter8_problem8;

public class Application {

	public static void main(String[] args) {
		
		//demonstrate how these classes collaborate...
		
		//instantiate a car object
		ParkedCar automobile = new ParkedCar();
		
		//set the data fields
		automobile.setColor("black");
		automobile.setLicenseNumber("587098678");
		automobile.setMake("Ford");
		automobile.setModel("Taurus");
		automobile.setNumberOfMinutesParked(180);
		
		//testing automobile's data fields:
		System.out.println(automobile.getColor());
		System.out.println(automobile.getLicenseNumber());
		System.out.println(automobile.getMake());
		System.out.println(automobile.getModel());
		System.out.println(automobile.getNumberOfMinutesParked());
		//tests passed!
		
		//instantiate a basic meter object
		ParkingMeter meter = new ParkingMeter();
		
		//add a quarter to the meter
		meter.addTimeToMeter(1);
		
		//meter should show 60 minutes of time
		System.out.println(meter.getParkingTimePurchased());
		//tests passed!
		
		
		//instantiate a basic policeOfficer object
		PoliceOfficer cop = new PoliceOfficer();
		
		//set police officer data fields
		cop.setOfficerName("Bill O'Reilly");
		cop.setBadgeNumber("362367");
		
		//testing officer's data fields
		System.out.println(cop.getBadgeNumber());
		System.out.println(cop.getOfficerName());
		//tests passed!
		
		

		/*****************************************************************************************/
		//instantiate a parking ticket object
		//moved this call to the PoliceOfficer object !!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		//ParkingTicket ticket = new ParkingTicket();
		//ticket.setOfficerIssuingTicket(cop);
		
		//System.out.println(ticket.getOfficerName());
		//System.out.println(ticket.getBadgeNumber());

		//bring it all together by testing a parking ticket
		//instantiate a parking ticket object
		
		ParkingTicket ticket = new ParkingTicket();
		ticket.setOfficerIssuingTicket(cop);
		

		System.out.println(ticket.getOfficerName());
		System.out.println(ticket.getBadgeNumber());

		//calling objects data fields are correctly set in the ticket object--tests passed!
		
		//set remaining data fields of the ticket object
		//pass a reference to the car object to set data fields in parking ticket

		//ticket.setAssociatedCar(automobile);
		
		//ticket.ticketInfo();
		//all fields we changed are working, we just need to set the fine amount now
		//and make sure that our math works out!
		
		//ticket.setFineAmount(automobile, meter);

		ticket.setAssociatedCar(automobile);
		
		ticket.ticketInfo();
		//all fields we changed are working, we just need to set the fine amount now
		//and make sure that our math works out!
		
		ticket.setFineAmount(automobile, meter);
		//when the amount of time over is 121, we get 45.00 as the fine amount--which is expected
		//when the amount of time is 120, we get 35.00 which is what is expected!--ALL TESTS PASSED!
		//::HIGH FIVE::
		

		//ticket.ticketInfo();

		/*******************************************************************************************/
		//moved all of the above logic into the PoliceOfficer class --here we see encapsulation and abstraction at work
		//TESTS PASSED!! 
		cop.examineCarForParkingViolation(automobile, meter);
		
		ticket.ticketInfo();
		

		
		
	}

}
