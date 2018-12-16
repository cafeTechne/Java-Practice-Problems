import javax.swing.*;    // Needed for Swing classes
import java.awt.event.*; // Needed for ActionListener Interface


public class LongDistanceCallDemo extends JFrame {

/**
   The LongDistanceCallDemo class displays a JFrame that
   lets the user enter a distance in minutes. When
   the Calculate button is clicked, a dialog box is
   displayed with the distance converted to minutes.
*/


   private JPanel panel;             // To reference a panel
   private JLabel messageLabel;      // To reference a label
   private JTextField kiloTextField; // To reference a text field
   private JButton calcButton;       // To reference a button
   private JRadioButton daytime = new JRadioButton("Daytime");
   private JRadioButton evening = new JRadioButton("Evening");
   private JRadioButton offPeak = new JRadioButton("Off-Peak");
   
   
   private final int WINDOW_WIDTH = 310;  // Window width
   private final int WINDOW_HEIGHT = 500; // Window height

   /**
      Constructor
   */

   public LongDistanceCallDemo()
   {
      // Set the window title.
      setTitle("Long Distance Call Calculator");

      // Set the size of the window.
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

      // Specify what happens when the close button is clicked.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Build the panel and add it to the frame.
      buildPanel();

      // Add the panel to the frame's content pane.
      add(panel);

      // Display the window.
      setVisible(true);
   }

   /**
      The buildPanel method adds a label, text field, and
      and a button to a panel.
   */

   private void buildPanel()
   {
      // Create a label to display instructions.
      messageLabel = new JLabel("Enter a time " +
                                "in minutes");

      // Create a text field 10 characters wide.
      kiloTextField = new JTextField(10);

      // Create a button with the caption "Calculate".
      calcButton = new JButton("Calculate");

      // Add an action listener to the button.
      calcButton.addActionListener(new CalcButtonListener());

      // Create a JPanel object and let the panel
      // field reference it.
      panel = new JPanel();

      // Add the label, text field, and button
      // components to the panel.
      
      
      panel.add(daytime);
      panel.add(evening);
      panel.add(offPeak);
      
      panel.add(messageLabel);
      panel.add(kiloTextField);
      panel.add(calcButton);
   }

   /**
      CalcButtonListener is an action listener class for
      the Calculate button.
   */

   private class CalcButtonListener implements ActionListener
   {
      /**
         The actionPerformed method executes when the user
         clicks on the Calculate button.
         @param e The event object.
      */

      public void actionPerformed(ActionEvent e)
      {
         final double CONVERSION = 0.6214;
         String input;  // To hold the user's input
         double minutes;  // The number of minutes
         double rate = 0;
         
         
         if(daytime.isSelected()){
        	 rate = 0.07;
         } 
         if(evening.isSelected()){
        	 rate = 0.12;
         } 
         if(offPeak.isSelected()){
        	 rate = 0.05;
         } 
         
         
         // Get the text entered by the user into the
         // text field.
         input = kiloTextField.getText();
         
         // For debugging, display the text entered, and
         // its value converted to a double.
         System.out.println("Reading " + input +
                            " from the text field.");
         System.out.println("Converted value: " +
                            Double.parseDouble(input));

         // Convert the input to minutes.
         minutes = Double.parseDouble(input);

         // Display the result.
         JOptionPane.showMessageDialog(null, input +
                  " minutes is " + minutes*rate + " dollars.");

         // For debugging, display a message indicating
         // the application is ready for more input.
         System.out.println("Ready for the next input.");
      }
   } // End of CalcButtonListener class

   /**
      The main method creates an instance of the
      LongDistanceCallDemo class, which displays
      its window on the screen.
   */

   public static void main(String[] args)
   {
      new LongDistanceCallDemo();
   }
}
