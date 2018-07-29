package com.Calc;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;

import PageFactory.PageObjects;
import support.BaseTest;
import support.TestContext;

public class TestsMinus extends BaseTest {
	PageObjects objButtons;
	@Test //"Verify that the user is able to subtract"
	public void test() throws InterruptedException {
		try {
		objButtons = new PageObjects(TestContext.getDriver()); // link to the PageObjects
		assertEquals("google calculator - Google Search", TestContext.getDriver().getTitle());//get title from page
		Thread.sleep(500);
		
		String dgt1 = "btnFive";
		objButtons.exprsn(dgt1);
		String dgtOut = objButtons.getOutput();
		String dgt1Out = "5";
		assertEquals(dgtOut, dgt1Out);
		System.out.println("Inputting result is " + dgtOut + " Expected result is " + dgt1Out);
		Thread.sleep(500);
		
		String btnExp = "btnMinus";
		objButtons.exprsn(btnExp);
		//System.out.println(btnExp);
		Thread.sleep(500);
		
		String dgt2 = "btnFour";
		objButtons.exprsn(dgt2);
		String ExpOut = objButtons.getOutput();
		String ExpEx = "5 - 4";
		assertEquals(ExpOut, ExpEx);
		System.out.println("Inputting result is " + ExpOut + " Expected result is " + ExpEx);
		Thread.sleep(500);
		
		String btnEql = "btnEquals";
		objButtons.exprsn(btnEql);
		//System.out.println(btnEql);
		String res = objButtons.getOutput();
		String exp = "1";
		assertEquals(exp, res);
		System.out.println("Actual result is " + res + " Expected result is " + exp);
		String btnClrR = "btnClrRes";
		objButtons.exprsn(btnClrR);	
		Thread.sleep(500);
		 }catch(NoSuchElementException e) {
             fail("I can't find element's value");
     }
		try {
		String dgt1 = "btnOne";
		objButtons.exprsn(dgt1);
		//System.out.println(dgt1);
		Thread.sleep(500);
		String dgt11 = "btnZero";
		objButtons.exprsn(dgt11);
		//System.out.println(dgt1);
		Thread.sleep(500);
		String btnExp = "btnMinus";
		objButtons.exprsn(btnExp);
		//System.out.println(btnExp);
		Thread.sleep(500);
		String dgt2 = "btnTwo";
		objButtons.exprsn(dgt2);
		//System.out.println(dgt2);
		Thread.sleep(500);
		String btnEql = "btnEquals";
		objButtons.exprsn(btnEql);
		//System.out.println(btnEql);
		String res = objButtons.getOutput();
		String exp = "8";
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
