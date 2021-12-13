package com.sdet.practise;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import com.VTiger.genericUtil.ExcelUtil;

public class Test1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		ExcelUtil util=new ExcelUtil();
		String firstname=util.selectvalueforDD("Sheet1", 5, "First Name");
		System.out.println(firstname);

	}

}
