package com.VTiger.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.VTiger.genericUtil.WebDriverUtilities;

public class OrgWindow 
{
	WebDriver driver;
	@FindBy(id="search_txt")
	private WebElement searchforOrgtxtfld;
	
	@FindBy(name="search_field")
	private WebElement seachOrgDD;
	
	@FindBy(name="search")
	private WebElement searchnowbtn;

	public WebElement getSearchforOrgtxtfld() {
		return searchforOrgtxtfld;
	}

	public WebElement getSeachOrgDD() {
		return seachOrgDD;
	}

	public WebElement getSearchnowbtn() {
		return searchnowbtn;
	}

	public OrgWindow(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void Orgnamesearch(String orgname,String text)
	{
		searchforOrgtxtfld.sendKeys(orgname);
		WebDriverUtilities utility=new WebDriverUtilities(driver);
		utility.selectfromDD(text, seachOrgDD);
		searchnowbtn.click();
	}
	
	
	


}
