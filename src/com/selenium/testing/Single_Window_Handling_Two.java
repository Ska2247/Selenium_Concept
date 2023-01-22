package com.selenium.testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Single_Window_Handling_Two {

	public static WebDriver driver;

	public static void right_click(WebElement element) {
		Actions a = new Actions(driver);
		a.contextClick(element).build().perform();
	}

	public static void down_and_enter() throws AWTException {
		Robot b = new Robot();

		b.keyPress(KeyEvent.VK_DOWN);
		b.keyPress(KeyEvent.VK_DOWN);

		b.keyPress(KeyEvent.VK_ENTER);
		b.keyPress(KeyEvent.VK_ENTER);
	}

	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DARSHAN\\eclipse-workspace\\Selenium_Concept\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.google.com/");

		WebElement Gmail = driver.findElement(By.xpath("//a[.='Gmail']"));

		right_click(Gmail);

		down_and_enter();
		
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
