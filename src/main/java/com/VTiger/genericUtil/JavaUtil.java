package com.VTiger.genericUtil;

import java.util.Random;

import com.github.javafaker.Faker;

public class JavaUtil 
{
	private JavaUtil()
	{
		
	}
	/**
	 * @author Anusha
	 * Description: This method create obj for JavaUtil
	 * 
	 * @return objforJavaUtil
	 */
	public static JavaUtil createobjforJavaUtil()
	{
		JavaUtil js=new JavaUtil();
		return js;
	}
	/**
	 * @author Anusha
	 * description :This method generate random numbers
	 * 
	 * @return Random number
	 */
	public int generateRandomnumber()
	{
		Random r=new Random();
		return r.nextInt(1000);
	}
	/**
	 * @author Anusha
	 * 
	 * Description:This method generates random fullname
	 * @return randomfullname
	 */
	public String fakefullname()
	{
		Faker f=new Faker();
		return f.name().fullName();
	}
	
	/**
	 * @author Anusha
	 * Description:This method generates random firstname
	 * 
	 * @return
	 */
	public String fakeFirstName()
	{
		Faker f=new Faker();
		return f.name().firstName();
	}
	
	/**
	 * @author Anusha
	 * Description:This method generates random lastname
	 * 
	 * @return random lastname
	 */
	public String fakeLastName()
	{
		Faker f=new Faker();
		return f.name().lastName();
	}
	/**
	 * @author Anusha
	 * Description:This method select random number from excel
	 * 
	 * @return number
	 */
	public int generateRandomnumForInddd()
	{
		Random r=new Random();
		return r.nextInt(31);
	}
	/**
	 * @author Anusha
	 * Description:This method select random number from excel
	 * 
	 * @return number
	 */
	public int generateRandomnumForRatedd()
	{
		Random r=new Random();
		return r.nextInt(5);
	}
	/**
	 * @author Anusha
	 * Description:This method select random number from excel
	 * 
	 * @return number
	 */
	public int generateRandomnumForTypedd()
	{
		Random r=new Random();
		return r.nextInt(10);
	}
	/**
	 * @author Anusha
	 * Description:This method select random number from excel
	 * 
	 * @return number
	 */
	public int generateRandomnumForIndd()
	{
		Random r=new Random();
		return r.nextInt(6);
	}
	/**
	 * @author Anusha
	 * Description :This method select random number from salutationtype excel
	 * 
	 * @return number
	 */
	public int generateRandomnumForsaldd()
	{
		Random r=new Random();
		return r.nextInt(5);
	}
	/**
	 * @author Anusha
	 * Description:This method generates random number for org window from excel
	 * @return number
	 */
	public int generaterandomnumfororg()
	{
		Random r=new Random();
		return r.nextInt(8);
	}
	/**
	 * @author Anusha
	 * Description: this method generates fake phonenumber
	 * @return phonenumber
	 */
	public String fakePhoneno()
	{
		Faker f=new Faker();
		return f.phoneNumber().phoneNumber();
	}

}
