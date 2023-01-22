package com.selenium.testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table {

	public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DARSHAN\\eclipse-workspace\\Selenium_Concept\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://qavbox.github.io/demo/webtable/");

		System.out.println("***Specific Cell***");// 42nd row 3rd cell

		WebElement Particular_Cell = driver.findElement(By.xpath(" //table[@id='table02']/tbody/tr[42]/td[3]"));
		System.out.println(Particular_Cell.getText());

		System.out.println();
		System.out.println("***Specific Row***");// 54th row

		List<WebElement> Specific_Row = driver.findElements(By.xpath("//table[@id='table02']/tbody/tr[54]/td"));
		for (WebElement value : Specific_Row) {
			System.out.println(value.getText());
		}

		System.out.println();
		System.out.println("***Specific Column***");// 2nd column
		List<WebElement> Specific_Column = driver.findElements(By.xpath("//table[@id='table02']/tbody/tr/td[2]"));
		for (WebElement value : Specific_Column) {
			System.out.println(value.getText());
		}

		System.out.println();
		System.out.println("***All Data***");// All Data
		List<WebElement> All_Data = driver.findElements(By.xpath("//table[@id='table02']/tbody/tr/td"));
		for (WebElement value : All_Data) {
			System.out.println(value.getText());

		}
	}

}
