package java8;

interface Methodref
{  
    void question();
}  
public class MethodReference 
{
	 public static void ask()
	 {  
	        System.out.println("static method");  
	    }  
	    public static void main(String[] args) {  
	        
	        Methodref methodref = MethodReference::ask;  
	        
	        methodref.question();  
	    }  
}