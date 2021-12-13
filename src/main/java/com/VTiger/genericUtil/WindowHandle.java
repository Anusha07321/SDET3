package com.VTiger.genericUtil;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Set<String> winids = driver.getWindowHandles();
		for(String id:winids)
		{
			String title = driver.switchTo().window(id).getTitle();
			if(title.equalsIgnoreCase("Tech Mahindra"))
			{
				driver.manage().window().maximize();
				
			}
		}

	}

}
