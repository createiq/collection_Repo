package StringDemoExp;

public class CreateString {

	public static void main(String[] args) {
	String s1="Sandeep";
	char c[]= {'S','a','n','d','e','e','p'};
	String s2=new String(c);
	String s3=new String("Sandeep");
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	System.out.println(s3.hashCode());
	}
}
