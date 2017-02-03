package com.test.accelarators;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionEngine extends TestEngine{
	
	static Logger log = Logger.getLogger(ActionEngine.class.getName());
	
	public boolean actionPerform(WebElement ele)
	{
		boolean flag = false;
		
		try
		{
			Actions a = new Actions(driver);
			a.moveToElement(ele).build().perform();
			flag = true;
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
		
		finally
		{
			if(!flag)
			{
				//failure
				//write to logs, html and take screenshot
				log.error("Unable to perform action on webelement");
				throw new RuntimeException("Unable to perform click action on element" +ele);
			}
			else
			{
				//success and report it on html
				log.info("Successfully performed action on webelement");
			}
		}
	}
	
	public boolean click(WebElement ele)
	{
		boolean flag=false;
		
		try
		{
			ele.click();
			flag=true;
			return flag;
		}
		catch(Exception e)
		{
			return flag;
		}
		
		finally
		{
			if(!flag)
			{
				//failure
				//write to logs, html and take screenshot
				log.error("Unable to perform click on webelement");
				throw new RuntimeException("Unable to perform click action on element" +ele);
			}
			else
			{
				//success and report it on html
				log.info("Successfully performed click action");
			}
		}
		
	}
	
	public boolean sendKeys(WebElement ele, String data)
	{
		boolean flag=false;
		
		try
		{
			ele.sendKeys(data);
			flag=true;
			return flag;
		}
		catch(Exception e)
		{
			return flag;
		}
		
		finally
		{
			if(!flag)
			{
				log.error("Unable to perform send keys : " +data);
				throw new RuntimeException("Unable to perform sendkeys action on element :" +ele);
			}
			else
			{
				log.info("Send keys performed successfully :" +data);
			}
		}
	}

}
