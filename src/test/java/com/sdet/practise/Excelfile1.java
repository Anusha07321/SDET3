package com.sdet.practise;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.VTiger.genericUtil.IAutoconstant;

public class Excelfile1 
{
	public int getLastrow(String sheetname) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./dataproviderExcel.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(sheetname);
		return sheet.getLastRowNum();
	}
	public String selectvalueforDD(String sheetname,int cnum,int row) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./dataproviderExcel.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(sheetname);
		int lastrow=getLastrow(sheetname);
		String value="Null";	
	    value=workbook.getSheet(sheetname).getRow(row).getCell(cnum).getStringCellValue();	
		workbook.close();
		return value;
		
	}

}
