package com.sdet.practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_001_Amazon {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles under 10000");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[1]")).click();
		WebElement value = driver.findElement(By.xpath("//span[@class='a-price-whole']/../span[2]"));
		String amount = value.getText();
		String[] str=amount.split(",");
		String s= str[0]+str[1];
		System.out.println(s);
		int amount1=Integer.parseInt(s);
		if(amount1<10000)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		driver.close();	
	}

}
