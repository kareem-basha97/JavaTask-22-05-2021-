package java8;

import java.util.StringJoiner;

public class StringJoin
{
	 public static void main(String[] args) 
	 {  
	        StringJoiner join = new StringJoiner(",");    
	          
	         
	        join.add("Tech");  
	        
	        join.add("Dev");  
	        
	        join.add("QA");   
	                  
	        System.out.println(join);  
	    }  
}
