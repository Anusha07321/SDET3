package com.VTiger.genericUtil;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtil 
{
	public int getLastrow(String sheetname) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(IAutoconstant.excelpath);
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(sheetname);
		return sheet.getLastRowNum();
	}
	public String selectvalueforDD(String sheetname,int cnum,String ddValue) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(IAutoconstant.excelpath);
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(sheetname);
		int lastrow=getLastrow(sheetname);
		String value="Null";
		for(int i=0;i<=lastrow;i++)
		{
			value=workbook.getSheet(sheetname).getRow(i).getCell(cnum).getStringCellValue();
			if(value.equalsIgnoreCase(ddValue))
			{
				break;
			}
		}
		workbook.close();
		return value;
		
	}
	
}
