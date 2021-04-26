package com.createiq.tasks;

public class Person1
{ 
 int unique_id=1122;
 String name = "Rathan";
 static int age = 28;
 static String city="Hyderabad"; 
 static String gender="male";

void eat(){
 System.out.println("food"); 
}
void study()
{
  System.out.println("exam");
}
void play()
{
 System.out.println("game");
}
void sleep()
{
	System.out.println("night");
}
public static void main(String args[])
{
	Person1 p1=new Person1();
	
  System.out.println("Unique Id:" +p1.unique_id);
  System.out.println("Name of the person: " +p1.name);
  System.out.println("Age of the person: " +age);
  System.out.println("City:" +city);
  
  p1.eat();
  p1.play();
  p1.sleep();
  p1.study();
}
}