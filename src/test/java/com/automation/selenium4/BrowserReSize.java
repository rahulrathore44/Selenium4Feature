package com.automation.selenium4;
/**
* rathr1
* 
**/

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserReSize {
	
	private WebDriver driver;
	
	@Before
	public void setup(){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@After
	public void teardown() {
		if(driver != null)
			driver.quit();
	}
	
	@Test
	public void testBrowserReSize(){
		driver.get("http://localhost:80/");
		driver.manage().window().fullscreen();
		driver.manage().window().maximize();
	}

}
