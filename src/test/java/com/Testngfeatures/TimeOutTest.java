package com.Testngfeatures;

import org.testng.annotations.Test;

public class TimeOutTest { //Expected Exception
  @Test(expectedExceptions = NullPointerException.class)
  public void f() throws InterruptedException {
	  String pswdField =null;
	  System.out.println(pswdField.length());
  }
}
