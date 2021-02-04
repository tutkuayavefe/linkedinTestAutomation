package com.linkedin.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.linkedin.base.BaseTest;
import com.linkedin.pages.LinkedinPage;

import net.bytebuddy.dynamic.scaffold.MethodGraph.Linked;

public class AddSkillTest extends BaseTest {

	LinkedinPage linkedinPage;


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

		WebElement signInButton = driver.findElement(By.xpath(linkedinPage.getSignInButton()));

		if (signInButton.isDisplayed()) {
			signInButton.click();

		}

	}

	@Test(priority = 2)
	public void navigationToProfile() throws InterruptedException {
		loginToLinkedinWithExistAccount();
		linkedinPage = new LinkedinPage(driver);

		Thread.sleep(1000);

		WebElement logoMe = driver.findElement(By.id(linkedinPage.getLogoMe()));
		logoMe.click();

		WebElement viewProfile = driver.findElement(By.xpath(linkedinPage.getViewProfile()));

		if (viewProfile.isDisplayed()) {
			viewProfile.click();

		}

	}

	@Test(priority = 3)
	public void scrollDownToAddSkillArea() throws InterruptedException {
		navigationToProfile();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(1000);

		WebElement addSkill = driver.findElement(By.xpath(linkedinPage.getAddSkill()));
		if (addSkill.isDisplayed()) {
			addSkill.click();

		}

	}

	@Test(priority = 4)

	public void addingSkill() throws InterruptedException {
		scrollDownToAddSkillArea();
		WebElement addSkill = driver.findElement(By.xpath(linkedinPage.getAddSkill()));
		addSkill.click();
		Thread.sleep(1000);

		WebElement addSkillInput = driver.findElement(By.xpath(linkedinPage.getAddSkillInput()));
		addSkillInput.click();
		addSkillInput.sendKeys(linkedinPage.getSkiilYouWantToAdd());
		addSkillInput.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement addSkillButton = driver.findElement(By.xpath(linkedinPage.getAddButton()));
		addSkillButton.click();

		WebElement addedSkill = driver.findElement(By.xpath(linkedinPage.getAddedSkill()));
		if(addedSkill.isDisplayed()) {
			System.out.println("Done!!!");
		}
	}

}
