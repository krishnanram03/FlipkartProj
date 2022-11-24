package com.utitility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractComponents 
{

WebDriver driver;
WebDriverWait wait;

public AbstractComponents(WebDriver driver)
{
this.driver = driver;
wait=new WebDriverWait(this.driver,Duration.ofSeconds(20));
}
public void type(WebElement element,String text)
{
	
	wait.until(ExpectedConditions.visibilityOf(element));
	element.sendKeys(text);
	
}

public void click(WebElement element)
{
	
	wait.until(ExpectedConditions.elementToBeClickable(element)).click();
}
}
	
