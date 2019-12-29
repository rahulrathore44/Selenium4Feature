package com.automation.selenium4;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
* rathr1
* 
**/
public class BrowserTest {
	@Test
	public void testChromeBrowser(){
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		if(driver != null)
			driver.quit();
	}
	
	@Test
	public void testFirefoxBrowser(){
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com");
		
		if(driver != null)
			driver.quit();
	}

}
