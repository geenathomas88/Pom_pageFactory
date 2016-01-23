package com.pomlearning.www.util;

public class ConstantsXpath {
	//Login page
	public static final String username = "//*[@id='email']";
	public static final String password = "//*[@id='pass']";
	
	//Landing Page
	public static final String profileNameLink = "//div[@id='userNav']/ul/li[1]/a";
	//Profile
	public static final String friendsLink = "//div[@id='fbTimelineHeadline']/div[2]/div/div/a[3]";
	//friendslist
	public static final String friendSearchbox = "//input[@placeholder='Search for your friends']";
	
	//SettingsPage
	public static final String editPasswordLink = "//*[@id='SettingsPage_Content']/ul/li[4]/a";
	public static final String oldPassword = "//*[@id='password_old']";
	public static final String newPassword = "//*[@id='password_new']";
	public static final String retypePassword="//*[@id='password_confirm']";
	
	//Top Menu
	public static final String topmenuDropdown = "//*[@id='userNavigationLabel']";
	public static final String settingLink = "//*[@class='uiScrollableAreaContent']/ul/li[11]";
	public static final String logoutLink = "//*[@class='uiScrollableAreaContent']/ul/li[12]";
	
	//links
	
	
	
	
}
