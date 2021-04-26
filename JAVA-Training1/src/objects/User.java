package objects;
	public class User implements Cloneable{

		private int uid;
		private Name name;
		private String email;

		public User(int uid, Name name, String email) {
			super();
			this.uid = uid;
			this.name = name;
			this.email = email;
		}

		public User() {
			super();
			// TODO Auto-generated constructor stub
		}

		public int getUid() {
			return uid;
		}

		public void setUid(int uid) {
			this.uid = uid;
		}

		public Name getName() {
			return name;
		}

		public void setName(Name name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
		
		@Override
		public Object clone() throws CloneNotSupportedException {
			
			User cloneUser = (User) super.clone();
			Name name = (Name) cloneUser.name.clone();
			cloneUser.setName(name);
			return cloneUser;
		}

	}


