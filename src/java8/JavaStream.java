package java8;

import java.util.ArrayList;

class Vehicle
{  
    int id;  
    
    String name;  
    
    float price;  
    
    public Vehicle(int id, String name, float price)
    {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class JavaStream
{  
    public static void main(String[] args) 
    {  
       java.util. List<Vehicle> vehicleList = new ArrayList<Vehicle>(); 
       
       vehicleList.add(new Vehicle(1,"slpender",45000f));  
       
       vehicleList.add(new Vehicle(2,"Honda",90000f));  
       
       vehicleList.add(new Vehicle(3,"FZ",100000f));  
        
        java.util.List<Float> productPriceList = new ArrayList<Float>();  
        
        for(Vehicle product: vehicleList)
        {  
        	
               if(product.price<30000)
            {  
                productPriceList.add(product.price);  
            }  
        }  
        System.out.println(productPriceList);   
}
}
