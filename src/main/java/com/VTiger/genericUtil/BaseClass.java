package com.VTiger.genericUtil;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.VTiger.POMClass.HomePage;
import com.VTiger.POMClass.LoginPage;

public class BaseClass 
{
	public WebDriver driver;
	public LoginPage login;
	public static WebDriver sdriver;
	@BeforeSuite(groups={"smoketesting","Regressiontesting"})
	public void setUp()
	{
		System.out.println("connect to database");
	}
	@Parameters("BROWSER")
	@BeforeClass(groups={"smoketesting","Regressiontesting"})
	public void launchBrowser_URL(String browser) throws IOException
	{
		//String browser=FileUtil.objforFileUtil().readDataFrompropfile("browser");
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
		//get the url
		driver.get(FileUtil.objforFileUtil().readDataFrompropfile("url"));
		utility.pageTimeout();
		login=new LoginPage(driver);
		sdriver=driver;
	}
	
	@BeforeMethod(groups={"smoketesting","Regressiontesting"})
	public void logintoApp() throws IOException
	{
		login.logintoApp();
	}
	
	@AfterMethod(groups={"smoketesting","Regressiontesting"})
	public void logoutfromApp()
	{
		HomePage hp=new HomePage(driver);
		hp.logoutfromApp();
	}
	
	@AfterClass(groups={"smoketesting","Regressiontesting"})
	public void closeBrowser()
	{
		driver.close();
	}
	
	@AfterSuite(groups={"smoketesting","Regressiontesting"})
	public void setUplogout()
	{
		System.out.println("disconnect from database");
	}
	public static void takeScreenshot(String name) throws IOException
	{
		File src=((TakesScreenshot)sdriver).getScreenshotAs(OutputType.FILE);
		String dest=System.getProperty("user.dir")+"/screenshots/"+name+".png";
		File finaldest=new File(dest);
		FileUtils.copyFile(src, finaldest);
	}

}
