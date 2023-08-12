package com.qa.opencart.utlities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Javascript_Executor {

	private WebDriver driver;
	
	
	 public Javascript_Executor(WebDriver driver) 
	 { 
		 this.driver=driver; 
	 
	 }
	
	
	public String gettitlejs()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js.executeScript("return document.title;").toString();
		
	}
	
	public void refreshbrowser()
	{
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("history.go[0]");
	}
	
	public void drawbrowser(WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}
	


	public void alertmsg(String message) {
	
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("alert('" + message + "')");
		
	}
	
	
	
	
	
	

}
