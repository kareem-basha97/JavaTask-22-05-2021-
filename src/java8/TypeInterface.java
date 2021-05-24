package java8;


class GenericClass<X>
{  
      X name;  
    public void setName(X name)
    {  
        this.name = name;  
      }  
    public X getName()
    {  
        return name;  
      }  
    public String genericMethod(GenericClass<String> x)
    {  
        x.setName("Tech"); 
        
        return x.name;  
      }  
}  
  
public class TypeInterface 
{  
    public static void main(String[] args) 
    {  
        GenericClass<String> genericClass = new GenericClass<String>();  
        
        genericClass.setName("QA");
        
        System.out.println(genericClass.getName());  
          
        GenericClass<String> genericClass2 = new GenericClass<>(); 
        
        genericClass2.setName("Dev");  
        
        System.out.println(genericClass2.getName());  
      
  
        System.out.println(genericClass2.genericMethod(new GenericClass<>()));  
    }  
}
