package com.VTiger.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.VTiger.genericUtil.WebDriverUtilities;

public class CreateContactPage 
{
	WebDriver driver;
	String orgname;
	@FindBy(name="salutationtype")
	private WebElement salutationDD;
	
	@FindBy(name="firstname")
	private WebElement firstnametxtfld;
	
	@FindBy(name="lastname")
	private WebElement lastnametxtfld;
	
	@FindBy(xpath="//img[@alt='Select']")
	private WebElement orginfoimg;
	
	@FindBy(xpath="//a[text()='Sdet3']")
	private WebElement selectOrg;
	
	@FindBy(name="button")
	private WebElement saveContact;

	public WebElement getSalutationDD() {
		return salutationDD;
	}

	public WebElement getFirstnametxtfld() {
		return firstnametxtfld;
	}

	public WebElement getLastnametxtfld() {
		return lastnametxtfld;
	}

	public WebElement getOrginfoimg() {
		return orginfoimg;
	}

	public WebElement getSaveContact() {
		return saveContact;
	}

	public CreateContactPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void createContact(String saltype,String firstname,String lastname,String orgname,String ddname,String titleofpage)
	{
		WebDriverUtilities utility=new WebDriverUtilities(driver);
		utility.selectfromDD(saltype,salutationDD);
		firstnametxtfld.sendKeys(firstname);
		lastnametxtfld.sendKeys(lastname);
		orginfoimg.click();
		utility.switchToWindow(titleofpage);
		OrgWindow orgwindow=new OrgWindow(driver);
		orgwindow.Orgnamesearch(orgname, ddname);
		selectOrg.click();
		
	}
	
	public void createContact1(String saltype,String firstname,String lastname)
	{
		WebDriverUtilities utility=new WebDriverUtilities(driver);
		utility.selectfromDD(saltype,salutationDD);
		firstnametxtfld.sendKeys(firstname);
		lastnametxtfld.sendKeys(lastname);
	}
	
	

}
