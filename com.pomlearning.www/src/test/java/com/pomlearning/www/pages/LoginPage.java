package com.pomlearning.www.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pomlearning.www.util.ConstantsXpath;

public class LoginPage {

	public WebDriver driver;
	
	@FindBy(xpath=ConstantsXpath.username)
	public WebElement username;

	@FindBy(xpath="//*[@id='pass']")
	public WebElement password;
	
	public LoginPage(WebDriver dr){
		driver = dr;
	}
	public LandingPage doLogin(String userName, String pass){
		driver.get("http://facebook.com");
		username.sendKeys(userName);
		password.sendKeys(pass);
		password.sendKeys(Keys.ENTER);
		
		LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);
		return landingPage;
	}
}
