package com.test.application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LaunchApp {
	WebDriver driver = null;

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumTraining1\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@Test
	public void f() {
		try {
			driver.get("file:///E:/SeleniumTraining1/TestingApp.html");
			driver.manage().window().maximize();
			driver.findElement(By.id("UN")).sendKeys("Automation");
			Thread.sleep(2000);
			driver.findElement(By.partialLinkText("Tutorial")).click();
			Thread.sleep(2000);
System.out.println( "---WelCome ---" + driver.getTitle() );
		}

		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@AfterTest
	public void afterTest()
	{
		driver.quit();
	}
}
