package com.sdet.practise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAuto {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		driver.findElement(By.name("q")).sendKeys("seleni");
		
		List<WebElement> elements = driver.findElements(By.xpath("//li[@class='sbct']"));
		int size = elements.size();
		for(int i=0;i<size;i++)
		{
			WebElement element = elements.get(i);
			String name = element.getText();
			System.out.println(name);
		}
		

	}

}
