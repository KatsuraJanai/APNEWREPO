package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Role {

	
	@Id
	@Column(name = "role_id")
	private int roleID;
	@Column(name = "role_name")
	private String roleName;
	
	
	
	
	public Role() {
		super();
		this.roleID = 0;
		this.roleName = "";
	}

	public Role(int roleID, String roleName) {
		super();
		this.roleID = roleID;
		this.roleName = roleName;
	}
	
	public int getRoleID() {
		return roleID;
	}
	public void setRoleID(int roleID) {
		this.roleID = roleID;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	
	
	
	
}
