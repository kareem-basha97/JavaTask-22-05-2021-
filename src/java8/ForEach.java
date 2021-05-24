package java8;

import java.util.ArrayList;

public class ForEach 
{
	    public static void main(String[] args) 
	    {  
	       java.util.List<String> subject = new ArrayList<String>();  
	       
	        subject.add("Tech");  
	        
	        subject.add("Dev");  
	        
	        subject.add("QA");  
	        
	       subject.stream().forEachOrdered(games -> System.out.println(subject));  
	          
	        subject.stream().forEachOrdered(System.out::println);  
	    }  
}

