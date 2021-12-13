package com.sdet.practise;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;

public class DataProviderwithExcel 
{
	@DataProvider()
	public Object[][] getValue() throws EncryptedDocumentException, IOException
	{
		Excelfile1 ex=new Excelfile1();
		int lastrow=ex.getLastrow("Sheet1");
		System.out.println(lastrow);
		Object arr[][]=new Object[4][2] ;
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=1;j++)
			{
				arr[i][j]=ex.selectvalueforDD("Sheet1", j,i);
			}
		}

	
		return arr;
		
	}

}
