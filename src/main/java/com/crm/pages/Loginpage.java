package com.crm.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.base.Testbase;


public class Loginpage extends Testbase {
	
	@FindBy(name="username")
	WebElement name;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement lgbbtn;
	
	@FindBy(xpath="//img[@alt='free crm logo']")
	WebElement logo;
	
	public Loginpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean crmlogo()
	{
		boolean logoimg=logo.isDisplayed();
		return logoimg;
	}
	
	
	public String validateLoginpageTitle()
	{
		return  driver.getTitle();
	}
	
	public Homepage login(String un,String pass)
	{
		name.sendKeys(un);
		password.sendKeys(pass);
		
		WebDriverWait wt=new WebDriverWait(driver, 3);
		boolean invisible=wt.until(ExpectedConditions.invisibilityOfElementLocated(By.id("preloader")));
		if(invisible)
		{
			lgbbtn.click();
		}
		
		return new Homepage();
	}
	

	
}
