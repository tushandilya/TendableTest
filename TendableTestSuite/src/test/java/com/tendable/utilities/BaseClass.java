package com.tendable.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {

	ReadConfig readconfig = new ReadConfig();
	
	public String BaseURL=readconfig.getApplicationURL();
	
	public static WebDriver driver;

	@Parameters("browser")
	@BeforeMethod
	public void setup(String br) throws InterruptedException
	{
		if(br.equals("chrome"))
		{
			 
		
			  driver = WebDriverManager.chromedriver().create();
			  driver.manage().window().maximize();
		 
		}
		else if(br.equals("firefox"))
		{
		driver = WebDriverManager.firefoxdriver().create();
		driver.manage().window().maximize();
		
		//logger = Logger.getLogger("Log4j.properties");
		}
		else if(br.equals("edge"))
		{
		driver = WebDriverManager.edgedriver().create();
		driver.manage().window().maximize();
		
		//logger = Logger.getLogger("Log4j.properties");
		}
		
		driver.get(BaseURL);
	}
	
	@AfterMethod
	public void tearDown()
	{
		 driver.quit();
	}
	
	
	
}