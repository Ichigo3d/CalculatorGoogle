package com.Calc;

import static org.junit.Assert.*;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;


import PageFactory.PageObjects;
import support.BaseTest;
import support.TestContext;

public class CheckVisibility extends BaseTest {

	PageObjects objButtons;

	@Test //Verify the visibility of calculator elements on the screen
	public void test() throws InterruptedException {
		
		try {
			objButtons = new PageObjects(TestContext.getDriver()); 
			assertEquals("google calculator - Google Search", TestContext.getDriver().getTitle());
			Thread.sleep(500);
		
			assertTrue(isElementPresent(By.xpath("//span[contains(text(),'÷')]")));// visible divide button
			assertTrue(isElementPresent(By.xpath("//span[contains(text(),'×')]")));// visible multiply button
			assertTrue(isElementPresent(By.xpath("//span[contains(text(),'−')]")));// visible minus button
			assertTrue(isElementPresent(By.xpath("//span[@class='cwbts'][contains(text(),'+')]")));// visible plus button
			assertTrue(isElementPresent(By.xpath("//span[@class='cwbts'][contains(text(),'=')]")));// visible "=" button
			assertTrue(isElementPresent(By.xpath("//span[@class='cwbts'][contains(text(),'.')]")));// visible point button
			assertTrue(isElementPresent(By.xpath("//span[contains(text(),'%')]")));// visible percentage button
			assertTrue(isElementPresent(By.xpath("//span[@class='cwbts'][contains(text(),')')]")));// visible RightParenthesis button
			assertTrue(isElementPresent(By.xpath("//span[@class='cwbts'][contains(text(),'(')]")));// visible LeftParenthesis button
			
			assertTrue(isElementPresent(By.xpath("//span[@class='cwbts'][contains(text(),'0')]")));// visible 0 button
			assertTrue(isElementPresent(By.xpath("//span[@class='cwbts'][contains(text(),'1')]")));// visible 1 button
			assertTrue(isElementPresent(By.xpath("//span[@class='cwbts'][contains(text(),'2')]")));// visible 2 button
			assertTrue(isElementPresent(By.xpath("//span[@class='cwbts'][contains(text(),'3')]")));// visible 3 button
			assertTrue(isElementPresent(By.xpath("//span[@class='cwbts'][contains(text(),'4')]")));// visible 4 button
			assertTrue(isElementPresent(By.xpath("//span[@class='cwbts'][contains(text(),'5')]")));// visible 5 button
			assertTrue(isElementPresent(By.xpath("//span[@class='cwbts'][contains(text(),'6')]")));// visible 6 button
			assertTrue(isElementPresent(By.xpath("//span[@class='cwbts'][contains(text(),'7')]")));// visible 7 button
			assertTrue(isElementPresent(By.xpath("//span[@class='cwbts'][contains(text(),'8')]")));// visible 8 button
			assertTrue(isElementPresent(By.xpath("//span[@class='cwbts'][contains(text(),'9')]")));// visible 9 button
			
			assertTrue(isElementPresent(By.xpath("//div[@id='cwbt42']")));// visible X power Y button
			assertTrue(isElementPresent(By.xpath("//span[contains(text(),'√')]")));// visible Sqr root button
			assertTrue(isElementPresent(By.xpath("//div[@id='cwbt22']")));// visible logarithm button
			assertTrue(isElementPresent(By.xpath("//span[contains(text(),'ln')]")));// visible natur logarithm button
			assertTrue(isElementPresent(By.xpath("//span[contains(text(),'x!')]")));// visible factorial button
			assertTrue(isElementPresent(By.xpath("//span[contains(text(),'EXP')]")));// visible exponential button
			assertTrue(isElementPresent(By.xpath("//div[@id='cwbt31']")));// visible tangent button
			assertTrue(isElementPresent(By.xpath("//div[@id='cwrdc']")));// visible switcher button
			assertTrue(isElementPresent(By.xpath("//div[@id='cwbt40']")));// visible answer button
			assertTrue(isElementPresent(By.xpath("//div[@id='cwbt30']")));// visible euler's number button
			assertTrue(isElementPresent(By.xpath("//span[contains(text(),'π')]")));// visible pi button
			assertTrue(isElementPresent(By.xpath("//span[contains(text(),'Inv')]")));// visible inverse button
			assertTrue(isElementPresent(By.xpath("//span[@id='cwclrbtnCE']")));// visible clear button
			 
			}catch(NoSuchElementException e) {
	             fail("I can't find element's value");
	     }
		}

		private boolean isElementPresent(By xpath) {
			try {
				TestContext.getDriver().findElement(xpath);
	    	    return true;
	    	  }
	    	catch (org.openqa.selenium.NoSuchElementException e) {
	    	    return false;
	    	  }
		}

	}

	

		
		
		
	

