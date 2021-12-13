package com.sdet.practise;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderWithExcel1 
{
	@Test(dataProvider = "getValue" )
	public void values(String value1,String value2)
	{
		try {
			System.out.println(value1+" "+value2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@DataProvider()
	public Object[][] getValue() throws EncryptedDocumentException, IOException
	{
		Excelfile1 ex=new Excelfile1();
		int lastrow=ex.getLastrow("Sheet1");
//		System.out.println(lastrow);
		Object arr[][]=new Object[4][2] ;
	
		for(int i=0;i<=lastrow;i++)
		{
			for(int j=0;j<=1;j++)
			{
				arr[i][j]=ex.selectvalueforDD("Sheet1", j,i);
				//System.out.print(arr[i][j]+" ");
			}
			//System.out.println(" ");
			
		}
		return arr;
		
		
	}
}
