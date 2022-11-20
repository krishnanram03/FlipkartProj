package com.pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObj 
{

	public WebDriver driver;
	public HomePageObj(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	
	public WebElement searchbox()
	{
		return searchBtn;
		
	}
	
	
	public WebElement searchBtn()
	{
		return searchBtn;
		
	}
	

	public WebElement popupclose()
	{
		return popupclose;
		
	}
	
	@FindBy(css=".L0Z3Pu")
	WebElement searchBtn;
	
	
	@FindBy(xpath="//input[@name='q']")
	WebElement searchbox;
	
	@FindBy(xpath="//div[@class='_2QfC02']/button")
	WebElement popupclose; 
	
}
