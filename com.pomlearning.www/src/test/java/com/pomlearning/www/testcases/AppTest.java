package com.pomlearning.www.testcases;

import org.testng.SkipException;
import org.testng.annotations.BeforeTest;

import com.pomlearning.www.util.TestUtil;
import com.pomlearning.www.util.Xls_Reader;

public class AppTest {
	
	@BeforeTest
	public void checkRunmode(){
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir")+"\\src\\test\\java\\com\\pomlearning\\www\\data\\Test Cases.xlsx");
		if (TestUtil.isExecutable("Test1", xls)) {
			throw new SkipException("Skipping the test");
		}	
	}
	public void myTest(){
	   
   }
}
