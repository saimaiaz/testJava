import java.awt.FlowLayout;

import javax.swing.*;



public class FormCrud {

	public static void drawJframe() {
		JFrame frame = new JFrame("JFrame Example");
		  
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
  
        JLabel label = new JLabel("This is a label!");
        panel.add(label);
  
        JButton button = new JButton();
        button.setText("Press me");
        panel.add(button);
        
        JTextField t1,t2;  
        t1=new JTextField(5);  
        t1.setBounds(0,0, 200,30);  
        t2=new JTextField(5);  
        t2.setBounds(100,100, 200,30);  
        
        panel.add(t1); panel.add(t2);  
  
        frame.add(panel);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
	}
	
	public static void testframe() {
		// create a new frame 
		JFrame f = new JFrame("frame"); 
  
        // create a panel 
        JPanel p1 = new JPanel(); 
        JPanel p = new JPanel(); 
  
        // create text areas 
        JTextField t1 = new JTextField(10); 
        JTextField t2 = new JTextField(10); 
  
        // set texts 
//        t1.setText("this is first text area"); 
//        t2.setText("this is second text area"); 
  
        // add text area to panel 
        p1.add(t1); 
        p.add(t2); 
  
        // create a splitpane 
        JSplitPane sl = new JSplitPane(SwingConstants.HORIZONTAL, p1, p); 
  
        // add panel 
        f.add(sl); 
  
        // set the size of frame 
        f.setSize(300, 300); 
  
      
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
	}
	
}
