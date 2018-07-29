package com.Calc;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;

import PageFactory.PageObjects;
import support.BaseTest;
import support.TestContext;

public class decimalOp extends BaseTest {
	PageObjects objButtons;
	@Test //verify that user is able to operate with decimal digits
	public void test() throws InterruptedException {
		String exp = "1.1";
		try {
			objButtons = new PageObjects(TestContext.getDriver()); // link to the PageObjects
			assertEquals("google calculator - Google Search", TestContext.getDriver().getTitle());//get title from page
			Thread.sleep(1000);
			
			String dgt0 = "btnZero";
			objButtons.exprsn(dgt0);
			
			String pnt = "btnPoint";
			objButtons.exprsn(pnt);
			
			String dgt1 = "btnNine";
			objButtons.exprsn(dgt1);
			String dgtOut = objButtons.getOutput();
			String dgt1Out = "0.9";
			assertEquals(dgtOut, dgt1Out);
			System.out.println("Inputting result is " + dgtOut + " Expected result is " + dgt1Out);
			Thread.sleep(500);
			
			String btnExp = "btnPlus";
			objButtons.exprsn(btnExp);
			//System.out.println(btnExp);
			Thread.sleep(500);
			
			String dgt02 = "btnZero";
			objButtons.exprsn(dgt02);
			
			String pnt2 = "btnPoint";
			objButtons.exprsn(pnt2);
			String dgt2 = "btnTwo";
			objButtons.exprsn(dgt2);
			String ExpOut = objButtons.getOutput();
			String ExpEx = "0.9 + 0.2";
			assertEquals(ExpOut, ExpEx);
			System.out.println("Inputting result is " + ExpOut + " Expected result is " + ExpEx);
			Thread.sleep(500);
			
			String btnEql = "btnEquals";
			objButtons.exprsn(btnEql);
			//System.out.println(btnEql);
			String res = objButtons.getOutput();
			
			assertEquals(exp, res);
			System.out.println("Actual result is " + res + " Expected result is " + exp);
			String btnClrR = "btnClrRes";
			objButtons.exprsn(btnClrR);	
			Thread.sleep(500);
			 }catch(NoSuchElementException e) {
	             fail("I can't find element's value");
	     }
		try {
						
			String pnt = "btnPoint";
			objButtons.exprsn(pnt);
			
			String dgt1 = "btnNine";
			objButtons.exprsn(dgt1);
			String dgtOut = objButtons.getOutput();
			String dgt1Out = ".9";
			assertEquals(dgtOut, dgt1Out);
			System.out.println("Inputting result is " + dgtOut + " Expected result is " + dgt1Out);
			Thread.sleep(500);
			
			String btnExp = "btnPlus";
			objButtons.exprsn(btnExp);
			//System.out.println(btnExp);
			Thread.sleep(500);	
			
			String pnt2 = "btnPoint";
			objButtons.exprsn(pnt2);
			
			String dgt2 = "btnTwo";
			objButtons.exprsn(dgt2);
			String ExpOut = objButtons.getOutput();
			String ExpEx = ".9 + .2";
			assertEquals(ExpOut, ExpEx);
			System.out.println("Inputting result is " + ExpOut + " Expected result is " + ExpEx);
			Thread.sleep(500);
			
			String btnEql = "btnEquals";
			objButtons.exprsn(btnEql);
			//System.out.println(btnEql);
			String res = objButtons.getOutput();
			
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
