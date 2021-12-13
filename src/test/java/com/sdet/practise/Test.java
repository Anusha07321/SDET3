package com.sdet.practise;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.VTiger.genericUtil.IAutoconstant;

public class Test {
	
		public int getLastrow(String sheetname) throws EncryptedDocumentException, IOException
		{
			FileInputStream fis=new FileInputStream(IAutoconstant.excelpath);
			Workbook workbook = WorkbookFactory.create(fis);
			Sheet sheet = workbook.getSheet(sheetname);
			return sheet.getLastRowNum();
		}

	}


