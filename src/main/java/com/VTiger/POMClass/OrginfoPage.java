package com.VTiger.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.VTiger.genericUtil.WebDriverUtilities;

public class OrginfoPage 
{
	WebDriver driver;
	WebDriverUtilities utility;
	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement createorgimg;
	
	@FindBy(name="search_text")
	private WebElement searchfortxtfld;
	
	@FindBy(xpath="//select[@class='txtBox']")
	private WebElement orgnameDD;
	
	@FindBy(name="submit")
	private WebElement searchnowbtn;

	public WebElement getSearchfortxtfld() {
		return searchfortxtfld;
	}

	public WebElement getCreateorgimg() {
		return createorgimg;
	}

	public WebElement getOrgnameDD() {
		return orgnameDD;
	}

	public WebElement getSearchnowbtn() {
		return searchnowbtn;
	}

	public OrginfoPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void searchfororgname(String orgnamesearchfor,String text)
	{
		searchfortxtfld.sendKeys(orgnamesearchfor);
		utility=new WebDriverUtilities(driver);
		utility.selectfromDD(text,orgnameDD);
		searchnowbtn.click();
		
	}
	
	

}
