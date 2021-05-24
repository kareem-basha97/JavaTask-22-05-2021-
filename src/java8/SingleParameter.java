package java8;

interface SingleParameter
{  
    public String ask(String name); 
}  
  
 class LamdaExpressions 
 {
	 public static void main(String[] args) 
	 {  
	       
	        SingleParameter s1=(name)->
	        {  
	            return "Tech, "+name;  
	        };  
	        System.out.println(s1.ask("Dev"));  
	            
	        SingleParameter s2= name ->
	        {  
	            return "Tech, "+name;  
	        };  
	        System.out.println(s2.ask("Dev"));  
	 }
	
}
