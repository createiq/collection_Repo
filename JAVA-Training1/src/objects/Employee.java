package objects;

public class Employee implements Comparable<Employee> {
	int empid;
	String ename;

	public Employee(int empid, String ename) {
		super();
		this.empid = empid;
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + "]";
	}

	@Override
	public int hashCode() // here we are write our own logic
	{
		return empid + ename.hashCode();
	}

	@Override
	public boolean equals(Object obj)// here we are write our own equals logic
	{
		try {
			Employee e = (Employee) obj;
			if (this.empid == e.empid && this.ename.equals(e.ename)) {
				return true;
			}
		} catch (Exception e) {
			return false;
		}
		return false;

	}

	@Override
	public int compareTo(Employee o) {
		return this.empid - o.empid;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
	
	
}
