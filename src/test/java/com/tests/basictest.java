package com.tests;

import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pageObjects.HomePageObj;

public class basictest extends BaseClass
{
	HomePageObj hpage;
	@Test
	public void firstest() throws Exception

	{
		hpage= new HomePageObj(driver);
		Thread.sleep(5000);
		hpage.popupclose().click();
		hpage.searchbox().sendKeys("Iphone X");
		hpage.searchBtn().click();

	}



}
