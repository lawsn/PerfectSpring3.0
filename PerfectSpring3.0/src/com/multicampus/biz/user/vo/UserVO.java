package com.multicampus.biz.user.vo;

public class UserVO {

	private String id;
	
	private String password;
	
	private String name;
	
	private String role;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	public String toString() {
		
		return String.format("UserVO [id=%s, name=%s, password=%s, role=%s]", id, name, password, role);
	}
	
}
