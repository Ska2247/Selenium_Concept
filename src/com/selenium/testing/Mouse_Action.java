package com.selenium.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Action {

	public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DARSHAN\\eclipse-workspace\\Selenium_Concept\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://www.greenstechnologys.com/");

		WebElement course = driver.findElement(By.xpath("//a[.='COURSES']"));

		Actions a = new Actions(driver);

		a.moveToElement(course).build().perform();

		WebElement Oracle = driver.findElement(By.xpath("//span[.='Oracle Training']"));
		a.moveToElement(Oracle);

		WebElement Oracle_Sql = driver.findElement(By.xpath("//span[.='Oracle SQL and PLSQL Placement Training']"));
		a.click(Oracle_Sql).build().perform();

		WebElement Context_Click = driver.findElement(By.xpath("//a[.=' Privacy Policy']"));
		a.contextClick(Context_Click).build().perform();

	}

}
