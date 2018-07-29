package com.Calc;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;

import PageFactory.PageObjects;
import support.BaseTest;
import support.TestContext;

public class NegativeOp extends BaseTest {
	PageObjects objButtons;
	@Test //verify that user is able to operate with negative digits
	public void test() throws InterruptedException {
		try {
			objButtons = new PageObjects(TestContext.getDriver()); // link to the PageObjects
			assertEquals("google calculator - Google Search", TestContext.getDriver().getTitle());//get title from page
			Thread.sleep(1000);
			
			String minS = "btnMinus";
			objButtons.exprsn(minS);
			
			String dgt1 = "btnSix";
			objButtons.exprsn(dgt1);
			String dgtOut = objButtons.getOutput();
			String dgt1Out = "-6";
			assertEquals(dgtOut, dgt1Out);
			System.out.println("Inputting result is " + dgtOut + " Expected result is " + dgt1Out);
			Thread.sleep(500);
			
			String btnExp = "btnMinus";
			objButtons.exprsn(btnExp);
			//System.out.println(btnExp);
			Thread.sleep(500);
					
			String dgt2 = "btnTwo";
			objButtons.exprsn(dgt2);
			String ExpOut = objButtons.getOutput();
			String ExpEx = "-6 - 2";
			assertEquals(ExpOut, ExpEx);
			System.out.println("Inputting result is " + ExpOut + " Expected result is " + ExpEx);
			Thread.sleep(500);
			
			String btnEql = "btnEquals";
			objButtons.exprsn(btnEql);
			//System.out.println(btnEql);
			String res = objButtons.getOutput();
			String exp = "-8";
			assertEquals(exp, res);
			System.out.println("Actual result is " + res + " Expected result is " + exp);
			String btnClrR = "btnClrRes";
			objButtons.exprsn(btnClrR);	
			Thread.sleep(500);
			 }catch(NoSuchElementException e) {
	             fail("I can't find element's value");
	     }
		try {
		String minS = "btnMinus";
		objButtons.exprsn(minS);
		
		String dgt1 = "btnFive";
		objButtons.exprsn(dgt1);
		String dgtOut = objButtons.getOutput();
		String dgt1Out = "-5";
		assertEquals(dgtOut, dgt1Out);
		System.out.println("Inputting result is " + dgtOut + " Expected result is " + dgt1Out);
		Thread.sleep(500);
		
		String btnExp = "btnPlus";
		objButtons.exprsn(btnExp);
		//System.out.println(btnExp);
		Thread.sleep(500);
				
		String dgt2 = "btnTwo";
		objButtons.exprsn(dgt2);
		String ExpOut = objButtons.getOutput();
		String ExpEx = "-5 + 2";
		assertEquals(ExpOut, ExpEx);
		System.out.println("Inputting result is " + ExpOut + " Expected result is " + ExpEx);
		Thread.sleep(500);
		
		String btnEql = "btnEquals";
		objButtons.exprsn(btnEql);
		//System.out.println(btnEql);
		String res = objButtons.getOutput();
		String exp = "-3";
		assertEquals(exp, res);
		System.out.println("Actual result is " + res + " Expected result is " + exp);
		String btnClrR = "btnClrRes";
		objButtons.exprsn(btnClrR);	
		Thread.sleep(500);
		 }catch(NoSuchElementException e) {
             fail("I can't find element's value");
     }
			
	}

}
