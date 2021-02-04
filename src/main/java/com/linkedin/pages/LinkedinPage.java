package com.linkedin.pages;

import org.openqa.selenium.WebDriver;

public class LinkedinPage {

	private String emailField = "username";
	private String password = "password";
	private String userEmail = "testemailforautomationcases@gmail.com";
	private String userPassword = "Testautomationcases159.";
	private String signInButton = "//button[contains(@data-litms-control-urn,'login-submit')]";
	private String logoMe = "ember35";
	private String viewProfile = "//a[contains(.,'View Profile')]";
	private String addSkill = "//a[contains(@data-control-name,'edit_skills_add')]";
	private String addSkillInput = "//input[contains(@aria-label,'Skill (ex: Data Analysis)')]";
	private String addButton = "//button[@class='artdeco-button ml2 fr ember-view'][contains(.,'Add')]";
	private String skiilYouWantToAdd = "Linkedin add skill";
	private String addedSkill = "//span[contains(.,'Linkedin add skill')]";
	
	

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

	public String getAddSkillInput() {
		return addSkillInput;

	}

	public String getAddButton() {
		return addButton;
	}

	public String getSkiilYouWantToAdd() {
		return skiilYouWantToAdd;
	}
	
	public String getAddedSkill() {
		return addedSkill;
	}
}
