package com.scripbox.goibibo.tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;

import com.scripbox.goibibo.base.pageSuite;
import com.scripbox.goibibo.inputwrappers.excelParser;
import com.scripbox.goibibo.pageObjects.searchPage;
import com.scripbox.goibibo.testInputs.checkPageAndSearchInput;

public class checkPageAndSearchTest extends pageSuite {
	
	public checkPageAndSearchInput input;

  
@BeforeClass
public void beforeClass() {
	setUp();
	this.webDriver.get("https://www.goibibo.com");
	this.webDriver.manage().window().maximize();
	
}

@Test
public void checkPage() {
	//input.checkElements();
	input.enterFromAirport();
	input.enterToAirport();
	input.selectOneWay();
	input.selectRoundTrip();
	input.selectMultiTrip();
	input.selectStudentFare();
	input.search();
}
	
@AfterMethod
public void afterClass() {
	this.webDriver.quit();
}

}
