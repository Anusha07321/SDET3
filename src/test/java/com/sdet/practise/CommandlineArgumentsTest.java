package com.sdet.practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CommandlineArgumentsTest 
{
	
	@Test
	public void commandlineparameter()
	{
		WebDriver driver;
		String browser=System.getProperty("browser");
		String url=System.getProperty("url");
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
				
		}
		if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
				
		}
		if(browser.equalsIgnoreCase("safari"))
		{
			driver=new SafariDriver();
				
		}
		else
		{
			driver=new ChromeDriver();
		}
		
		driver.get(url);
		
	}

}
