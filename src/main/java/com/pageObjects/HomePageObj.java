package com.pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utitility.AbstractComponents;

public class HomePageObj extends AbstractComponents 
{

	public WebDriver driver;
	public HomePageObj(WebDriver driver)
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	

	
	@FindBy(css=".L0Z3Pu")
	WebElement searchBtn;
	
	
	@FindBy(xpath="//input[@name='q']")
	WebElement searchbBox;
	
	@FindBy(xpath="//div[@class='_2QfC02']/button")
	WebElement popupClose; 
	
	public void searchbox(String text)
	{
		type(searchbBox,text);
		
	}
	
	
	public void searchBtn()
	{
		click(searchBtn);
		
	}
	

	public void popupclose()
	{
		click(popupClose);
		
	}
	
}
