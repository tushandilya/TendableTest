package com.tendable.pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.tendable.utilities.BaseClass;

public class ContactUsPage extends BaseClass{
	
	WebDriver ldriver;

	public ContactUsPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath="//a[text()='Contact Us']")
	WebElement ContactUs;
	
	@FindBy(xpath="//button[@data-target='.toggle-163701']")
	WebElement Marketing;
	
	@FindBy(xpath="//form[@id='contactMarketingPipedrive-163701']//input[@id='form-input-organisationName']")
	WebElement OrgName;
	
	@FindBy(xpath="//form[@id='contactMarketingPipedrive-163701']//input[@id='form-input-fullName']")
	WebElement FullName;
	
	@FindBy(xpath="//form[@id='contactMarketingPipedrive-163701']//input[@id='form-input-cellPhone']")
	WebElement CellPhone;
	
	@FindBy(xpath="//form[@id='contactMarketingPipedrive-163701']//input[@id='form-input-email']")
	WebElement Email;
	
	@FindBy(xpath="//form[@id='contactMarketingPipedrive-163701']//select[@id='form-input-jobRole']")
	WebElement JobRole;
	
	@FindBy(xpath="//form[@id='contactMarketingPipedrive-163701']//input[@id='form-input-consentAgreed-0']")
	WebElement IAgree;
	
	@FindBy(xpath="//form[@id='contactMarketingPipedrive-163701']//button[@data-original-text='Submit']")
	WebElement Submit;
	
	@FindBy(xpath="//div[@class='ff-form-errors']/p")
	WebElement ErrorText;
	
	
	public void contactUsAction() throws InterruptedException 
	{
		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		ContactUs.click();
		Marketing.click();
		WebDriverWait wait = new WebDriverWait(ldriver,Duration.ofSeconds(5));
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		wait.until(ExpectedConditions.visibilityOf(FullName));
		FullName.sendKeys("Tushar");
		OrgName.sendKeys("Tendable");
		CellPhone.sendKeys("2345678921");
		Email.sendKeys("abc@xyz.com");
		Thread.sleep(1000); //Added due to sudden failure in explicit wait
		js.executeScript("arguments[0].scrollIntoView();", JobRole);
		wait.until(ExpectedConditions.elementToBeClickable(JobRole));
		Select select = new Select(JobRole);
		select.selectByIndex(2);
		
		Thread.sleep(2000);	//Added due to sudden failure in explicit wait
	    js.executeScript("arguments[0].scrollIntoView();", IAgree);
	    wait.until(ExpectedConditions.elementToBeClickable(IAgree));
		IAgree.click();
		
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView();", Submit);
	    wait.until(ExpectedConditions.elementToBeClickable(Submit));
		Submit.click();
		
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", ErrorText);
		wait.until(ExpectedConditions.visibilityOf(ErrorText));
        String str = ErrorText.getText();
  		Assert.assertEquals(str, "Sorry, there was an error submitting the form. Please try again.");
		
	
	}
	
}
