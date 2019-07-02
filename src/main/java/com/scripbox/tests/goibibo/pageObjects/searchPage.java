package com.scripbox.tests.goibibo.pageObjects;

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
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/div/div[2]/div/div[1]/div[2]/div[1]/div/span[1]")
	public WebElement oneWaySelector;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"gosuggest_inputSrc\"]")
	public WebElement fromAirport;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"gosuggest_inputDest\"]")
	public WebElement toAirport;
	
	
	@FindBy(how = How.CSS, using = "css=.dF:nth-child(8) > .inputSrch")
	public WebElement fromDate;
	
	@FindBy(how = How.CSS, using = "css=.dF:nth-child(6) > .inputSrch")
	public WebElement toDate;

}
