package com.user.entity;

public class JwtResponse {
	
	private String jwtToken;
	private String username;
	private String role;
	private Long id;
	
	public JwtResponse(String jwtToken, String username, String role,Long id) {
		super();
		this.jwtToken = jwtToken;
		this.username = username;
		this.role = role;
		this.id=id;
	}
	
	public JwtResponse() {
		super();
	}
	
	public String getJwtToken() {
		return jwtToken;
	}
	public void setJwtToken(String jwtToken) {
		this.jwtToken = jwtToken;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
