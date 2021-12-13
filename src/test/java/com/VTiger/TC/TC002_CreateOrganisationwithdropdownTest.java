package com.VTiger.TC;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.VTiger.POMClass.CreateOrgPage;
import com.VTiger.POMClass.HomePage;
import com.VTiger.POMClass.OrginfoPage;
import com.VTiger.genericUtil.BaseClass;
import com.VTiger.genericUtil.ExcelUtil;
import com.VTiger.genericUtil.JavaUtil;
import com.VTiger.genericUtil.WebDriverUtilities;

public class TC002_CreateOrganisationwithdropdownTest extends BaseClass
{
	@Test(groups="smoketesting")
	public void CreateOrgwithDD() throws EncryptedDocumentException, IOException
	{
		HomePage hp=new HomePage(driver);
		hp.getOrglink().click();
        
		OrginfoPage orginfo=new OrginfoPage(driver);
		orginfo.getCreateorgimg().click();
		String orgname = JavaUtil.createobjforJavaUtil().fakeFirstName()+JavaUtil.createobjforJavaUtil().generateRandomnumber();
		CreateOrgPage createorg=new CreateOrgPage(driver);
		createorg.createorganisation(orgname);
	
		
		//handling the dropdown of orgtype
		ExcelUtil ex=new ExcelUtil();
		createorg.getIndustryDD().sendKeys(ex.selectvalueforDD("Sheet1", 0, "Construction"));
		
		//handling the dropdown of rating
		createorg.getRating().sendKeys(ex.selectvalueforDD("Sheet1", 1, "Active"));
		
		//handling the dropdown of account type
		createorg.getTypeDD().sendKeys(ex.selectvalueforDD("Sheet1", 2, "Analyst"));
		createorg.saveorg();
		
		
		//refreshing the browser
		driver.navigate().refresh();
		
		//validating the org created
		hp.getOrglink().click();
		String in = ex.selectvalueforDD("Sheet1", 3, "Organization Name");
		orginfo.searchfororgname(orgname,in);
		orginfo.getSearchnowbtn().click();
		WebDriverUtilities utility=new WebDriverUtilities(driver);
		
		WebElement orgname1 = driver.findElement(By.xpath("//a[text()='"+orgname+"' and @title='Organizations']"));
		utility.ExplicitwaitToFindelement(orgname1);
		String orgname2 = orgname1.getText();
		Assert.assertEquals(orgname2,orgname);
		
		
	}

}
