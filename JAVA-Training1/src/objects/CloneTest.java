package objects;

public class CloneTest {
	
	public static void main(String[] args) {
		Name name= new Name();
		name.setFname("Balaji");
		name.setLname("G");
		
		User user = new User();
		user.setUid(1);
		user.setName(name);
		user.setEmail("balajig8086@gmail.com");
		
		System.out.println("User : "+user);
		System.out.println("Name : "+user.getName());
		
		try {
			User cloneUser = (User) user.clone();
			System.out.println("Clone User : "+cloneUser);
			System.out.println("Clone Name : "+cloneUser.getName());
		} catch (CloneNotSupportedException e) {

			e.printStackTrace();
		}
		
		}

}

