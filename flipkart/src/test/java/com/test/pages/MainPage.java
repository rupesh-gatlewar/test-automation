package com.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
	
	WebDriver driver;
	
	@FindBy(id="twotabsearchtextbox")
	public WebElement textBox;
	
	@FindBy(css="#nav-search-submit-text")
	public WebElement searchButton;
	
	public MainPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
