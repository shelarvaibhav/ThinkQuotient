package com.seleniumwebdriver;
import org.openqa.selenium.By;
//import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Webdriver {

	public static void main(String[] args)  throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vaibhav\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver dr =new ChromeDriver();
		dr.get("https://www.flipkart.com/");
		String titlepage = dr.getTitle();//for tittle
		System.out.println(titlepage);
		dr.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(3000);
		dr.findElement(By.xpath("//div[text()='Grocery']")).click();
		Thread.sleep(3000);
		dr.navigate().back();
		String url = dr.getCurrentUrl();//for current url
		System.out.println(url);
		Thread.sleep(3000);
		
		dr.close();
	}
}

	