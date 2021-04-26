package objects;

public class Name implements Cloneable{
	
	private String fname;
	private String lname;
	public Name(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}
	public Name() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}



