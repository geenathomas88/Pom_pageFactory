package com.pomlearning.www.testcases;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pomlearning.www.pages.FriendList;
import com.pomlearning.www.pages.LandingPage;
import com.pomlearning.www.pages.LoginPage;
import com.pomlearning.www.pages.ProfilePage;
import com.pomlearning.www.util.TestUtil;
import com.pomlearning.www.util.Xls_Reader;

public class FindFriend {
	WebDriver driver = null;
	@BeforeTest
	public void checkRunmode(){
		Properties CONFIG = new Properties();
		FileInputStream fis;
		try {
			fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\pomlearning\\www\\config\\config.properties");
			CONFIG.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		 if(CONFIG.getProperty("browser").equals("Mozilla"))
			 driver = new FirefoxDriver();
		 else if(CONFIG.getProperty("browser").equals("chrome")){
				System.setProperty("webdriver.chrome.driver", "C:/Learn/Selenium/chromedriver.exe");
				driver = new ChromeDriver();
			}
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir")+"\\src\\test\\java\\com\\pomlearning\\www\\data\\Test Cases.xlsx");
		 if (!TestUtil.isExecutable("Logintest", xls)) {
			throw new SkipException("Skipping the test");
		 }	
	}
	@Test
	public void testFindFriend(){
		Logger log = Logger.getLogger("facebook");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		LandingPage landingPage = loginPage.doLogin("", "");
		log.debug("Logged in");
		ProfilePage profilePage = landingPage.gotoProfile();
		log.debug("In Profile page");
		FriendList friendList = profilePage.loadFriendsList();
		log.debug("Loaded friendslist");
		boolean b = friendList.findAFriend("Maria Peter");
		if(b)
			System.out.println("Found");
		else
			System.out.println("Friend Not Found");
	}
}
