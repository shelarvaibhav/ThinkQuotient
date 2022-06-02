package com.seleniumwebdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActitimeLogin {

	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Vaibhav\\\\Downloads\\\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://online.actitime.com/thinkquotient4/login.do");
		dr.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("vaibhavshelar5996@gmail.com");
		dr.findElement(By.xpath("//*[@id=\"loginFormContainer\"]/tbody/tr[1]/td/table/tbody/tr[2]/td/input")).sendKeys("nY#Pee@D");
		Thread.sleep(3000);
		dr.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
		Thread.sleep(3000);
		   // dr.findElement(By.xpath("/html/body/div[8]/table/tbody/tr[1]/td[7]/table/tbody/tr/td/div/table/tbody/tr[1]/td[3]/a")).click();
	}

}
