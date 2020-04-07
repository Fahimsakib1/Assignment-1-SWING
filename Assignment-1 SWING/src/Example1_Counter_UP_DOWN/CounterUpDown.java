package Example1_Counter_UP_DOWN;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class CounterUpDown extends JFrame 

{
	
private JLabel LabelCount;  // Declare a Label component
private JTextField TextFieldCount;  // Declare a TextField component
private JButton ButtonCount,ButtonReset;  // Declare a Button component
private int count = 0;  // Counter's value


 public CounterUpDown() 
 
 {  
	 
	Container cp = getContentPane();
	
    cp.setLayout(new GridLayout(3,3));
     
	setLayout(new FlowLayout());
	
	LabelCount = new JLabel("Counter");
	add(LabelCount); 

	TextFieldCount = new JTextField(10); 
									
	TextFieldCount.setEditable(false); 
	add(TextFieldCount); 

	
	
	
	ButtonCount = new JButton("COUNT UP");
	add(ButtonCount); 

	ButtonCount.addActionListener(new ActionListener()
	{
			@Override
			public void actionPerformed(ActionEvent evt)
			
			{
				
		    count=count+1; // Decrease the counter value
		    TextFieldCount.setText(count + "");
		    
	        }
			
	}
	
	);
	
	
	ButtonCount = new JButton("COUNT DOWN");
	add(ButtonCount); 

	ButtonCount.addActionListener(new ActionListener()
	{
			@Override
			public void actionPerformed(ActionEvent evt)
			
			{
				
		    count=count-1; // Decrease the counter value
		    TextFieldCount.setText(count + "");
		    
	        }
			
	}
	
	);
	
	
	
	ButtonReset = new JButton("RESET");
    add(ButtonReset);                                
    ButtonReset.addActionListener(new ActionListener() 
    {
       @Override
       public void actionPerformed(ActionEvent evt) 
       {
           TextFieldCount.setText(" Please Start");
          
           
       }
    }
    
    );
    
	setVisible(true);

}

  public static void main(String[] args) 
  
{

	CounterUpDown frame = new CounterUpDown();
	frame.setBounds(300, 300, 500, 300);
	frame.setTitle(" Feame For Counter Up And Counter Down");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
}
	

}
