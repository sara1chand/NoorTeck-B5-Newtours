package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class SignOnPage extends CommonUI {
	
	@FindBy(xpath = "//input[@name='userName']")
	WebElement userNameField;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement passwordField;
	
	@FindBy(xpath = "//input[@name='submit']")
	WebElement submitButton;
	
	@FindBy(id="dismiss-button")
	WebElement alertClose;
	
	@FindBy(xpath = "//h3[contains(text(),'Login Successfully']")
	WebElement loginMessage;
	
	@FindBy(xpath = "//b[contains(text(),'Thank you for Loggin')]")
	WebElement ThankYouMessage;
	
	
	public SignOnPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserName(String userName) {
		enter(userNameField, userName );
	}
	
	public void enterPasswordField(String passWord) {
		enter(passwordField, passWord);
	}
	
	public void clickSubmit() {
		click(submitButton);
	}
	//not sure 
	public void displayMessage() { 
		isDisplayed(loginMessage);
	}
	//not sure
	public void thankyouMessage() {
		isDisplayed(ThankYouMessage);
	}
	
	public void closeAlert() {
		click(alertClose);
	}
	
	
	

}
