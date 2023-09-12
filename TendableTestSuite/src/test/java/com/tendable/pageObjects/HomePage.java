package com.tendable.pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.tendable.utilities.BaseClass;

public class HomePage extends BaseClass{
	WebDriver ldriver;

	public HomePage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath="//a[text()='Our Story']")
	WebElement OurStory;
	
	@FindBy(xpath="//a[@class='logo']/img")
	WebElement tendableHome;
	
	@FindBy(xpath="//a[text()='Our Solution']")
	WebElement OurSolution;
	
	@FindBy(xpath="//a[text()='Why Tendable?']")
	WebElement WhyTendable;
	
	@FindBy(xpath="//div[@class='button-links-panel']/a[text()='Request a Demo']")
	WebElement RequestDemo;
	
	
	
	
	public void accessOurStory()
	{
		   ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			boolean Flag= OurStory.isDisplayed();
			Assert.assertTrue(Flag);
			OurStory.click();
			boolean flag1 = RequestDemo.isEnabled(); 
			Assert.assertTrue(flag1); 
			String curUrl = driver.getCurrentUrl();
			Assert.assertEquals(curUrl, "https://www.tendable.com/our-story");
	
	}
	public void accessTendableHome()
	{   
		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		boolean Flag = tendableHome.isDisplayed();
		Assert.assertTrue(Flag);
		tendableHome.click();
		boolean flag1 = RequestDemo.isEnabled(); 
		Assert.assertTrue(flag1); 
		String curUrl = driver.getCurrentUrl();
		Assert.assertEquals(curUrl, "https://www.tendable.com/");

	}
	
	public void accessOurSolution()
	{
		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		boolean Flag = OurSolution.isDisplayed();
		Assert.assertTrue(Flag);
		OurSolution.click();
		boolean flag1 = RequestDemo.isEnabled(); 
		Assert.assertTrue(flag1); 
		String curUrl = driver.getCurrentUrl();
		Assert.assertEquals(curUrl, "https://www.tendable.com/our-solution");

	}
	
	public void accessWhyTendable()
	{
		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		boolean Flag = WhyTendable.isDisplayed();
		Assert.assertTrue(Flag);
		WhyTendable.click();
	    boolean flag1 = RequestDemo.isEnabled(); 
		Assert.assertTrue(flag1); 
		String curUrl = driver.getCurrentUrl();
		Assert.assertEquals(curUrl, "https://www.tendable.com/why-tendable");

	}
	
	
}
