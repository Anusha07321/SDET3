package com.VTiger.TC;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.VTiger.POMClass.ContactinfoPage;
import com.VTiger.POMClass.CreateContactPage;
import com.VTiger.POMClass.HomePage;
import com.VTiger.genericUtil.BaseClass;
import com.VTiger.genericUtil.JavaUtil;
import com.VTiger.genericUtil.WebDriverUtilities;

public class TC003_CreateContactwithOrganisationTest extends BaseClass
{
	@Test(groups="smoketesting")
	public void CreateContact()
	{
		HomePage hp=new HomePage(driver);
		hp.getContactslink().click();
		ContactinfoPage cip=new ContactinfoPage(driver);
		cip.getCreatecontactimg().click();
		CreateContactPage createcontact=new CreateContactPage(driver);
		String firstName = JavaUtil.createobjforJavaUtil().fakeFirstName();
		String lastName = JavaUtil.createobjforJavaUtil().fakeLastName();
		createcontact.createContact("Ms.", firstName,lastName ,"Hyderabad" , "Organization Name", "Accounts");
	    WebDriverUtilities utility=new WebDriverUtilities(driver);
		utility.switchToWindow("Contacts");
		createcontact.getSaveContact().click();
		
		hp.getContactslink().click();
		ContactinfoPage contactinfo=new ContactinfoPage(driver);
		contactinfo.searchforcontact(firstName,"First Name");
		String text = driver.findElement(By.xpath("//a[text()='"+firstName+"']")).getText();
		Assert.assertEquals(text,firstName);

		

	}
	@Test(groups="Regressiontesting")
	public void createcontact()
	{
		HomePage hp=new HomePage(driver);
		hp.getContactslink().click();
		ContactinfoPage cip=new ContactinfoPage(driver);
		cip.getCreatecontactimg().click();
		CreateContactPage createcontact=new CreateContactPage(driver);
		String firstName = JavaUtil.createobjforJavaUtil().fakeFirstName();
		String lastName = JavaUtil.createobjforJavaUtil().fakeLastName();
		createcontact.createContact1("Ms.", firstName, lastName);
		createcontact.getSaveContact().click();
		
		hp.getContactslink().click();
		ContactinfoPage contactinfo=new ContactinfoPage(driver);
		contactinfo.searchforcontact(firstName,"First Name");
		String text = driver.findElement(By.xpath("//a[text()='"+firstName+"']")).getText();
		Assert.assertEquals(text,firstName);

		
	}

}
