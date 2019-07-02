package com.scripbox.tests.goibibo.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/*The purpose of this class is to initialize the page objects to the relevant pages on the websites
 * We can also include methods over here wherein we can check code the functionality to check if a particular 
 * page obect is present/displayed/selectable and so on and use this method in the test classes*/

public class pageBase {

	protected String url;

	public WebDriver driver;
	protected String pageTitle;

	/*to get the page title*/
	public String getPageTitle() {

		return pageTitle;
	}

	/*to set the Page Title*/
	public void setPageTitle(String pageTitle) {
		this.pageTitle = pageTitle;

	}
	
	/*Constructor to initialize the page based on the page Title
	 * this will be helpful when we have multiple classes referring to multiple pages on the website*/
	public pageBase(WebDriver _driver, String pageTitle) {
		driver = _driver;
		this.pageTitle = pageTitle;
		PageFactory.initElements(_driver, this.pageTitle);
		
	}

}
