package com.createiq.tasks;

public class City
{
 public String name;
  public long population;
  
  public void display()
  {
    System.out.println("City name: " +name);
    System.out.println("Population: " +population);
  }
  public static void main(String args[])
  {
   
    City metro1,metro2;
   
    metro1 = new City();
    metro2 = new City();
    metro1.name ="Delhi";
    metro1.population = 10000000;
    System.out.println("Details of metro city 1:");
    metro1.display(); //display() method is being invoked for the object metro1
    metro2.name ="Bangalore";
    metro2.population = 5000000;
    System.out.println("Details of metro city 2:");
    metro2.display(); //display() method is being invoked for the object metro2
  }
}
