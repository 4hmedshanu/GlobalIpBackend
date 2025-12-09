package com.ipintelligence.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthRequest {

    @Email
    @NotBlank
    private String email;

    @NotBlank
    @Size(min = 8)
    private String password;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public AuthRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AuthRequest(@Email @NotBlank String email, @NotBlank @Size(min = 8) String password) {
		super();
		this.email = email;
		this.password = password;
	}
    
    
    
}
