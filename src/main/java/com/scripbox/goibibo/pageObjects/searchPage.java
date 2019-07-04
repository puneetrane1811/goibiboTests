package com.scripbox.goibibo.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class searchPage extends pageBase{

	public searchPage(WebDriver driver) {
		super(driver, pageTitle);
		// TODO Auto-generated constructor stub
	}
	
	public final static String pageTitle="Flight Ticket Booking";
	
	@FindBy(how = How.CSS, using = ".fltSwitchOpt > .curPointFlt:nth-child(1)")
	public WebElement oneWaySelector;
	
	@FindBy(how = How.CSS, using = ".fltSwitchOpt > .curPointFlt:nth-child(2)")
	public WebElement roundTripSelector;
	
	@FindBy(how = How.CSS, using = ".fltSwitchOpt > .curPointFlt:nth-child(3)")
	public WebElement multiTripSelector;
	
	@FindBy(how = How.CSS, using = "#gosuggest_inputSrc")
	public WebElement fromAirport;
	
	@FindBy(how = How.CSS, using = "#gosuggest_inputDest")
	public WebElement toAirport;
		
	@FindBy(how = How.CSS, using = "css=.dF:nth-child(5) > .inputSrch")
	public WebElement fromDate;
	
	@FindBy(how = How.CSS, using = "css=.dF:nth-child(6) > .inputSrch")
	public WebElement toDate;
	
	@FindBy(how = How.CSS, using = "#gi_search_btn")
	public WebElement search;
	
	@FindBy(how = How.CSS, using = "#student_fare_check")
	public WebElement studentFareButton;

}
