package com.VTiger.genericUtil;

import java.sql.Time;
import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtilities 
{
	WebDriver driver;
	public WebDriverUtilities(WebDriver driver)
	{
		this.driver=driver;
	}
	public void maximize()
	{
		driver.manage().window().maximize();
	}
	public void pageTimeout()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void selectfromDD(WebElement element,String value)
	{
		Select s=new Select(element);
		s.selectByValue(value);
	}
	public void selectfromDD(WebElement element,int index)
	{
		Select s=new Select(element);
		s.selectByIndex(index);
	}
	public void selectfromDD(String text,WebElement element)
	{
		Select s=new Select(element);
		s.selectByVisibleText(text);
	}
	public void moveToElement(WebElement element)
	{
		Actions a=new Actions(driver);
		a.moveToElement(element).build().perform();;
	}
	public void clickByoffset(int xOffset,int yOffset)
	{
		Actions a=new Actions(driver);
		a.moveByOffset(xOffset ,yOffset).click();
	}
	public void rightClick(WebElement element)
	{
		Actions a=new Actions(driver);
		a.contextClick(element).perform();;
	}
	public void scrollToElement(WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
	public void scrollByPosition(int x,int y)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
	public void alertAccept()
	{
		driver.switchTo().alert().accept();
	}
	public void alertDismiss()
	{
		driver.switchTo().alert().dismiss();
	}
	public void switchToWindow(String title)
	{
		Set<String> winids = driver.getWindowHandles();
		for(String id:winids)
		{
			String currenttitle = driver.switchTo().window(id).getTitle();
			if(currenttitle.equalsIgnoreCase(title))
			{
				break;
			}
		}
	}
	public void ExplicitwaitToFindelement(WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

}
