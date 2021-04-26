package objects;
// garbage means unreferenced objects
public class EmployeeGc {
	public EmployeeGc()
	{
		System.out.println("Object Created");
	}
	public void display()
	{
		System.out.println("i am display");
	}

	@Override
	protected void finalize() throws Throwable {
		
		System.out.println("finalize called Object removed...!");
	}
	public static void main(String[] args) {
 EmployeeGc e1=new EmployeeGc();
 EmployeeGc e2=new EmployeeGc();
 EmployeeGc e3=new EmployeeGc();
 e1=null;
 e2=e3;
 new EmployeeGc().display();
// Runtime.getRuntime().gc();
 System.gc();
}

}
