package com.selenium.testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Single_Window_Handling {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DARSHAN\\eclipse-workspace\\Selenium_Concept\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.google.com/");

		WebElement Gmail = driver.findElement(By.xpath("//a[.='Gmail']"));

		Actions a = new Actions(driver);
		a.contextClick(Gmail).build().perform();

		Robot b = new Robot();

		b.keyPress(KeyEvent.VK_DOWN);
		b.keyPress(KeyEvent.VK_DOWN);

		b.keyPress(KeyEvent.VK_ENTER);
		b.keyPress(KeyEvent.VK_ENTER);

		String Google_Id = driver.getWindowHandle();

		Set<String> Both_Id = driver.getWindowHandles();
		for (String Id : Both_Id) {

			if (Id.equals(Google_Id)) {
				continue;
			} else {
				driver.switchTo().window(Id);
			}
		}

	}

}
