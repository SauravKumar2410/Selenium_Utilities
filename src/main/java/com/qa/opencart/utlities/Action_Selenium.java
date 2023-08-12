package com.qa.opencart.utlities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Action_Selenium {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.bigbasket.com");
		driver.findElement(By.xpath("//*[@class='dropdown-toggle meganav-shop']")).click();
	
		List<WebElement> li =driver.findElements(By.linkText("//*[@id='navBarMegaNav']/li"));
		System.out.println(li.size());
		
		for(WebElement s:li)
		{
			s.getAttribute("li").contains("data-submenu-id");
			System.out.println(s);
		}
		
	}
	
	}
	

