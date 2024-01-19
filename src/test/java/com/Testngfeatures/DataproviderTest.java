package com.Testngfeatures;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderTest {
	@Test(dataProvider = "loginValue")
	public void loginParameter(String uName, String pwd) {
		System.out.println("Enter user name is :-" + uName);
		System.out.println("Enter password is :-" + pwd);
	}

	@DataProvider
	private Object[][] loginValue() {
		
		return new Object[][] {{"aaa","123"},{"bbb","345"}};

	}
}
