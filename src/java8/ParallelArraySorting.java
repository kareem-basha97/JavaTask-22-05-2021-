package java8;

import java.util.Arrays;

public class ParallelArraySorting
{
	public static void main(String[] args) 
	{  
        
        int[] arr1 = {5,8,2,9,7,3,6};  
 
        for (int i : arr1) 
        {  
            System.out.print(i+" ");  
        }  
    
        Arrays.parallelSort(arr1);  
        
        System.out.println("Array elements after sorting");  
  
        for (int i : arr1)
        {  
            System.out.print(i+" ");  
        }  
}
}
