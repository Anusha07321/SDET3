package com.VTiger.TC;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.VTiger.POMClass.CreateOrgPage;
import com.VTiger.POMClass.HomePage;
import com.VTiger.POMClass.OrginfoPage;
import com.VTiger.genericUtil.BaseClass;
import com.VTiger.genericUtil.JavaUtil;
import com.VTiger.genericUtil.Retryanalyzer;

public class TC001_CreateOrganisationTest extends BaseClass
{
		@Test(groups="smoketesting", retryAnalyzer=com.VTiger.genericUtil.Retryanalyzer.class)
		public void createorganisation()
		{
		//creating an organisation
		HomePage hp=new HomePage(driver);
		hp.getOrglink().click();
		OrginfoPage orginfo=new OrginfoPage(driver);
		orginfo.getCreateorgimg().click();
		String organisationname = JavaUtil.createobjforJavaUtil().fakeFirstName()+JavaUtil.createobjforJavaUtil().generateRandomnumber();	
		CreateOrgPage createorg=new CreateOrgPage(driver);
		createorg.createorganisation(organisationname);
		createorg.saveorg();
		
		//refreshing the browser
		driver.navigate().refresh();
		hp.getOrglink().click();
		orginfo.searchfororgname(organisationname,"Organization Name");
	   
		String orgname = driver.findElement(By.xpath("//a[text()='"+organisationname+"' and @title='Organizations']")).getText();
		Assert.assertEquals(orgname,organisationname);
	   
	}
		
		@Test(groups="Regressiontesting",retryAnalyzer=com.VTiger.genericUtil.Retryanalyzer.class)
		public void createorgwithphoneno()
		{
			HomePage hp=new HomePage(driver);
			hp.getOrglink().click();
			OrginfoPage orginfo=new OrginfoPage(driver);
			orginfo.getCreateorgimg().click();
			String organisationname = JavaUtil.createobjforJavaUtil().fakeFirstName()+JavaUtil.createobjforJavaUtil().generateRandomnumber();	
			CreateOrgPage createorg=new CreateOrgPage(driver);
			createorg.createorganisation(organisationname);
			String phonenumber = JavaUtil.createobjforJavaUtil().fakePhoneno();
			createorg.getPhonenotextfld().sendKeys(phonenumber);
			createorg.saveorg();
			
			//refreshing the browser
			driver.navigate().refresh();
			hp.getOrglink().click();
			orginfo.searchfororgname(phonenumber,"Phone");
			
			String orgname = driver.findElement(By.xpath("//a[text()='"+organisationname+"' and @title='Organizations']")).getText();
			Assert.assertEquals(orgname,organisationname);

			
		}	

}
