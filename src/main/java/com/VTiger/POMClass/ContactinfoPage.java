package com.VTiger.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.VTiger.genericUtil.WebDriverUtilities;

public class ContactinfoPage 
{
	WebDriver driver;
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createcontactimg;
	
	@FindBy(name="search_text")
	private WebElement searchforcontacttxtfld;
	
	@FindBy(id="bas_searchfield")
	private WebElement searchcontactDD;
	
	@FindBy(name="submit")
	private WebElement searchnowbtn;

	public WebElement getCreatecontactimg() {
		return createcontactimg;
	}

	public WebElement getSearchforcontacttxtfld() {
		return searchforcontacttxtfld;
	}

	public WebElement getSearchcontactDD() {
		return searchcontactDD;
	}

	public WebElement getSearchnowbtn() {
		return searchnowbtn;
	}

	public ContactinfoPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void searchforcontact(String firstname,String text)
	{
		searchforcontacttxtfld.sendKeys(firstname);
		WebDriverUtilities utility=new WebDriverUtilities(driver);
		utility.selectfromDD(text, searchcontactDD);
		searchnowbtn.click();
	}
	
	

}
