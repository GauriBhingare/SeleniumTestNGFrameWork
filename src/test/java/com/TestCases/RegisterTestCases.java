package com.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Resources.CommonMethods;
import com.Resources.Constants;
import com.Resources.baseclass;

import PageObjectsModel.RegisterPageObjects;

public class RegisterTestCases extends baseclass {
	
	@Test
	public void verifyValidRegisteration() throws IOException
	{
	 
	  initilizeDriver();
	  
	  driver.get("https://demowebshop.tricentis.com/");
	  
	  
	  
	 RegisterPageObjects rpo=new RegisterPageObjects(driver);
		 
	rpo.clickOnRegister().click();
	rpo.selectgender().click();
	rpo.firstname().sendKeys(Constants.firstName);
	rpo.lastname().sendKeys(Constants.lastName);
	rpo.email().sendKeys(email);
	rpo.password().sendKeys(Constants.password);
	rpo.confirmpassword().sendKeys(Constants.confirmPassword);
	rpo.registerbutton().click();
	
	//String expectedText=(Constants.registerValidExpectedText);
	//String actualText=rpo.successText().getText();	
	
	CommonMethods.handleAssertion(Constants.registerValidExpectedText, rpo.successText().getText());

	
}
	
	@Test
	public void verifyInValidRegisteration() throws IOException {

	  RegisterPageObjects rpo = new RegisterPageObjects(driver);

	  rpo.clickOnRegister().click();

	  rpo.selectgender().click();

	  rpo.firstname().sendKeys(Constants.firstName);

	  rpo.lastname().sendKeys(Constants.lastName);

	  rpo.email().sendKeys(Constants.invalidEmail);

	  rpo.password().sendKeys(Constants.password);

	  rpo.confirmpassword().sendKeys(Constants.confirmPassword);

	  rpo.registerbutton().click();
	 
	  //String expectedText = Constants.registerInValidExpectedText;

	  //String actualText = rpo.InvalidEmailText().getText();

	  CommonMethods.handleAssertion(Constants.registerInValidExpectedText, rpo.InvalidEmailText().getText());
	 
	}
	}



