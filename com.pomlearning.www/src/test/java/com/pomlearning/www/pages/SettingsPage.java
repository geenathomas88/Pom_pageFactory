package com.pomlearning.www.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.pomlearning.www.util.ConstantsXpath;

public class SettingsPage {

	WebDriver driver;
		
	public SettingsPage(WebDriver dr) {
		driver = dr;
	}

	@FindBy(xpath=ConstantsXpath.editPasswordLink)
	WebElement passwordLink;
	
	@FindBy(xpath = ConstantsXpath.oldPassword)
	WebElement oldPasswordtextbox;
	
	@FindBy(xpath = ConstantsXpath.newPassword)
	WebElement newPasswordtextbox;
	
	@FindBy(xpath = ConstantsXpath.retypePassword)
	WebElement retypePasswordtextbox;
	
	public void editPassword(String oldPass, String newPass){
		passwordLink.click();
		oldPasswordtextbox.sendKeys(oldPass);
		newPasswordtextbox.sendKeys(newPass);
		retypePasswordtextbox.sendKeys(newPass);
		retypePasswordtextbox.sendKeys(Keys.ENTER);
	}
}
