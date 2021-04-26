package com.createiq.exceptions;

public class MultipleExceptions3 {

	public static void main(String args[]){    
        try{    
            int array[] = new int[10];    
            array[10] = 30/0; 
            System.out.println(array[9]);
        } 
        //here"already caught by the alternative Exception" don't use parent to child Excep.   
        catch(ArithmeticException|ArrayIndexOutOfBoundsException e)// use child to parent
        {  
            System.out.println(e.getMessage());  
        }    
     }    

}
