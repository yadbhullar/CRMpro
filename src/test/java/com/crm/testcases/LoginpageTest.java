package com.crm.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.base.Testbase;
import com.crm.pages.Homepage;
import com.crm.pages.Loginpage;



public class LoginpageTest extends Testbase{
	
	Loginpage loginpage;
	Homepage homepage;
	
	public LoginpageTest()
	{
		//calling of parent class constructor
		super();
		
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		loginpage=new Loginpage();
		
		
	}

	@Test(priority=1)
	public void loginPageTitleTest()
	{
		String title=loginpage.validateLoginpageTitle();
		
		Assert.assertEquals(title,"#1 Free CRM software in the cloud for sales and service");
	}
	
	@Test(priority=2)
	public void crmlogoTest()
	{
		boolean logoimg=loginpage.crmlogo();
		Assert.assertTrue(logoimg);
	}
	
	@Test(priority=3)
	public void logintest()
	{
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
	
	

}
