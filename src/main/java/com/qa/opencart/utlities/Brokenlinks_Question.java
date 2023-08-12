package com.qa.opencart.utlities;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Brokenlinks_Question {

	WebDriver driver;
	
	public void links() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com");
			
	List<WebElement> li = 	driver.findElements(By.tagName("a"));
	
	List<String> urllist = new ArrayList<String>();
	
	System.out.println(li.size());
	for(WebElement br:li)
	{
		
		String url = br.getAttribute("href");
		///urllist.add(url);
		//System.out.println(urllist);
		checkbroken(url);
	}
	
	}
	public static void checkbroken(String linkurl) throws IOException
	{
		try{
			URL url = new URL(linkurl);
			HttpURLConnection http = (HttpURLConnection) url.openConnection();
			http.setConnectTimeout(10000);
			http.connect();
			
			if(http.getResponseCode() >=400)
			{
				System.out.println(linkurl+ "---->" +http.getResponseMessage() + "is a broken link");
			}
			else
			{
					System.out.println(linkurl+"---->"+http.getResponseMessage());
			}
		}
		
		catch (java.net.ProtocolException e) {
            System.out.println("ProtocolException caught: " + e.getMessage());
	}
	
	}
	
	
	
}
