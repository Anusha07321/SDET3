package com.sdet.practise;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.VTiger.POMClass.CreateOrgPage;
import com.VTiger.POMClass.HomePage;
import com.VTiger.POMClass.OrginfoPage;
import com.VTiger.genericUtil.BaseClass;
import com.VTiger.genericUtil.ExcelUtil;

public class CreateOrgforexcel extends BaseClass
{
	@Test
	public void tc_01() throws EncryptedDocumentException, IOException
	{
		HomePage hp=new HomePage(driver);
		hp.getOrglink();
		OrginfoPage org=new OrginfoPage(driver);
		org.getCreateorgimg();
		ExcelUtil util=new ExcelUtil();
		String orgname = util.selectvalueforDD("Sheet1", 2, "TY_ORG");
		CreateOrgPage cop=new CreateOrgPage(driver);
		cop.createorganisation(orgname);
		cop.saveorg();
		
		
		
		
		
	}
	


}
