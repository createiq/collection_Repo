package objects;

public class HashCode2 {
	static int count=20;// hash code starts from 20
		public static void main(String[] args) {
			
			
			Employee s1=new Employee(11, "ram");
			System.out.println(s1.hashCode());
			Employee s2=new Employee(19, "michael");
			System.out.println(s2.hashCode());
			Employee s3=new Employee(20, "rajesh");
			System.out.println(s3.hashCode());
			
			HashCode2 h= new HashCode2();
			System.out.println(h.hashCode());
			System.out.println(h.hashCode());
			
		}
		
		public int hashCode() {  //customized hash code generate your own
			      return count++;
				   }
		
	}

