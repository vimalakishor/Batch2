package com.baseclassMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassHRM {
	
	 public static WebDriver driver;
	
	
	private void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	private void urllaunch(String url) {
		driver.get(url);
      
	}
	
	private void sendInput(String inputData,WebElement inputElement) {
		inputElement.sendKeys(inputData);

	}
	
	private void clickElement(WebElement clickelement) {
		clickelement.click();
     
	}
	

}
