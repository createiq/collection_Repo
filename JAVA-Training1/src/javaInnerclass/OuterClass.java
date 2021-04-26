package javaInnerclass;

public class OuterClass {
	private int id;
	private static int count;

	class InnerClass {
//		private static int count;
		public String greeting;

		InnerClass(String gree) {
			greeting = gree;
		}

		public void disInner() {
System.out.println("greetings:"+greeting);
		}
	}

	public static void main(String args[]) {

	}
}
