package com.Testngfeatures;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTest {
  @Test
  public void browserLaunch1() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver1 = new ChromeDriver();
	  driver1.manage().window().maximize();
  }
  @Test
  public void browserLaunch2() {
	  WebDriverManager.edgedriver().setup();
	  WebDriver driver = new EdgeDriver();
	  driver.manage().window().maximize();
  }
}
