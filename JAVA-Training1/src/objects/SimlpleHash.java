package objects;

public class SimlpleHash {

	public static void main(String[] args) {
		String s1 = new String("Kishore");
		String s2 = new String("Kishore");
		String s3 = "Krishna";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		  Employee e1 = new Employee(100, "Kishore");
          
          Employee e2 = new Employee(101, "Kishore");
          
          Employee e3 = new Employee(101, "Krishna");
          
          Employee e4=e2;
          
          /*System.out.println(e1.hashCode());
          System.out.println(e2.hashCode());
          System.out.println(e3.hashCode());
          
          System.out.println(e1);
          System.out.println(e2);      */   
          
        System.out.println(e1 == e2);
        System.out.println(e1 == e3);
        System.out.println(e4 == e2);
        
//        
//       System.out.println(e1.equals(e2));
//       System.out.println(e1.equals(e3));
//       System.out.println(e1.hashCode());
//       System.out.println(e3.hashCode());
//       System.out.println(e4.equals(e2));
//       Employee e5 = null;
//       
//       System.out.println(e1.equals(e5));		
	}

}
