package com.pomlearning.www.testcases;

import com.pomlearning.www.util.TestUtil;
import com.pomlearning.www.util.Xls_Reader;

public class Test {

	public static void main(String[] args) {
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir")+"\\src\\test\\java\\com\\pomlearning\\www\\data\\Test Cases.xlsx");
		
		
		System.out.println(TestUtil.isExecutable("Test2",xls));
	}
}
