package com.qa.opencart.utlities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Write {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get(
				"https://www.espncricinfo.com/series/the-hundred-men-s-competition-2023-1355567/northern-superchargers-men-vs-oval-invincibles-men-15th-match-1355620/full-scorecard");
String playername="Sam Curran";
		List<WebElement> Battingorder = driver
				.findElements(By.xpath("//a[@title='"+playername+"']//ancestor::td/following-sibling::td"));

		for (WebElement e : Battingorder) {
						System.out.println(e.getText());
		}

	}

}
