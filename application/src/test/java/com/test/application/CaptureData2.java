package com.test.application;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CaptureData2 {
  @Test
  public void f2() {
	try
	{
	String getText=LaunchApp.driver.findElement(By.xpath("//tbody//tr[4]//td[1]")).getText();
System.out.println("Added Later :"+getText);	
	}
	
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	
	}
}
