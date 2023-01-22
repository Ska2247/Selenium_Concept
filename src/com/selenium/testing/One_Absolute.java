package com.selenium.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class One_Absolute {

	public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DARSHAN\\eclipse-workspace\\Selenium_Concept\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.com/");

		WebElement Search = driver.findElement(By.xpath("//input[@dir='auto']"));
		Search.sendKeys("Samsung f 22 mobile phone");

		WebElement Search_Btn = driver.findElement(By.xpath("//input[@value='Go']"));
		Search_Btn.click();

		WebElement Samsung = driver.findElement(By.xpath(
				"//div[@id='search']/div/div/div/span[3]/div/div/div/div/div/div/div/div/div/div/div/span/a/div/img"));
		Samsung.click();
	}

}
