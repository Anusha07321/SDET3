package com.sdet.practise;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 
{
	@Test(dataProvider = "getValue")
	public void print(String value1,String value2)
	{
		System.out.println(value1+"  "+value2);
	}
	@DataProvider()
	public Object[][] getValue()
	{
		Object arr[][]=new Object[4][2] ;
		arr[0][0]="TYSS";
		arr[0][1]="Hyd";
		
		arr[1][0]="Qsp";
		arr[1][1]="Bang";
		
		arr[2][0]="jsp";
		arr[2][1]="Delhi";
		
		arr[3][0]="pysp";
		arr[3][1]="Noida";
		
		return arr;
		
	}
}
