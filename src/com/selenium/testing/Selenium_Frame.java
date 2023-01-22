package com.selenium.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Frame {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	/**
	 * @param args
	 * @throws InterruptedException
	 */
	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DARSHAN\\eclipse-workspace\\Selenium_Concept\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Frames.html");

		driver.switchTo().frame("singleframe");

		WebElement Text_Box = driver.findElement(By.xpath("//input[@type='text']"));
		Text_Box.sendKeys("Hi");

		driver.switchTo().defaultContent();

		WebElement Multi_Frame = driver.findElement(By.xpath("//a[contains(.,'Iframe with')]"));
		Multi_Frame.click();

		WebElement Outer_Frame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(Outer_Frame);

		Thread.sleep(5000);

		WebElement Inner_Frame = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(Inner_Frame);

		Thread.sleep(5000);

		WebElement Inner_Txt = driver.findElement(By.xpath("//input[@type='text']"));
		Inner_Txt.sendKeys("Inner Frame");

		Thread.sleep(6000);

		driver.switchTo().parentFrame();

		driver.switchTo().defaultContent();

		WebElement Single_Frame_btn = driver.findElement(By.xpath("//a[@data-toggle='tab']"));
		Single_Frame_btn.click();

	}

}
