package com.ipintelligence.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthResponse {
    private String accessToken;
    private Integer id;
    private String username;
    private String email;
    private String role;
	public AuthResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public AuthResponse(String accessToken, Integer id, String username, String email, String role) {
		super();
		this.accessToken = accessToken;
		this.id = id;
		this.username = username;
		this.email = email;
		this.role = role;
	}
    
    
    
    
}
