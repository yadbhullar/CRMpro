package com.crm.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.base.Testbase;
import com.crm.pages.Homepage;
import com.crm.pages.Loginpage;

public class HomepageTest extends Testbase {
	
	Loginpage loginpage;
	Homepage homepage;
	
	public HomepageTest()
	{
		
		super();
		
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		loginpage=new Loginpage();
		homepage=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		
	}
	
	@Test(priority=1)
	public void loginPageTitleTest()
	{
		String title= driver.getTitle();
		Assert.assertEquals(title, "#1 Free CRM software in the cloud for sales and service");
	}
	
	

}
