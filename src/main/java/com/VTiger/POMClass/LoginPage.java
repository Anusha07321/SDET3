package com.VTiger.POMClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.VTiger.genericUtil.FileUtil;

public class LoginPage //Rule1
{
	WebDriver driver;
	@FindBy(name="user_name") 
	private WebElement username;
	
	@FindBy(name="user_password")
	private WebElement password;
	
	@FindBy(id="submitButton")
	private WebElement loginbtn;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void logintoApp() throws IOException
	{
		username.sendKeys(FileUtil.objforFileUtil().readDataFrompropfile("username"));
		password.sendKeys(FileUtil.objforFileUtil().readDataFrompropfile("password"));
		loginbtn.click();
	}
	
	

}
