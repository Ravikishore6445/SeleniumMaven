package com.kishore.SeleniumMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTitle {
	
	@Test
	public void test123()
	{
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
		Assert.assertTrue(driver.getTitle().contains("Gmail"));
		System.out.println("testing");
		//driver.close();
		driver.quit();
		
		
	}

}
