package com.TestCases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Resources.CommonMethods;
import com.Resources.Constants;
import com.Resources.baseclass;

import PageObjectsModel.LoginPageObject;

public class LoginTestCases extends baseclass
{
	
	@Test
	public void verifyValidLogin() throws IOException, InterruptedException 
	{
		
		LoginPageObject lpo=new LoginPageObject(driver);
		
		lpo.clickOnlogIn().click();
	    
		lpo.enterEmail().sendKeys(email);
		
		lpo.enterPassword().sendKeys(Constants.LoginvalidPassword);
		
		lpo.clickSubmit().click();
		
		//String expectedText=(Constants.loginValidExpectedTest);
		//String actualText=lpo.LogOutText().getText();	
		
		CommonMethods.handleExplicitWait(driver, 2, lpo.LogOutText());
		
		CommonMethods.handleAssertion(Constants.loginValidExpectedTest, lpo.LogOutText().getText());
		
	}

	@Test
	public void verifyInValidLogin() throws IOException
	{
		
		LoginPageObject lpo=new LoginPageObject(driver);
		
		lpo.clickOnlogIn().click();
	    
		lpo.enterEmail().sendKeys(email);
		
		lpo.enterPassword().sendKeys(Constants.LogininValidPassword);
		
		CommonMethods.handleExplicitWait(driver, 2, lpo.clickSubmit());
		
		lpo.clickSubmit().click();
		
		//String expectedText=(Constants.LogininValidExpectedTest);
		//String actualText=lpo.invalidCredentialText().getText();	
		
	
		CommonMethods.handleAssertion(Constants.LogininValidExpectedTest, lpo.invalidCredentialText().getText());
	}
}
