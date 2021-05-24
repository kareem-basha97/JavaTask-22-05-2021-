package java8;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class LambdaExpressionEvent
{
	public static void main(String[] args) 
	{  
        JTextField tf=new JTextField(); 
        
        tf.setBounds(10,25,36,51); 
        
        JButton b=new JButton("click");
        
        b.setBounds(80,100,70,30);  
          
         
        b.addActionListener(e-> {tf.setText("Tech");
        
        });  
          
        JFrame f=new JFrame();  
        
        f.add(tf);f.add(b);
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        f.setLayout(null); 
        
        f.setSize(300, 200); 
        
        f.setVisible(true);  
  
    }  
  
}
