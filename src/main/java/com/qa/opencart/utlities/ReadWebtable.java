package com.qa.opencart.utlities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadWebtable {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		int rowcount = driver.findElements(By.xpath("//table[@id='customers']//tr")).size();

		int colcount = driver.findElements(By.xpath("//table[@id='customers']//th")).size();

		for (int i = 1; i < rowcount; i++) {
			for (int j = 1; j <= colcount; j++) {
				// genric xpath of the particular element to click
				String value = driver.findElement(By.xpath("")).getText();
				if (value.equals("germany")) {
					System.out.println("present");
					break;
				}

			}
		}
	}

}
