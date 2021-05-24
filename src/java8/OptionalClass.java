package java8;

import java.util.Optional;

public class OptionalClass
{
	 public static void main(String[] args)
	 {  
	        String[] str = new String[10];  
	        
	        str[5] = "Java Dev";  
	        
	        Optional<String> checkNull = Optional.ofNullable(str[2]);
	        
	        if(checkNull.isPresent())
	        {  
	            String lowercaseString = str[2].toLowerCase();  
	            
	            System.out.print(lowercaseString); 
	            
	        }
	        else
	        	
	            System.out.println("String value is not present");  
	    }  
}
