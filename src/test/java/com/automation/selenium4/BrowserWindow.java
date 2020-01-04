package com.automation.selenium4;
/**
* rathr1
* 
**/

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindow {
	
	private WebDriver driver;
	
	@Before
	public void steup(){
		WebDriverManager.chromedriver().setup();
		driver = new FirefoxDriver();
	}
	
	@After
	public void teardown(){
		if(driver != null)
			driver.quit();
	}
	
	@Test
	public void testBrowserWindow(){
		driver.get("https://www.google.com");
		driver.switchTo().newWindow(WindowType.TAB); // new tab in the same browser window
		driver.get("https://www.youtube.com");
		driver.switchTo().newWindow(WindowType.WINDOW); // new browser window
		driver.get("https://www.gmail.com");
	}

}
