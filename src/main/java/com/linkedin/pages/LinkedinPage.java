package com.linkedin.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LinkedinPage {

	
	private String emailField = "username";
	private String password = "password";
	private String userEmail = "tutkuayavefe@gmail.com";
	private String userPassword = "***,";
	private String signInButton = "button";
	private String logoMe = "ember35";
	private String viewProfile = "ember37";
	private String addSkill = "ember558";

	

	public LinkedinPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}
	
	
	public String getEmailField() {
		return emailField;
	}
	public String getPasswordField() {
		return password;
	}


	public String getUserEmail() {
		return userEmail;
	}


	public String getUserPassword() {
		return userPassword;
	}
	
	public String getSignInButton() {
		return signInButton;
	}


	public String getLogoMe() {
		return logoMe;
	}


	public String getViewProfile() {
		return viewProfile;
	}
	

	public String getAddSkill() {
		return addSkill;
	}

	
}
