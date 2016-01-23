package com.pomlearning.www.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pomlearning.www.util.ConstantsXpath;

public class ProfilePage {

	WebDriver driver;
	@FindBy(xpath=ConstantsXpath.friendsLink)
	WebElement friendsLink;
	
	public ProfilePage(WebDriver dr) {
		driver = dr;
	}
	
	public FriendList loadFriendsList(){
		friendsLink.click();
		return PageFactory.initElements(driver, FriendList.class);
	}
}
