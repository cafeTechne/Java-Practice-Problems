
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int timesUserWon = 0;
		int timesPCWon = 0;
		
		for(int i = 0; i<10; i++) {
			
			System.out.println("Game Number " + (i + 1));
			
			Die d1 = new Die(6);
			
			System.out.println("User.........." + d1.getValue());
			
			Die d2 = new Die(6);
			System.out.println("Computer......" + d2.getValue());
			
			if(d1.getValue() > d2.getValue()) {
				timesUserWon +=1;
				System.out.println("The user is the winner!");
			}
			if(d1.getValue() < d2.getValue()) {
				timesPCWon +=1;
				System.out.println("The computer is the winner!");
			}
			else System.out.println("The game has ended in a tie!");
			
			System.out.println("                      ");
			
			//System.out.println(" ");
		}
		System.out.println("                      ");
		System.out.println("Computer....." + timesPCWon);
		System.out.println("User........." + timesUserWon);
		if(timesUserWon > timesPCWon) {
			System.out.println("User is the grand winner.");
		}
		if(timesUserWon < timesPCWon) {
			System.out.println("Computer is the grand winner.");
		}
		
		if(timesUserWon == timesPCWon) 
		{
			System.out.println("Computer and User have tied!");
		}
		
			

	}

}
