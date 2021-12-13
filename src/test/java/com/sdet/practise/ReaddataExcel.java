package com.sdet.practise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReaddataExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		String dirpath = System.getProperty("user.dir");
		String excelpath = dirpath+"/projectdata.xlsx";
		FileInputStream fis=new FileInputStream(excelpath);
		Workbook workbook = WorkbookFactory.create(fis);
		String value = workbook.getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
		System.out.println(value);
 
	}

}
