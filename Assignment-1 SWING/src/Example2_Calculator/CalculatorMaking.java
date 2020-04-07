package Example2_Calculator;

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;

    
    public class CalculatorMaking extends JFrame 
    
    {
	private JTextField TextFieldNumber1, TextFieldNumber2, TextFieldResult ;
	private JButton ButtonAdd, ButtonSub, ButtonMul, ButtonDiv, ButtonMod, ButtonClear ;
	private float number1, number2,result ;

	
	public CalculatorMaking() 
	{
      
      Container cp = getContentPane();
      cp.setLayout(new GridLayout(6, 2, 10, 10));//calculator row collum er jonno
     
         
      cp.add(new JLabel(" Number 1  : ")); 
      TextFieldNumber1 = new JTextField(20);
      TextFieldNumber1.setHorizontalAlignment(JTextField.RIGHT);
      cp.add(TextFieldNumber1);  
      
     
      cp.add(new JLabel(" Number 2  : "));
      TextFieldNumber2 = new JTextField(20);
      TextFieldNumber2.setHorizontalAlignment(JTextField.RIGHT);
      cp.add(TextFieldNumber2);
      
      
      cp.add(new JLabel(" Result  : "));
      TextFieldResult = new JTextField(20);
      TextFieldResult.setHorizontalAlignment(JTextField.RIGHT);
      TextFieldResult.setEditable(false);
      cp.add(TextFieldResult);
   
 
      ButtonAdd = new JButton(" ADD ");
      cp.add(ButtonAdd);    
      ButtonAdd.addActionListener(new ActionListener()
      {
         @Override
         public void actionPerformed(ActionEvent evt) 
         {
             number1 = Float.parseFloat(TextFieldNumber1.getText());
             number2 = Float.parseFloat(TextFieldNumber2.getText());
             result = number1+number2;
             TextFieldResult.setText(result + "");
            
         }
         
      }
      
      );
      
      
      ButtonSub = new JButton(" SUBTRACT ");
      cp.add(ButtonSub);    
      ButtonSub.addActionListener(new ActionListener()
      {
         @Override
         public void actionPerformed(ActionEvent evt) 
         {
        	  number1 = Float.parseFloat(TextFieldNumber1.getText());
              number2 = Float.parseFloat(TextFieldNumber2.getText());
              result = number1 - number2;
              TextFieldResult.setText(result + "");
            
         }
      }
      
      );
      
      
      ButtonMul = new JButton(" MULTIPLY ");
      cp.add(ButtonMul);    
      ButtonMul.addActionListener(new ActionListener()
      {
         @Override
         public void actionPerformed(ActionEvent evt) 
         {
        	   number1 = Float.parseFloat(TextFieldNumber1.getText());
               number2 = Float.parseFloat(TextFieldNumber2.getText());
               result = number1 * number2;
               TextFieldResult.setText(result + "");
            
         }
      }
      
      );
      
      
      ButtonDiv = new JButton(" DIVIDE ");
      cp.add(ButtonDiv);    
      ButtonDiv.addActionListener(new ActionListener()
      {
         @Override
         public void actionPerformed(ActionEvent evt) 
         {
        	 number1 = Float.parseFloat(TextFieldNumber1.getText());
             number2 = Float.parseFloat(TextFieldNumber2.getText());
             result = number1 / number2;
             TextFieldResult.setText(result + "");
            
         }
         
      }
      
      );
      
      
      ButtonMod = new JButton(" MODULUS ");
      cp.add(ButtonMod);    
      ButtonMod.addActionListener(new ActionListener()
      {
         @Override
         public void actionPerformed(ActionEvent evt) 
         {
        	 number1 = Float.parseFloat(TextFieldNumber1.getText());
             number2 = Float.parseFloat(TextFieldNumber2.getText());
             result = number1 % number2;   // returns the remainder like if we do 5 % 3 then it will give 2 as output because 2 will be the remainder
             TextFieldResult.setText(result + "");
            
         }
         
      }
      
      );
      
     
 
      ButtonClear = new JButton("CLEAR");
      cp.add(ButtonClear);   
      ButtonClear.addActionListener(new ActionListener() 
      {
         @Override
         public void actionPerformed(ActionEvent evt) 
         {
        	 TextFieldNumber1.setText("");
        	 TextFieldNumber2.setText("");
        	 TextFieldResult.setText(""); 
         }
      }
      
      );
 
      //setDefaultCloseOperation(EXIT_ON_CLOSE); // for the "window-close" button
     // setTitle("Swing Adder");
      //setSize(300, 170);
      setVisible(true);
      
   }


	public static void main(String[] args)
	{
	
		javax.swing.SwingUtilities.invokeLater(new Runnable() 
		{
			@Override
			public void run() 
			{
				new CalculatorMaking(); 
			}
		}
		);
		
		CalculatorMaking frame = new CalculatorMaking();
		frame.setBounds(500, 400, 500, 400);
		frame.setTitle(" Calculator ");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}