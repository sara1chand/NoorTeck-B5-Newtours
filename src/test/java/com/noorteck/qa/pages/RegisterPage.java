package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.noorteck.qa.utils.CommonUI;

public class RegisterPage extends CommonUI {

	@FindBy(xpath = "//input[@name='firstName']")
	WebElement firstNameField;

	@FindBy(xpath = "//input[@name='lastName']")
	WebElement lastNameField;

	@FindBy(xpath = "//input[@name='phone']")
	WebElement phoneNumberField;

	@FindBy(css = "#userName")
	WebElement emailField;

	@FindBy(xpath = "//input[@name='address1']")
	WebElement addressField;

	@FindBy(xpath = "//input[@name='city']")
	WebElement cityField;

	@FindBy(xpath = "//input[@name='state']")
	WebElement stateField;

	@FindBy(xpath = "//input[@name='postalCode']")
	WebElement postalCodeField;

	@FindBy(xpath = "//select[@name='country']")
	WebElement countrySelect;

	@FindBy(css = "input#email")
	WebElement userNameField;

	@FindBy(xpath = "//input[@type='password']")
	WebElement passWordField;

	@FindBy(xpath = "//input[@name='confirmPassword']")
	WebElement confirmPasswordField;

	@FindBy(xpath = "//input[@name='submit']")
	WebElement clickSubmit;

	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}

	public void enterFirstName(String firstname) {
		enter(firstNameField, firstname);
	}

	public void enterLastName(String lastname) {
		enter(lastNameField, lastname);
	}

	public void enterPhoneNumber(String phonenumber) {
		enter(phoneNumberField, phonenumber);
	}

	public void enterEmail(String email) {
		enter(emailField, email);
	}

	public void enterAddress(String address) {
		enter(addressField, address);
	}

	public void enterCity(String city) {
		enter(cityField, city);
	}

	public void enterState(String state) {
		enter(stateField, state);
	}

	public void enterpostalCode(String postalcode) {
		enter(postalCodeField, postalcode);
	}

	
	public void selectCountry(String methodName, String indexTextValue) {
	 selectFromDropdown(countrySelect, methodName, indexTextValue);
    }

	public void enteruserName(String username) {
		enter(userNameField, username);
	}

	public void enterPassword(String password) {
		enter(passWordField, password);
	}

	public void enterconfirmPassword(String confirmPassword) {
		enter(confirmPasswordField, confirmPassword);
	}

	public void submitClick() {
		click(clickSubmit);
	}

}
