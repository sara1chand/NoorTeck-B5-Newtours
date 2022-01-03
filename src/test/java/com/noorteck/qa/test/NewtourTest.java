package com.noorteck.qa.test;

import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

public class NewtourTest extends ObjInitialize {

	public static void main(String[] args) {

			String url = "http://demo.guru99.com/test/newtours/";

			CommonUI commonUIObj = new CommonUI();
			ObjInitialize obj = new ObjInitialize();
			NewtourTest testObj = new NewtourTest();
			

			commonUIObj.openBrowser("chrome");
			commonUIObj.navigate(url);

			obj.initializeClassObj();
			testObj.TestCaseOne();
			testObj.TestCaseTwo();
			testObj.TestCaseThree();

			commonUIObj.quitBrowser();
		}

		public void TestCaseOne() {
            homeObj.clickSignOn();
            signonObj.dismissAlert();
			signonObj.enterUserName("JohnCena@gmail.com");
			signonObj.enterPasswordField("password123");
			signonObj.clickSubmit();
			
			}

		public void TestCaseTwo() {
			
			String url = "http://demo.guru99.com/test/newtours/";
			
			driver.get(url);
			homeObj.clickRegiSter();
			registerObj.enterFirstName("John");
			registerObj.enterLastName("Cena");
			registerObj.enterPhoneNumber("244-572-3111");
			registerObj.enterEmail("JohnCena@gmail.com");
			registerObj.enterAddress("7453 CenaLane");
			registerObj.enterCity("Alexandria");
			registerObj.enterState("VA");
			registerObj.selectCountry(url, url);
			//registerObj.selectFromDropDown("USA", methodName, "Value");
			registerObj.enterpostalCode("335566");
			registerObj.enteruserName("JohnCena@gmail.com");
			registerObj.enterPassword("password123");
			registerObj.submitClick();
			
		}
		
		public void TestCaseThree() {
			
			String url = "https://demo.guru99.com/test/newtours";
			
			driver.get(url);
			
			homeObj.clickFlight();
			flightsObj.clickOneway();
			flightsObj.selectPass();//still figuring out how to deal with dropdowns in POM!!
			flightsObj.radioFirstClass();
			flightsObj.clickContinue();
			
			
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