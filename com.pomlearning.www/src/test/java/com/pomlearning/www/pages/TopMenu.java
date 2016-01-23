package com.pomlearning.www.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pomlearning.www.util.ConstantsXpath;

public class TopMenu {

	WebDriver driver;
	
	@FindBy(xpath=ConstantsXpath.topmenuDropdown)
	WebElement topmenuDropdown;
	
	@FindBy(xpath=ConstantsXpath.settingLink)
	WebElement settingLink;
	
	@FindBy(xpath=ConstantsXpath.logoutLink)
	WebElement logoutLink;
	
	public TopMenu(WebDriver dr) {
		driver = dr;;
	}
	public SettingsPage gotoSettings(){
		topmenuDropdown.click();
		settingLink.click();
		return PageFactory.initElements(driver, SettingsPage.class);
	}
	public void logout(){
		topmenuDropdown.click();
		logoutLink.click();
	}
}
