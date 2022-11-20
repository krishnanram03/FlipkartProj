package com.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	public WebDriver driver;
	public Properties prop;
    public FileInputStream fis;
    public ChromeOptions cOptions;
    //public FirefoxOptions fOptions;
    public EdgeOptions eOptions;
	
	@BeforeTest
	public void setup() throws IOException
	{
		
	 System.out.println(System.getProperty("user.dir"));
		fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\utitility\\Config.properties");
		prop = new Properties();
		prop.load(fis);
		if(prop.getProperty("browser").equalsIgnoreCase("chrome") && prop.getProperty("executiontype").equalsIgnoreCase("headed"))
		{
			cOptions = new ChromeOptions();
			cOptions.setHeadless(false);
			cOptions.setExperimentalOption("excludeSwitches",Collections.singletonList("enable-automation"));
			driver = new ChromeDriver(cOptions);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		}
		else if(prop.getProperty("browser").equalsIgnoreCase("chrome") && prop.getProperty("executiontype").equalsIgnoreCase("headless"))
		{
			cOptions = new ChromeOptions();
			cOptions.setHeadless(true);
			driver = new ChromeDriver(cOptions);
			driver.manage().deleteAllCookies();
		}
		 /*else if(prop.getProperty("browser").equalsIgnoreCase("firefox") && prop.getProperty("executiontype").equalsIgnoreCase("headed"))
		{
			fOptions = new FirefoxOptions();
			fOptions.setHeadless(false);
			//fOptions.setExperimentalOption("excludeSwitches",Collections.singletonList("enable-automation"));
			driver = new FirefoxDriver(fOptions);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		}
	
		{
			cOptions = new ChromeOptions();
			cOptions.setHeadless(true);
			driver = new ChromeDriver(cOptions);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		}*/
		else if(prop.getProperty("browser").equalsIgnoreCase("edge") && prop.getProperty("executiontype").equalsIgnoreCase("headed"))
		{
			eOptions = new EdgeOptions();
			eOptions.setHeadless(false);
			eOptions.setExperimentalOption("excludeSwitches",Collections.singletonList("enable-automation"));
			driver = new EdgeDriver(eOptions);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		}
		else if(prop.getProperty("browser").equalsIgnoreCase("edge") && prop.getProperty("executiontype").equalsIgnoreCase("headless"))
		{
			eOptions = new EdgeOptions();
			eOptions.setHeadless(true);
			driver = new EdgeDriver(eOptions);
			driver.manage().deleteAllCookies();
		}
		else
		{
			System.out.println("Kindly opt. a valid execution option");
		}
		driver.get(prop.getProperty("URL"));		
	}
	
	/*@AfterTest
	public void tearDown()
	{
		
		driver.close();
			
	}*/

}
