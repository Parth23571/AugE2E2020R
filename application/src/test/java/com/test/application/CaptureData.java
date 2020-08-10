package com.test.application;
//10
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CaptureData {
  @Test
  public void f1() {
	try
	{
	String getText=LaunchApp.driver.findElement(By.xpath("//tbody//tr[2]//td[2]")).getText();
System.out.println(getText);	
	}
	
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	
	}
}
