package com.cal.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class General extends Global{
	
	public void OpenApplication()
	{
	System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.navigate().to(url);
	System.out.println("Application Opened");
	Reporter.log("Application opened");

	}
	
	public void Multiplication() throws Exception
	{
		driver.findElement(By.xpath(btn_4)).click();
		driver.findElement(By.xpath(btn_2)).click();
		driver.findElement(By.xpath(btn_3)).click();
		driver.findElement(By.xpath(btn_Mul)).click();
		driver.findElement(By.xpath(btn_5)).click();
		driver.findElement(By.xpath(btn_2)).click();
		driver.findElement(By.xpath(btn_5)).click();
		System.out.println("Multiplication :");
		Reporter.log("Multiplication :");
		
		String input = driver.findElement(By.id(inPut)).getText();
		System.out.println(input);
		System.out.println("Multiplication Result");
		Reporter.log("Multiplication Result");
		String output = driver.findElement(By.id(outPut)).getText();
		System.out.println(output);
	
		Thread.sleep(2000);
		driver.close();
	}

	public void Division() throws Exception 
	{
		driver.findElement(By.xpath(btn_4)).click();
		driver.findElement(By.xpath(btn_0)).click();
		driver.findElement(By.xpath(btn_0)).click();
		driver.findElement(By.xpath(btn_0)).click();
		driver.findElement(By.xpath(btn_Div)).click();
		driver.findElement(By.xpath(btn_2)).click(); 
		driver.findElement(By.xpath(btn_0)).click();
		driver.findElement(By.xpath(btn_0)).click();
		System.out.println("Division :");
		Reporter.log("Division :");
		
		String input = driver.findElement(By.id(inPut)).getText();
		System.out.println(input);
		System.out.println("Division Result");
		Reporter.log("Division Result");
		String output = driver.findElement(By.id(outPut)).getText();
		System.out.println(output);

		Thread.sleep(2000);
		driver.close();
	}
	
	public void Addition() throws Exception 
	{
		driver.findElement(By.xpath(btn_Sub)).click();
		driver.findElement(By.xpath(btn_2)).click();
		driver.findElement(By.xpath(btn_3)).click();
		driver.findElement(By.xpath(btn_4)).click();
		driver.findElement(By.xpath(btn_2)).click();
		driver.findElement(By.xpath(btn_3)).click();
		driver.findElement(By.xpath(btn_4)).click();
		driver.findElement(By.xpath(btn_Add)).click();
		driver.findElement(By.xpath(btn_3)).click();
		driver.findElement(By.xpath(btn_4)).click();
		driver.findElement(By.xpath(btn_5)).click();
		driver.findElement(By.xpath(btn_3)).click();
		driver.findElement(By.xpath(btn_4)).click();
		driver.findElement(By.xpath(btn_5)).click();
		System.out.println("Addition :");
		Reporter.log("Addition :");
		
		String input = driver.findElement(By.id(inPut)).getText();
		System.out.println(input);
		System.out.println("Addition Result");
		Reporter.log("Addition Result");
		String output = driver.findElement(By.id(outPut)).getText();
		System.out.println(output);
	
		Thread.sleep(2000);
		driver.close();
	}
	
	public void Subtraction() throws Exception 
	{
		driver.findElement(By.xpath(btn_2)).click();
		driver.findElement(By.xpath(btn_3)).click();
		driver.findElement(By.xpath(btn_4)).click();
		driver.findElement(By.xpath(btn_8)).click();
		driver.findElement(By.xpath(btn_2)).click();
		driver.findElement(By.xpath(btn_3)).click();
		driver.findElement(By.xpath(btn_Sub)).click();
		driver.findElement(By.xpath(btn_Br1)).click();
		driver.findElement(By.xpath(btn_Sub)).click();
		driver.findElement(By.xpath(btn_Br2)).click();
		driver.findElement(By.xpath(btn_2)).click();
		driver.findElement(By.xpath(btn_3)).click();
		driver.findElement(By.xpath(btn_0)).click();
		driver.findElement(By.xpath(btn_9)).click();
		driver.findElement(By.xpath(btn_4)).click();
		driver.findElement(By.xpath(btn_8)).click();
		driver.findElement(By.xpath(btn_2)).click();
		driver.findElement(By.xpath(btn_3)).click();
		System.out.println("Subtraction :");
		Reporter.log("Subtraction :");
		
		String input = driver.findElement(By.id(inPut)).getText();
		System.out.println(input);
		System.out.println("Subtraction Result");
		Reporter.log("Subtraction Result");
		String output = driver.findElement(By.id(outPut)).getText();
		System.out.println(output);
	
		Thread.sleep(2000);
		driver.close();	
	}
	
}
