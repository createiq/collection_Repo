package com.createiq.collections;

public class Role {
 
	private String RoleName;

	public String getRoleName() {
		return RoleName;
	}

	public void setRoleName(String roleName) {
		RoleName = roleName;
	}

	@Override
	public String toString() {
		return "Role [RoleName=" + RoleName + "]";
	}
	
}
