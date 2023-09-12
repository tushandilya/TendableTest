package com.tendable.testcase;

import org.testng.annotations.Test;

import com.tendable.pageObjects.ContactUsPage;
import com.tendable.pageObjects.HomePage;
import com.tendable.utilities.BaseClass;

public class Tendable_TestCase  extends BaseClass{
	
	
	
	@Test
	public void accessibility()
	{
		HomePage hm1 = new HomePage(driver);
		hm1.accessOurStory();
		hm1.accessOurSolution();
		hm1.accessWhyTendable();
		hm1.accessTendableHome();
		
	}
	@Test
	public void contactUs() throws InterruptedException {
		ContactUsPage ct1 = new ContactUsPage(driver);
		ct1.contactUsAction();
		
	}
	

}
