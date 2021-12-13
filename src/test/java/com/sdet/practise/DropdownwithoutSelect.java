package com.sdet.practise;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.VTiger.POMClass.LoginPage;
import com.VTiger.genericUtil.FileUtil;
import com.VTiger.genericUtil.WebDriverUtilities;

public class DropdownwithoutSelect 
{
	static WebDriver driver;

	public static void main(String[] args) throws IOException 
	{
		//launching the browser
				String browser=FileUtil.objforFileUtil().readDataFrompropfile("browser");
				if(browser.equals("chrome"))
				{
					driver=new ChromeDriver();
				}
				else if(browser.equalsIgnoreCase("firefox"))
				{
					driver=new FirefoxDriver();
				}
				else if(browser.equalsIgnoreCase("safari"))
				{
					driver=new SafariDriver();
				}
				else
				{
					driver=new ChromeDriver();
				} 
				//maximize the browser
				WebDriverUtilities utility=new WebDriverUtilities(driver);
				utility.maximize();
				//entering the url of the application 
				driver.get(FileUtil.objforFileUtil().readDataFrompropfile("url"));
				utility.pageTimeout();
				
				//login to application
				LoginPage login=new LoginPage(driver);
				login.logintoApp();
				
				List<WebElement> values = driver.findElements(By.xpath("//select[@id='qccombo']/option"));
				
				int size = values.size();
//				Iterator<WebElement> iterator = values.iterator();
//				System.out.println(iterator);
//				if(iterator.hasNext())
//				{
//					
//				}
				for(int i=0;i<size;i++)
				{
					WebElement value1 = values.get(i);
					String text = value1.getText();
					if(text.equalsIgnoreCase("New Project"))
					{
						value1.click();
					}
				}
		
		

	}

}
