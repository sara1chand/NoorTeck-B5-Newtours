package com.noorteck.qa.test;

import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

public class NewtourTest extends ObjInitialize {

	public static void main(String[] args) {

			String url = "http://demo.guru99.com/test/newtours/";

			CommonUI.openBrowser("chrome");
			CommonUI.navigate(url);

			initializeClassObj();
			
			   TestCaseTwo();
			   TestCaseOne();
			   TestCaseThree();

			CommonUI.quitBrowser();
		}

		public static void TestCaseOne() {
             homeObj.clickSignOn();
            //signonObj.closeAlert();
            signonObj.enterUserName("hopeitworks");
			signonObj.enterPasswordField("last1223");
			signonObj.clickSubmit();
			//signonObj.displayMessage();
			//signonObj.thankyouMessage();
			
			}

		public static void TestCaseTwo() {
			
			homeObj.clickRegiSter();
			registerObj.enterFirstName("John");
			registerObj.enterLastName("Cena");
			registerObj.enterPhoneNumber("244-572-3111");
			registerObj.enterEmail("JohnCena@gmail.com");
			registerObj.enterAddress("7453 CenaLane");
			registerObj.enterCity("Alexandria");
			registerObj.enterState("VA");
			registerObj.selectCountry("value","UNITED STATES");
		    registerObj.enterpostalCode("335566");
			registerObj.enteruserName("hopeitworks");
			registerObj.enterPassword("last1223");
			registerObj.submitClick();
			
		}
		
		public static void TestCaseThree() {
			
			String url = "https://demo.guru99.com/test/newtours";
			
			driver.get(url);
			
			homeObj.clickFlight();
			flightsObj.clickOneway();
			flightsObj.selectPass("value","3");
			flightsObj.radioFirstClass();
		    flightsObj.selectDeparture("value","New York");
			flightsObj.selectMonth("value","1");
			flightsObj.selectDate("index","4");
			flightsObj.selectArrive("value","London");
			flightsObj.selectMonthTo("value","1");
			flightsObj.selectDateTo("value","31");
			flightsObj.clickAirline("text","Unified Airlines");
			flightsObj.clickContinue();
			flightsObj.displayMessage();
			}
		}
		
	

	
		
	
	
	



/**
		--------------------------------------	INSTRUCTIONS --------------------------------------------
			
			---> Create JAVA CLASS for each page of the application
			---> Inspect the elements and store the values 
			---> Create the class constructor
			---> Create the methods
		
			---> DONT FORGET ***** 	EACH PAGE CLASS SHOULD INHERIT CommonUI Class 				*******************
			---> DONT FORGET ***** 	DECLARE PAGE CLASS OBJECT in CONSTANTS CLASS 				*******************
			---> DONT FOGET  ***** 	INITIALIZE PAGE CLASS OBJECTS IN ObjInitialize JAVA ClASS 	*******************
			---> DONT FOGET  ***** 	CHANGE JAVA VERSION TO 1.8 									*******************
			
			
			
			---> For each test case create a method then call those methods from main method. 
			---> DONT FORGET *****	Refer to the INSTRUCTION PDF file for the test cases to automate **************
			
			---> ONCE FINISHED AUTOMATING Create Repository in GitHub and push to GitHub
			---> Once pushed add US to the project then send picture in MENTORS GROUP CHAT
						 Crystal: 		--> Koritzerc23@gmail.com
						 Helen: 		--> Hnbehining@gmail.com
						 Ahmad: 		--> a.stanikzai77@gmail.com
						 Fahim: 		--> NTKBatch5


*/