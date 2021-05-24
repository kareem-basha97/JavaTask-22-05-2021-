package java8;

interface Teaching{    
    
    default void say()
    {    
        System.out.println(" default method");    
    }    
      
    void sayMore(String msg);    
     
    static void sayLouder(String msg)
    {    
        System.out.println(msg);    
    }    
}    
public class DefaultMethod implements Teaching
{    
    public void sayMore(String msg)
    {    
        System.out.println(msg);    
    }    
    public static void main(String[] args) 
    {    
        DefaultMethod dm = new DefaultMethod();  
        
        dm.say();   
        
        dm.sayMore("data "); 
        
        Teaching.sayLouder("good");      
    }    
}    

