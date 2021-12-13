package com.sdet.practise;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {

	public static void main(String[] args) throws IOException 
	{
		
		String dirpath = System.getProperty("user.dir");
		String propertypath = dirpath+"/dataproperties.properties";
		FileInputStream fis=new FileInputStream(propertypath);
		Properties p=new Properties();
		p.load(fis);
		String urlofapp = p.getProperty("url");
		System.out.println(urlofapp);
		

	}

}
