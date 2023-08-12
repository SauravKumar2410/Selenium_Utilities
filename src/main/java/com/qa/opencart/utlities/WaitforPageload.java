package com.qa.opencart.utlities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class WaitforPageload {
	static WebDriver driver;

	public static void waitpage(int timeout) {
		long endTime = System.currentTimeMillis() + timeout;
		
		while (System.currentTimeMillis() < endTime) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			String state = js.executeScript("return document.readState").toString();
			if (state.equals("complete")) {
				System.out.println("page is fully loaded now ");
				break;
			}
		}
	}

}
