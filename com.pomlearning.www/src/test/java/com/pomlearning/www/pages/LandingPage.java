package com.pomlearning.www.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pomlearning.www.util.ConstantsXpath;

public class LandingPage {

	WebDriver driver;
	
	@FindBy(xpath=ConstantsXpath.profileNameLink)
	public WebElement profileNameLink;
	
	public LandingPage(WebDriver dr) {
		driver = dr;
	}
	@Test
	public ProfilePage gotoProfile(){
		profileNameLink.click();
		return PageFactory.initElements(driver, ProfilePage.class);
	}
}
