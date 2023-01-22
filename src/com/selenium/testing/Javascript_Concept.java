package com.selenium.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class Javascript_Concept {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DARSHAN\\eclipse-workspace\\Selenium_Concept\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='aaa@gmail.com'", email);

		Thread.sleep(5000);

		WebElement Login_Btn = driver.findElement(By.xpath("//button[@name='login']"));
		js.executeScript("arguments[0].click()", Login_Btn);

		Thread.sleep(6000);

		WebElement Scroll = driver.findElement(By.xpath("//a[@title='Log in to Facebook']"));
		js.executeScript("arguments[0].scrollIntoView()", Scroll);

		WebElement highlight = driver.findElement(By.xpath("//a[contains(@title,'Buy and sell')]"));
		js.executeScript("arguments[0].setAttribute('style','color:green')", highlight);
	}

}
