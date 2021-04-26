package objects;

public class Student{
	
			 int rollno;
			 String name;  
			 String city; 
			 
			 Student(int rollno,String name,String city)
			 {
				 this.rollno=rollno;
				 this.name=name;
				 this.city=city;
			 }
	 
			 @Override
			public String toString() {//overriding the toString() method
			return rollno+" "+name+" "+city;
			 }

			public static void main(String[] args) {
				Student s1=new Student(100,"sandeep","WGL");
				Student s2=new Student(102, "sai", "HNK");
				System.out.println(s1);
				System.out.println(s2);
			}
			  
	}


