package com.qa.opencart.utlities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CallJavacriptMethods {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.bigbasket.com/");	
		
		Javascript_Executor js1= new Javascript_Executor(driver);
		String title = js1.gettitlejs();
		System.out.println(title);
		js1.refreshbrowser();
		js1.alertmsg("this is an alert");
		
		//driver.close();
	
	}
}
