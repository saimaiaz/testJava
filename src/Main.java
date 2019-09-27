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
            	try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    ex.printStackTrace();
                }

                JFrame frame = new JFrame("PHP CRUD Generate");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(new Layout());
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
	
	
	
	public static void print(String msg) {
		// TODO Auto-generated method stub
		System.out.println(msg);
		
	}

}
