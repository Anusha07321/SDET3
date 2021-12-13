package com.VTiger.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrgPage 
{
	WebDriver driver;
	@FindBy(name="accountname")
	private WebElement orgnametxtfld;
	
	@FindBy(name="button")
	private WebElement savebtn;
	
	@FindBy(name="industry")
	private WebElement industryDD;
	
	@FindBy(name="rating")
	private WebElement rating;
	
	@FindBy(name="accounttype")
	private WebElement typeDD;
	
	@FindBy(id="phone")
	private WebElement phonenotextfld;

	public WebElement getOrgnametxtfld() {
		return orgnametxtfld;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}

	public WebElement getIndustryDD() {
		return industryDD;
	}

	public WebElement getRating() {
		return rating;
	}

	public WebElement getTypeDD() {
		return typeDD;
	}
	
	public WebElement getPhonenotextfld() {
		return phonenotextfld;
	}

	public CreateOrgPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void createorganisation(String organizationName)
	{
		orgnametxtfld.sendKeys(organizationName);
		
	}
	public void saveorg()
	{
		savebtn.click();
	}
	
	
	
	

}
