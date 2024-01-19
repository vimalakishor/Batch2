package com.Testngfeatures;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class SimpleAnnotationTest { //groupsOfMethods
  @Test(groups = "main")
  public void f() {
	  System.out.println("Main Test1");
  }
  @Test(groups = "main")
  public void f1() {
	  System.out.println("Main Test2");
  }
  @Test(groups = "before")
  public void beforeMethod() {
	  System.out.println("B.Method");
  }

  @Test(groups = "after")
  public void afterMethod() {
	  System.out.println("A.Method");
  }

  @Test(groups = "before")
  public void beforeClass() {
	  System.out.println("B.Class");
  }

  @Test(groups = "after")
  public void afterClass() {
	  System.out.println("A.Class");
  }

  @Test(groups = "before")
  public void beforeTest() {
	  System.out.println("B.Test");
  }

  @Test(groups = "after")
  public void afterTest() {
	  System.out.println("A.Test");
  }

  @Test(groups = "before")
  public void beforeSuite() {
	  System.out.println("B.Suite");
  }

  @Test(groups = "after")
  public void afterSuite() {
	  System.out.println("A.Suite");
  }
  

}
