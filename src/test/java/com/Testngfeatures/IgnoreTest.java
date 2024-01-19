package com.Testngfeatures;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreTest { //DependsOnMethod
  @Test
  public void f() {
	  System.out.println("java");
  }
  @Test
  public void f1() {
	  System.out.println("selenium");
  }
  @Test
  @Ignore
  public void f2() {
	  System.out.println("Maven");
  }
  @Test(dependsOnMethods = "f2")
  public void f3() {
	  System.out.println("testNG");
  }
}
