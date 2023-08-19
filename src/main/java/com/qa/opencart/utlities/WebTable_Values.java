package com.qa.opencart.utlities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_Values {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get(
				"https://www.cricbuzz.com/live-cricket-scorecard/77242/ire-vs-ind-1st-t20i-india-tour-of-ireland-2023");

		List<WebElement> scorecard = driver
				.findElements(By.xpath("//a[text()=' Tilak Varma ']/parent::div/following-sibling::div[contains(@class,'cb-col cb-col')]"));

		for(WebElement player : scorecard)
		{
			String teamindia = player.getText().trim();
			System.out.println("scorecard of player is "+teamindia);
			
		}
		driver.close();
	}

}
