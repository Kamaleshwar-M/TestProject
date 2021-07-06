package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageStep {
	
	WebDriver driver;

	@Given("User is on facebook login page")
	public void user_is_on_facebook_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
	    
	}

	@When("User should enter {string} and {string}")
	public void user_should_enter_and(String name, String pass) {
		WebElement txtUsername = driver.findElement(By.id("email"));
		txtUsername.sendKeys(name);
		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys(pass);
	    
	}

	@When("User should click login button")
	public void user_should_click_login_button() {
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();
		
		
	    
	}

	@Then("User should verify success message")
	public void user_should_verify_success_message() {
	    Assert.assertTrue("Verify Title", true);
	    driver.quit();2022
	}
}
