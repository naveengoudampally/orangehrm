package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.hrms.utility.Log;

public class General extends Global {
	
	
		public void openapplication() throws Exception
		{
			try
			{
				System.out.println("open application");
				Log.info("open application");
			System.setProperty("webdriver.chrome.driver", "G:\\Naveen Workspace\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.navigate().to(url);
		    }
			catch(Exception e)
			{
				System.out.println("exception occured");
		    }
	    }

    	public void waitstatement() throws Exception
    	{
		  try
		  {
		   Thread.sleep(3000);
		  }
		catch(Exception e)
		  {
			System.out.println("exception occured");
		  }
		}
	
	  public void verifyhrmstitle()
	   {
		try
		{
			Log.info("title matched hrms");
		if(driver.getTitle().equals("OrangeHRM - New Level of HR Management"))
           System.out.println("Title matched");
		 		else
		{
			System.out.println("Title not matched and expected title is :"+driver.getTitle());
	            
		}
		}
		catch(Exception e)
		{
			System.out.println("exception occured");
		}		
	}
	 public void verifytitle()
	 {
		try
		{
			Log.info("verified title");
		if(driver.getTitle().equals("OrangeHRM"))
	           System.out.println("Title matched");
			else 
			{
				System.out.println("Title not matched and expected title is :"+driver.getTitle());
			}
		}
		catch(Exception e)
		{
			System.out.println("exception occured");
		}
	}
	public void verifywelcometext()
	{
		
		try
		{
		Log.info("welcome admin is present");
		if(driver.getPageSource().contains("Welcome admin"))
			System.out.println("welcome admin is present");
		else 
		{
			System.out.println("welcome admin is not present");
		}
		}
		catch(Exception e) 
		{
			System.out.println("exception occured");
		}
	}
	
	public void pimmenu()
	{
		try 
		{
			Log.info("click on pim menu");
		 WebElement ele=driver.findElement(By.linkText(link_pim));
		 Actions action=new Actions(driver);
		 action.moveToElement(ele).perform();
	     }
		catch(Exception e) 
		{
			System.out.println("exception occured");
		}
	}
	
	public void addemplink()
	{
		try 
		{
			Log.info("add emp link");
		driver.findElement(By.linkText(link_add)).click();
	    }
	    catch(Exception e)
		{
		System.out.println("exception occured");
	    }
	}
	
	public void closebrowser() 
	{
		try {
			Log.info("closng browser");
		driver.quit();
		}
		catch(Exception e){
		System.out.println("exception occured");	
		}
	}
	 public void login() throws Exception
	 {
		try 
		{
			Log.info("login succesfully");
		driver.findElement(By.name(txt_name_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_name_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		Thread.sleep(3000);
		}
		catch(Exception e) {
			System.out.println("exception occured");
		}	
	}
	public void logout() 
	{
		try {
			Log.info("logout succesfully");
		driver.findElement(By.linkText(link_logout)).click();
		}
		catch(Exception e) {
			System.out.println("exception occured");
		}	
	}
	
	public void add() throws Exception 
	{
		try {
		Log.info("adding emp");	
		System.out.println("adding new emp");
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath(btn_value_add)).click();
		driver.findElement(By.name(txt_name_firstname)).sendKeys(fn);
		driver.findElement(By.name(txt_name_lastname)).sendKeys(ln);
		driver.findElement(By.id(btn_id_save)).click();
		Thread.sleep(3000);	
		driver.switchTo().defaultContent();
	    }
		catch(Exception e) {
			System.out.println("exception occured");
		}
	}
	public void framein() 
	{
		try {
			Log.info("frame in");
		driver.switchTo().frame(0);
	     }
		catch(Exception e)
		{
		 System.out.println("exception occured");	
		}
	}
		
	public void frameout() 
	{
		
		try 
		{
			Log.info("frame out");
		driver.switchTo().defaultContent();
		}
		catch(Exception e)
		{
			System.out.println("exception occured");
		}
	}
	public void addempdetails()
	{
		try {
			Log.info("add emp details");
			System.out.println("adding employee");
		driver.findElement(By.name(txt_name_firstname)).sendKeys(fn);
		driver.findElement(By.name(txt_name_lastname)).sendKeys(ln);
		driver.findElement(By.id(btn_id_save)).click();
		}
		catch(Exception e) {
			System.out.println("exception occured");
		}
	}
	
	public void del() throws Exception 
	{
		try 
		{
			Log.info("deleting emp");
		System.out.println("deleting emp");
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		driver.findElement(By.xpath(check_box)).click();
		driver.findElement(By.xpath(btn_value_del)).click();
		driver.switchTo().defaultContent();		
	   }
		catch(Exception e)
		{
			System.out.println("exception occured");
		}
	}
	
	
}
