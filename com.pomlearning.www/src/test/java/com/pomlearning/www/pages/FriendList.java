package com.pomlearning.www.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.pomlearning.www.util.ConstantsXpath;

public class FriendList {

	WebDriver driver;
	
	@FindBy(xpath=ConstantsXpath.friendSearchbox)
	WebElement searchBox;
		
	public FriendList(WebDriver dr) {
		dr= driver;
	}

	public boolean findAFriend(String friendName){
		searchBox.sendKeys(friendName);
		if(driver.findElements(By.linkText(friendName)).size() > 0)
			return true;
		else
			return false;		
	}
}
