package com.VTiger.genericUtil;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileUtil 
{
	private FileUtil()
	{
		
	}
	/**
	 * @author Anusha
	 * Description:This method creates an obj for FileUtil
	 * @return objofFileUtil
	 */
	public static FileUtil objforFileUtil()
	{
		FileUtil f=new FileUtil();
		return f;
	}
	/**
	 * @author Anusha
	 * Description :This method is to read the data from propertyfile
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String readDataFrompropfile(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream(IAutoconstant.proppath);
		Properties prop=new Properties();
		prop.load(fis);
		return prop.getProperty(key);
	}
	/**
	 * @author Anusha
	 * Description:This method returns String value from dd
	 * @return String value from excel
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String readindustrydatafromexcel() throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(IAutoconstant.excelpath);
		Workbook workbook = WorkbookFactory.create(fis);
		int row = JavaUtil.createobjforJavaUtil().generateRandomnumForInddd();
		return workbook.getSheet("Industry").getRow(row).getCell(0).getStringCellValue();
	}
	/**
	 * @author Anusha
	 * Description:This method returns String value from dd
	 * @return String value from excel
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String readRatedatafromexcel() throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(IAutoconstant.excelpath);
		Workbook workbook = WorkbookFactory.create(fis);
	    int row=JavaUtil.createobjforJavaUtil().generateRandomnumForRatedd();
		return workbook.getSheet("Rating").getRow(row).getCell(0).getStringCellValue();
	}
	/**
	 * @author Anusha
	 * Description:This method returns String value from dd
	 * @return String value from excel
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String readTypedatafromexcel() throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(IAutoconstant.excelpath);
		Workbook workbook = WorkbookFactory.create(fis);
		int row = JavaUtil.createobjforJavaUtil().generateRandomnumForTypedd();
		return workbook.getSheet("Type of org").getRow(row).getCell(0).getStringCellValue();
	}
	/**
	 * @author Anusha
	 * Description: This method returns String value from dd
	 * @return String
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String readinDDdatafromexcel() throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(IAutoconstant.excelpath);
		Workbook workbook = WorkbookFactory.create(fis);
		//int row = JavaUtil.createobjforJavaUtil().generateRandomnumForIndd();
		return workbook.getSheet("In").getRow(1).getCell(0).getStringCellValue();
	}
	/**
	 * @author Anusha
	 * 
	 * @return salutation type from excel
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String readsalDatafromExcel() throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(IAutoconstant.excelpath);
		Workbook workbook = WorkbookFactory.create(fis);
		int row = JavaUtil.createobjforJavaUtil().generateRandomnumForsaldd();
		return workbook.getSheet("Salutation type").getRow(row).getCell(0).getStringCellValue();
	}
	/**
	 * @author Anusha
	 * @ Description :read organisation name from excel
	 * @return org name
	 */
	public String readorgnamefrmExcel() throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(IAutoconstant.excelpath);
		Workbook workbook = WorkbookFactory.create(fis);
		int row = JavaUtil.createobjforJavaUtil().generaterandomnumfororg();
		return workbook.getSheet("Organisation name").getRow(row).getCell(0).getStringCellValue();
	}
	/**
	 * @author Anusha
	 * Description: handling child window dropdown value from excel
	 * @return childwindow In dd value
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String readchildInDDfromExcel() throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(IAutoconstant.excelpath);
		Workbook workbook = WorkbookFactory.create(fis);
		return workbook.getSheet("Child In dd").getRow(1).getCell(0).getStringCellValue();
	}
	

}
