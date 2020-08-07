package com.test.application;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LaunchApp {
	public static WebDriver driver = null;

	@BeforeSuite
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
<<<<<<< HEAD
			System.out.println( "---WelCome To All and Good To see ---" + driver.getTitle() );
=======
			System.out.println( "---WelCome To All and Good To see * ---" + driver.getTitle() );
>>>>>>> branch 'master' of https://github.com/Parth23571/AugE2E2020R
		}

		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@AfterSuite
	public void afterTest()
	{
		driver.quit();
	}
}
