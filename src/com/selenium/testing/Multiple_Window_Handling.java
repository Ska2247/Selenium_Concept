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

public class Multiple_Window_Handling {

	public static WebDriver driver;

	public static void right_click(WebDriver d, WebElement element) {

		Actions a = new Actions(d);
		a.contextClick(element).build().perform();
	}

	public static void down_and_enter() throws AWTException {
		Robot b = new Robot();

		b.keyPress(KeyEvent.VK_DOWN);
		b.keyPress(KeyEvent.VK_DOWN);

		b.keyPress(KeyEvent.VK_ENTER);
		b.keyPress(KeyEvent.VK_ENTER);

	}

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DARSHAN\\eclipse-workspace\\Selenium_Concept\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.com/");

		WebElement Today_Deal = driver.findElement(By.xpath("//a[contains(.,'Deals')]"));
		right_click(driver, Today_Deal);
		down_and_enter();

		WebElement Gift_Cards = driver.findElement(By.xpath("//a[.='Gift Cards']"));
		right_click(driver, Gift_Cards);
		down_and_enter();

		WebElement Sell = driver.findElement(By.xpath("//a[.='Sell']"));
		right_click(driver, Sell);
		down_and_enter();

		Set<String> all_id = driver.getWindowHandles();

		String expected_url = "https://www.amazon.com/gp/goldbox?ref_=nav_cs_gb";

		for (String Id : all_id) {
			if (driver.switchTo().window(Id).getCurrentUrl().equals(expected_url)) {
				break;
			}
		}
	}
}
