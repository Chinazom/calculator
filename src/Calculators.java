/**
 * 
 * @author chinazom
 *
 */



import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.BorderLayout;

public class Calculators extends JFrame {
	
	
	

	private static final long serialVersionUID = 1L;
	


public static void main (String[]args) {
	
	// create the frame and set the frame properties
	JFrame calculatorFrame = new JFrame();
	 calculatorFrame.setTitle("Calculator");
	 calculatorFrame.setSize(600, 150);
	 calculatorFrame.setLocation(200,100);
	 calculatorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 calculatorFrame.setVisible(true);
	 calculatorFrame.setBackground(Color.DARK_GRAY);
	 
	 
	 
	 // creates five panels and add the panel to a parent panel
	 JPanel calculatorPanel = new JPanel ();
	 JPanel displayPanel = new JPanel ();
	 JTextField display = new JTextField();
	display.addActionListener(new ActionListener()
     {
         public void actionPerformed(ActionEvent evt)
         {
             String val = ((JButton)evt.getSource()).getText();
             display.setText(display.getText()+val);
         }
     });
	 
	 
	 displayPanel.add(display);
	 
	 //String text=display.getText().toString();
	 //System.out.println(text);
	 
	 
	 displayPanel.setLayout(new GridLayout(5, 2));
	 JPanel numberPanel = new JPanel ();
	 numberPanel.setSize(1000,300);
	 numberPanel.setLayout(new GridLayout(4, 3));
	 JPanel mathsPanel = new JPanel ();
	 mathsPanel.setLayout(new GridLayout(5, 2));
	 JPanel symbolPanel = new JPanel ();
	 symbolPanel.setLayout(new GridLayout(4, 3));
	 calculatorPanel.setLayout(new BorderLayout(20,10));
	 calculatorPanel.add(displayPanel,BorderLayout.NORTH);
	 calculatorPanel.add(numberPanel, BorderLayout.CENTER);
	 calculatorPanel.add(mathsPanel, BorderLayout.EAST);
	 calculatorPanel.add(symbolPanel, BorderLayout.WEST);
	 ButtonGroup buttons = new ButtonGroup();
	 
	 
	 
	
	
	
	// Add buttons to the number panel and get the string value
		  for (int i = 1; i <= 9; i++) {
			  JButton num = new JButton("" + i);
			  //,String.valueOf(i))
			  buttons.add(num);
			  numberPanel.add(num);
			 
			  num.addActionListener(new ActionListener()
			     {
			         public void actionPerformed(ActionEvent evt)
			         {
			        	 String val = ((JButton)evt.getSource()).getText();
			             display.setText(display.getText()+val);
			         }
			     });
		  }
		  
		 JButton zero = new JButton("" + 0);
		 zero.addActionListener(new ActionListener()
	     {
	         public void actionPerformed(ActionEvent evt)
	         {
	        	String val = ((JButton)evt.getSource()).getText();
	            display.setText(display.getText()+val);
	         }
	     });
		 JButton point = new JButton(".");
		point.addActionListener(new ActionListener()
	     {
	         public void actionPerformed(ActionEvent evt)
	         {
	        	
	             String val = ((JButton)evt.getSource()).getText();
	             display.setText(display.getText()+val);
	         }
	     });
		 JButton C =new JButton("C");
		 C.addActionListener(new ActionListener()
	     {
	         public void actionPerformed(ActionEvent evt)
	         {
	        	display.setText("");
	         }
	     });
		 
		  buttons.add(zero);
		  buttons.add(point);
		  buttons.add(C);
		  numberPanel.add(zero);
		  numberPanel.add(point);
		  numberPanel.add(C);
		   
		// Add buttons to the symbol panel
		  JButton division =new JButton("/");
		  division.addActionListener(new ActionListener()
		     {
		         public void actionPerformed(ActionEvent evt)
		         {
		        	
		             String val = ((JButton)evt.getSource()).getText();
		             display.setText(display.getText()+val);
		         }
		     });
		  symbolPanel.add(division);
		  
		  JButton openbracket =new JButton("(");
		  symbolPanel.add(openbracket);
		  openbracket.addActionListener(new ActionListener()
		     {
		         public void actionPerformed(ActionEvent evt)
		         {
		        	
		             String val = ((JButton)evt.getSource()).getText();
		             display.setText(display.getText()+val);
		         }
		     });
		  JButton multiplication = new JButton ("*");
		  multiplication.addActionListener(new ActionListener()
		     {
		         public void actionPerformed(ActionEvent evt)
		         {
		        	
		             String val = ((JButton)evt.getSource()).getText();
		             display.setText(display.getText()+val);
		         }
		     });
		  symbolPanel.add(multiplication);
		  JButton closebracket =new JButton(")");
		  symbolPanel.add(closebracket);
		  closebracket.addActionListener(new ActionListener()
		     {
		         public void actionPerformed(ActionEvent evt)
		         {
		        	
		             String val = ((JButton)evt.getSource()).getText();
		             display.setText(display.getText()+val);
		         }
		     });
		  
		  JButton subtraction =new JButton("-");
		  subtraction.addActionListener(new ActionListener()
		     {
		         public void actionPerformed(ActionEvent evt)
		         {
		        	
		             String val = ((JButton)evt.getSource()).getText();
		             display.setText(display.getText()+val);
		         }
		     });
		  symbolPanel.add(subtraction);
		  JButton addition =new JButton("+");
		  symbolPanel.add(addition);
		  addition.addActionListener(new ActionListener()
		     {
		         public void actionPerformed(ActionEvent evt)
		         {
		        	
		             String val = ((JButton)evt.getSource()).getText();
		             display.setText(display.getText()+val);
		         }
		     });
		  JButton equalTo = new JButton("=");
		  symbolPanel.add(equalTo);
		  equalTo.addActionListener(new ActionListener()
		     {
		         public void actionPerformed(ActionEvent evt)
		         {
		             String val = (display.getText());
		             display.setText("");
		             System.out.println (val);
		         }
		     });
			  
		  JButton Sin = new JButton ("sin");
		  JButton ln = new JButton ("ln");
		  JButton cos = new JButton ("cos");
		  JButton log = new JButton ("log");
		  JButton tan = new JButton ("tan");
		  JButton e = new JButton ("e");
		  JButton pi = new JButton ("pi");
		  JButton raisetoPower = new JButton ("R");
		  JButton factoria = new JButton ("!");
		  JButton squareroot = new JButton ("sq");
		  
		  mathsPanel.add(Sin);
		  mathsPanel.add(ln);
		  mathsPanel.add(cos);
		  mathsPanel.add(log);
		  mathsPanel.add(tan);
		  mathsPanel.add(e);
		  mathsPanel.add(pi);
		  mathsPanel.add(raisetoPower);
		  mathsPanel.add(factoria);
		  mathsPanel.add(squareroot); 
		  calculatorFrame.add(calculatorPanel);
	}
}


