package qa.com.opencart.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	
	
	WebDriver driver;
	
	public void Browser(String browsername)
	{
		//String browsername;
		if(browsername.contains("Chrome"))
		{
			driver= new ChromeDriver();
		}
		else if(browsername.contains("firefox"))
		{
			driver = new FirefoxDriver();
			
		}
		
	}
	
	
	
	
	

}
