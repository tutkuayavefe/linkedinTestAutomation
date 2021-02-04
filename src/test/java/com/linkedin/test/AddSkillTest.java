package com.linkedin.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.linkedin.base.BaseTest;
import com.linkedin.pages.LinkedinPage;

public class AddSkillTest extends BaseTest {

	LinkedinPage linkedinPage;

//	@Test(priority = 1)
//	public void  navigationToLinkedin() {
//		// This test case to verify if navigation is correct or not
//		System.out.println("Linkedin page opened. Test passed!");
//		String title = driver.getTitle();
//		System.out.println(title);
//		Assert.assertEquals(title, "Linkedin");
//	}

	@Test(priority = 1)
	public void loginToLinkedinWithExistAccount() {
		// This test is to verify that
		linkedinPage = new LinkedinPage(driver);

		WebElement emailField = driver.findElement(By.id(linkedinPage.getEmailField()));
		emailField.click();
		emailField.sendKeys(linkedinPage.getUserEmail());

		WebElement passwordField = driver.findElement(By.id(linkedinPage.getPasswordField()));
		passwordField.click();
		passwordField.sendKeys(linkedinPage.getUserPassword());

		WebElement signInButton = driver.findElement(By.xpath("//*[contains(text(), 'Oturum açın')]"));

		// driver.findElement(By.xpath("//input[@type='submit']"));

		signInButton.click();
		
	}

	@Test(priority = 2)
	public void navigationToProfile() {
		loginToLinkedinWithExistAccount();
		linkedinPage = new LinkedinPage(driver);

		WebElement logoMe = driver.findElement(By.id(linkedinPage.getLogoMe()));
		logoMe.click();
		
		WebElement viewProfile = driver.findElement(By.xpath("//*[contains(text(), 'View Profile')]"));

		viewProfile.click();
		
	//	WebElement addSkillButtonText = driver.findElement(By.id(linkedinPage.getAddSkill()));
		//addSkillButtonText.sendKeys(Keys.DOWN);
	
        JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,5000)");
		
	}

}
