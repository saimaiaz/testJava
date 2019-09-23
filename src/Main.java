import java.awt.*;
import java.io.*;
import javax.swing.*;
 // sdfs bdf

public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */

	public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // your logic here
            	drawJframe();
            }
        });
    }
	
	public static void drawJframe() {
		JFrame frame = new JFrame("JFrame Example");
		  
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
  
        JLabel label = new JLabel("This is a label!");
  
        JButton button = new JButton();
        button.setText("Press me");
  
        panel.add(label);
        panel.add(button);
  
        frame.add(panel);
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
	}
	
	public static void print(String msg) {
		// TODO Auto-generated method stub
		System.out.println(msg);
		
	}

}
