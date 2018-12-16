import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class GooglyEyes extends JApplet {

	/**
	 * Init Method
	 */
	
	private JTextField helloText = new JTextField("Hello");
	private JFrame frame = new JFrame();
	
	public void init() {
		//create a layout manager
		setLayout(new FlowLayout());
		
		add(helloText);
		
		addMouseListener(new MyMouseListener());
		
		addMouseMotionListener(new MyMouseMotionListener());
		
	}
	
	private class MyMouseListener implements MouseListener{
		
		public void mousePressed(MouseEvent e)
		{
			
		}
		public void mouseClicked(MouseEvent e)
		{
			
		}
		public void mouseReleased(MouseEvent e)
		{
			
		}
		public void mouseEntered(MouseEvent e)
		{
			
		}
		public void mouseExited(MouseEvent e)
		{
			
		}
		
		
	}
	
	private class MyMouseMotionListener implements MouseMotionListener{
		public void mouseDragged(MouseEvent e) {
		
			
			
		}
		public void mouseMoved(MouseEvent e) {
			
			int mouseX = e.getX();
			int mouseY = e.getY();
			
			setTextLocation(mouseX, mouseY);
		}
	}
	
	private void setTextLocation(int mouseX, int mouseY) {
		
		helloText.setLocation(mouseX, mouseY);
	}
	
	
}
