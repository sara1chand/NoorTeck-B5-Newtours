package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class FlightsPage extends CommonUI {
	
	@FindBy(xpath = "//input[@value='roundtrip']")
	WebElement roundTripRadio;
	
	@FindBy(xpath = "//input[@value='oneway']")
	WebElement oneWayRadio;
	
	@FindBy(xpath = "//select[@name='passCount']")
	WebElement selectPassanger;
	
	@FindBy(xpath = "//select[@name='fromPort']")
	WebElement selectDepart;
	
	@FindBy(xpath = "//select[@name='fromMonth']")
	WebElement selectFromMonth;
	
	@FindBy(xpath = "//select[@name='fromDay']")
	WebElement selectFromDay;
	
	@FindBy(xpath = "//select[@name='toPort']")
	WebElement selectArrival;
	
	@FindBy(xpath = "//select[@name='toMonth']")
	WebElement selectToMonth;
	
	@FindBy(xpath = "//select[@name='toDay']")
	WebElement selectToDay;
	
	@FindBy(xpath = "//input[@value='Coach']")
	WebElement economyClass;
	
	@FindBy(xpath = "//input[@value='Business']")
    WebElement businessClass;
	
	@FindBy(xpath = "//input[@value='First']")
	WebElement firstClass;
	
	@FindBy(xpath = "//select[@name='airline']")
	WebElement airlinePreference;
	
	@FindBy(xpath = "//input[@name='findFlights']")
	WebElement continueClick;
	
	
	public FlightsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickRoundTrip() {
		click(roundTripRadio);
	}
	
	public void clickOneway() {
		click(oneWayRadio);
	}
	
	public void selectPass() {
		isSelected(selectPassanger);
	}
	
	public void radioEconomyClass() {
		click(economyClass);
	}
	
	public void radioBusinessClass() {
		click(businessClass);
	}
	
	public void radioFirstClass() {
		click(firstClass);
	}
	//not sure
	public void clickAirline(String methodName, String indexTextValue) {
		click(airlinePreference);
		selectFromDropdown(airlinePreference, methodName, indexTextValue);
	}
	
	public void clickContinue() {
		click(continueClick);
	}
	
	
	
	
	





}
