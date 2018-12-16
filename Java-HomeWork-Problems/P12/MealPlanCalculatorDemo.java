import java.awt.*;
import javax.swing.*;    // Needed for Swing classes
import java.awt.event.*; // Needed for ActionListener Interface



public class MealPlanCalculatorDemo extends JFrame {


   private JPanel mealPlanPanel;
   private JPanel dormPanel;
   private JOptionPane frame;
   private JLabel dormMessageLabel;      // To reference a label
   private JLabel mealPlanMessageLabel;      // To reference a label
   
   
   private JButton calcButton;       // To reference a button
   private JButton exitButton;       // To reference a button
   
   private JComboBox mealPlan;
   private JComboBox dormLocation;
   
   //the following array holds the values
   //that will be displayed in the meal plan combo box
   private String[] dorms = {"Allen Hall", " Pike Hall", "Farthing Hall", "University Suites"};
   private String[] mealPlans = {"7 meals per week", "14 meals per week", "Unlimited meals"};
   
   
   private final int WINDOW_WIDTH = 310;  // Window width
   private final int WINDOW_HEIGHT = 500; // Window height
   
   
   public MealPlanCalculatorDemo(){
	      // Set the window title.
	      setTitle("Long Distance Call Calculator");

	      // Set the size of the window.
	      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

	      // Specify what happens when the close button is clicked.
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	      
	      setLayout(new BorderLayout());
	      
	      // Build the panel and add it to the frame.
	      buildPanel();

	      // Add the panel to the frame's content pane.
	      add(mealPlanPanel, BorderLayout.NORTH);
	      add(dormPanel, BorderLayout.SOUTH);

	      pack();
	      
	      // Display the window.
	      setVisible(true);
   }

   
   /**
      Constructor
   */

   private void buildPanel()
   {
      // Create a label to display instructions.
      dormMessageLabel = new JLabel("Select a Dorm.");
      
      // Create a label to display instructions.
      mealPlanMessageLabel = new JLabel("Select a Meal Plan.");

      dormPanel = new JPanel();
      dormPanel.add(dormMessageLabel);
      
      dormLocation = new JComboBox(dorms);
      
      dormPanel.add(dormLocation);      
      
      mealPlanPanel = new JPanel();
      mealPlanPanel.add(mealPlanMessageLabel);
      
      
      mealPlan = new JComboBox(mealPlans);
      
      mealPlanPanel.add(mealPlan);
      
      // Create a button with the caption "Calculate".
      calcButton = new JButton("Calculate");
      
      calcButton.addActionListener(new CalcButtonListener());
      
      // Create a button with the caption "Exit"
      exitButton = new JButton("Exit");
      
      
      dormPanel.add(calcButton);
      dormPanel.add(exitButton);
      

      // Add an action listener to the button.
      //calcButton.addActionListener(new CalcButtonListener());

   }
   
   private class CalcButtonListener implements ActionListener{
	   public void actionPerformed(ActionEvent e) {
		   String mealPlanText = (String) mealPlan.getSelectedItem();
		   String locationText = (String) dormLocation.getSelectedItem();
		   
		   System.out.println(mealPlanText);
		   System.out.println(locationText);
		   
		   double dormPrice = 0;
		   double foodPrice = 0;
		   
		   
		    if(locationText == "Allen Hall") {
		    	dormPrice =  1500;
		    }
			if(locationText == "Pike Hall") {
						   dormPrice = 1600;
			}
			if(locationText == "Farthing Hall") {
				   dormPrice = 1200;
			}
			if(locationText == "University Suites") {
				   dormPrice = 1800;
			}		   
		   
			//"7 meals per week", "14 meals per week", "Unlimited meals"
			//System.out.println(dormPrice);
			
			if(mealPlanText == "7 meals per week") {
				foodPrice = 560;
			}
			if(mealPlanText == "14 meals per week") {
				foodPrice = 1095;
			}
			if(mealPlanText == "Unlimited meals") {
				foodPrice = 1500;
			}
			double cost = dormPrice + foodPrice;
			
			System.out.println(foodPrice);
			
			JOptionPane.showMessageDialog(frame,
				    cost,
				    "Final Cost",
				    JOptionPane.PLAIN_MESSAGE);
			
		   
	   }
   }
   
   
   public static void main(String[] args)
   {
      new MealPlanCalculatorDemo();
   }
   
}