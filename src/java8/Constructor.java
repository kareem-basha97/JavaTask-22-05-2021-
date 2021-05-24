package java8;

interface ValueAdd
{  
    Data getMessage(String add);  
}  
class Data
{  
    Data(String data)
    {  
        System.out.print(data);  
    }  
}  
public class Constructor
{  
    public static void main(String[] args)
    {  
    	ValueAdd hello = Data::new;  
        
        hello.getMessage("Hello");  
    }  
}  

