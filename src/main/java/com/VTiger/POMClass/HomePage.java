package com.VTiger.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.VTiger.genericUtil.WebDriverUtilities;

public class HomePage 
{
	WebDriver driver;
	@FindBy(xpath="//a[text()='Organizations']")
	private WebElement orglink;
	
	@FindBy(xpath="//a[text()='Contacts']")
	private WebElement contactslink;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement signoutimg;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement logoutlink;

	public WebElement getContactslink() {
		return contactslink;
	}

	public WebElement getSignoutimg() {
		return signoutimg;
	}

	public WebElement getLogoutlink() {
		return logoutlink;
	}

	public WebElement getOrglink() {
		return orglink;
	}
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void logoutfromApp()
	{
		WebDriverUtilities utility=new WebDriverUtilities(driver);
		utility.moveToElement(signoutimg);
		logoutlink.click();
	}
	
	

	
}
