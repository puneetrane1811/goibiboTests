package com.scripbox.goibibo.testInputs;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import com.scripbox.goibibo.inputwrappers.excelParser;
import com.scripbox.goibibo.inputwrappers.excelWrapper;
import com.scripbox.goibibo.pageObjects.searchPage;

import org.openqa.selenium.support.ui.WebDriverWait;

public class checkPageAndSearchInput {
	
	  public excelWrapper vals;
	  private searchPage srpg;
	  WebDriverWait wait;
	
/*	public void checkElements() {
		try {
		wait.until(ExpectedConditions.visibilityOf(this.srpg.fromAirport));
		wait.until(ExpectedConditions.visibilityOf(this.srpg.search));
		
		Assert.assertTrue(this.srpg.toAirport.isDisplayed(), "Unable to find the to airport input box");
		
		
		Assert.assertTrue(this.srpg.multiTripSelector.isDisplayed(), "Unable to find the round trip selector option");
		Assert.assertTrue(this.srpg.studentFareButton.isDisplayed(), "Unable to find the student Fare button");
		Assert.assertTrue(this.srpg.search.isDisplayed(), "Unable to find the search button");
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
	}*/
	
	public void enterFromAirport() {
		wait.until(ExpectedConditions.visibilityOf(this.srpg.fromAirport));
		Assert.assertTrue(this.srpg.fromAirport.isDisplayed(), "Unable to find the from airport input box");
		
		String origin = vals.getFromAirport();
		srpg.fromAirport.click();
		srpg.fromAirport.sendKeys(origin);
		
	}
	
	public void enterToAirport() {
		wait.until(ExpectedConditions.visibilityOf(this.srpg.toAirport));
		Assert.assertTrue(this.srpg.toAirport.isDisplayed(), "Unable to find the to airport input box");
		
		String dest = vals.getFromAirport();
		srpg.toAirport.click();
		srpg.toAirport.sendKeys(dest);
		
	}
	
	public void selectOneWay() {
		wait.until(ExpectedConditions.visibilityOf(this.srpg.oneWaySelector));
		Assert.assertTrue(this.srpg.oneWaySelector.isSelected(), "Unable to find the one way trip selector option");
		
		if(vals.getoneWayFlag().equals("TRUE"))
		srpg.oneWaySelector.click();
		
	}
	
	public void selectRoundTrip() {
		wait.until(ExpectedConditions.visibilityOf(this.srpg.roundTripSelector));
		Assert.assertTrue(this.srpg.roundTripSelector.isDisplayed(), "Unable to find the round trip selector option");
		
		if(vals.getRoundTrip().equals("TRUE"))
			srpg.roundTripSelector.click();
		
	}
	
	public void selectMultiTrip() {
		wait.until(ExpectedConditions.visibilityOf(this.srpg.multiTripSelector));
		Assert.assertTrue(this.srpg.multiTripSelector.isDisplayed(), "Unable to find the multi trip selector option");
		
		if(vals.getMultiTrip().equals("TRUE"))
			srpg.multiTripSelector.click();
		
	}
	
	public void selectStudentFare() {
		wait.until(ExpectedConditions.visibilityOf(this.srpg.studentFareButton));
		Assert.assertTrue(this.srpg.studentFareButton.isDisplayed(), "Unable to find the multi trip selector option");
		
		if(vals.getStudentFare().equals("TRUE"))
			srpg.studentFareButton.click();
		
	}
	
	public void search() {
		wait.until(ExpectedConditions.visibilityOf(this.srpg.search));
		Assert.assertTrue(this.srpg.search.isDisplayed(), "Unable to find the search button");
		srpg.search.click();
	}


}
