package com.home.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class DemoAutomatio {
	
	WebDriver driver;
	
	public DemoAutomatio() {
		System.setProperty("webdriver.chrome.driver","G:\\Mohan\\Selenium_Software\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
	}
	
	public void SearchProduct() {
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("samsung m30 mobile phone");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		boolean IsElementPresent = driver.findElement(By.xpath("//span[contains(text(),'results for')]")).isDisplayed();
		Assert.assertTrue(IsElementPresent);
		if(IsElementPresent) {
			System.out.println("Result Found");
		}
		else
		{
			System.out.println("Result not Found");
		}
	}
	
	public static void main(String[] args) {
		new DemoAutomatio().SearchProduct();
	}

}
