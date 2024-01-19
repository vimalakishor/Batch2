package com.Testngfeatures;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest {
  @Test
  @Parameters({"uName","pwd"})
  
  public void login(String uName, String pwd) {
	  System.out.println("Enter user name is :-"+uName);
	  System.out.println("Enter password is :-"+pwd);
  }
}
