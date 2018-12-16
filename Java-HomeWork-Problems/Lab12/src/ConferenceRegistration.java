
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.border.TitledBorder;

/**
 * This class is a template for the creation of GUI program which calculates the cost of attending a conference in 1999.
 */

public class ConferenceRegistration extends JFrame{

	private JPanel registrationPanel;
	private JPanel registrationTypePanel;
	private JPanel workshopsPanel;
	private JPanel dinnerPanel;
	private JPanel buttonPanel;
	private JPanel leftPanel;
	private ButtonGroup bg;

	private JRadioButton generalRegistrationButton;
	private JRadioButton studentRegistrationButton;
	
	private JCheckBox dinnerCheckBox;
	
	private JButton clearButton;
	private JButton calculateButton;
	private JButton exitButton;

	private JLabel registrationLabel;
	private JLabel registrationPanelLabel;
	private JLabel dinnerPanelLabel;
	private JLabel workshopLabel;
	
	private JList workshopList;
	private JScrollPane workshopListPane;
	

	private String[] workshops = {"Intro to e-commerce", "The future of the web", "Advanced Java Programming", "Network Security"};
		
	private EventListener listener = new EventListener();
	
	private final int WINDOW_WIDTH = 1020;
	private final int WINDOW_HEIGHT = 500;
	
	private final double NETWORK_SECURITY_CLASS_COST = 395;
	private final double FUTURE_OF_WEB_CLASS_COST = 295;
	private final double ADVANCED_JAVA_CLASS_COST = 395;
	private final double E_COMMERCE_CLASS_COST = 295;
	private final double GENERAL_REGISTRATION_COST = 895;
	private final double STUDENT_REGISTRATION_COST = 495;
	private final double DINNER_COST = 30;
	
	/**
	 * This constructor initializes the creation of a ConferenceRegistration object by calling establishing the
	 * basic parameters for the GUI application and calling the panel constructors.
	 */
	public ConferenceRegistration() {
		
		//sets the title
		setTitle("Conference Registration");

		//specifies an action for the close button
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//adds a borderlayout manager
		setLayout(new BorderLayout());
		
		
		
		//Builds the panels	
		buildRegistrationPanel();
		buildRegistrationTypePanel();
		buildworkshopsPanel();
		buildButtonPanel();
		
		//packs the content
		pack();
		//ensure it is visible
		setVisible(true);
	}
	
	/**
	 * This method builds the Registration panel.
	 */

	private void buildRegistrationPanel() {
		
		registrationPanel = new JPanel();
		
		registrationLabel = new JLabel("Select Registration Options");
		
		registrationLabel.setFont(new Font("Sans Serif", Font.BOLD, 36));
		
		registrationPanel.add(registrationLabel);
		
		add(registrationPanel, BorderLayout.NORTH);
		
		
	}
	
	/**
	 * This method builds the workshop panel.
	 */
	private void buildworkshopsPanel() {
		//create a panel to hold the list
		workshopsPanel = new JPanel();
		
		
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
		//create the list
		workshopList = new JList(workshops);

		//set the selectionmode to multiple
		workshopList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		//set the number of visible rows to 4
		workshopList.setVisibleRowCount(4);

		
		//add the list to a scroll pane
		workshopListPane = new JScrollPane(workshopList);
		
		//add the scroll pane to the panel
		workshopsPanel.add(workshopListPane);

		
		TitledBorder border = new TitledBorder("Workshops");
	    border.setTitleJustification(TitledBorder.CENTER);
	    border.setTitlePosition(TitledBorder.TOP);
	    
	    workshopsPanel.setBorder(border);
		add(workshopsPanel, BorderLayout.EAST);
	}
	
	/**
	 * This method builds the registration type panel.
	 */

	private void buildRegistrationTypePanel() {

		//make button group
		
		
		generalRegistrationButton = new JRadioButton("General Registration"); 
		studentRegistrationButton = new JRadioButton("Student Registration");

		//generalRegistrationButton.addActionListener(listener);
		//studentRegistrationButton.addActionListener(listener);

		registrationTypePanel = new JPanel();
		registrationTypePanel.setLayout(new GridLayout(1,2));
		
		bg = new ButtonGroup();
		
		bg.add(generalRegistrationButton);
		bg.add(studentRegistrationButton);
		
		generalRegistrationButton.setSelected(true);
		
		registrationTypePanel.add(generalRegistrationButton);
		registrationTypePanel.add(studentRegistrationButton);
		
		
		
		
		TitledBorder border = new TitledBorder("Registration Type");
	    border.setTitleJustification(TitledBorder.CENTER);
	    border.setTitlePosition(TitledBorder.TOP);
	    registrationTypePanel.setBorder(border);
	    
		
		dinnerCheckBox = new JCheckBox("Dinner and Keynote Speech");
		//dinnerCheckBox.addActionListener(listener);
		
		dinnerPanel = new JPanel();
		dinnerPanel.add(dinnerCheckBox);
		
		
		//make a general panel to hold both of these, make it grid 2, 1
		leftPanel = new JPanel();
		leftPanel.setLayout(new GridLayout(2, 1));
				
				
		//then add the radio button panel
		leftPanel.add(registrationTypePanel);
		//then add the checkbox panel
		leftPanel.add(dinnerPanel);

	
		add(leftPanel, BorderLayout.WEST);
		
	}
	

	/**
	 * This method builds the button panel.
	 */
	private void buildButtonPanel() {
	
		clearButton = new JButton("Calculate Charges");
		calculateButton = new JButton("Clear");
		exitButton = new JButton("Exit");
		
		clearButton.addActionListener(listener);
		calculateButton.addActionListener(listener);
		exitButton.addActionListener(listener);
		
		buttonPanel = new JPanel();
		
		buttonPanel.add(clearButton);
		buttonPanel.add(calculateButton);
		buttonPanel.add(exitButton);

		
	    add(buttonPanel, BorderLayout.SOUTH);
	    
	}
	
	/**
	 * This class creates an event listener object, which effectively contains the business logic for the program.	
	 *
	 */
	private class EventListener implements ActionListener {
		
			public void actionPerformed(ActionEvent e) {
	
				List selections = workshopList.getSelectedValuesList();
				double price = 0;
				String[] selectionList = (String[]) selections.toArray(new String[0]);
				
				for(int i =0; i<selectionList.length; i++) {
					if(selectionList[i] == "Network Security") {
						price += NETWORK_SECURITY_CLASS_COST;						
					}
					if(selectionList[i] == "The future of the web") {
						price +=FUTURE_OF_WEB_CLASS_COST;
					}
					if(selectionList[i] == "Advanced Java Programming") {
						price +=ADVANCED_JAVA_CLASS_COST;					
					}
					if(selectionList[i] == "Intro to e-commerce") {
						price +=E_COMMERCE_CLASS_COST;
					}
				}
				
				
				if(generalRegistrationButton.isSelected()) {
					price += GENERAL_REGISTRATION_COST;
					
				}
				else if(studentRegistrationButton.isSelected()) {
					price += STUDENT_REGISTRATION_COST;
				}
				else {

					JOptionPane.showMessageDialog(null,
							"Please select type of registration and type of workshops.",
						    "Inane error",
						    JOptionPane.ERROR_MESSAGE);
				}
				
				if(dinnerCheckBox.isSelected()) {
					price +=DINNER_COST;
					
				}
				
				if(e.getActionCommand() == "Calculate Charges") {
					//calculate charges
					if(selectionList.length == 0) {
						JOptionPane.showMessageDialog(null,
								"Please select type of workshops.",
							    "Inane error",
							    JOptionPane.ERROR_MESSAGE);
					}
					else {
						System.out.println(price);	
						
						DecimalFormat df = new DecimalFormat("##.00");
						JOptionPane.showMessageDialog(null,
								"Total charges: $" + df.format(price),
							    "Inane error",
							    JOptionPane.INFORMATION_MESSAGE);
					}
					
				}
				if(e.getActionCommand() == "Clear") {
					workshopList.clearSelection();
					bg.clearSelection();
					
					if(dinnerCheckBox.isSelected()) {
						dinnerCheckBox.setSelected(false);
					}
					
					System.out.println("clear");
				}
				if(e.getActionCommand() == "Exit") {
					System.exit(1);
					System.out.println("exit");
				}
			
			
			
				
			}			
		}
	

	/**
	 * This is the main method.
	 * @param args In an ideal world there might be args passed to this. We do not live in an ideal world.
	 */
	public static void main(String[] args) {

		
		ConferenceRegistration c17 = new ConferenceRegistration();
	}

	}
