package PageObjectsModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPageObjects {

	public WebDriver driver;// this driver is null

	private By Register = By.xpath("//a[@class='ico-register']");
	private By Gender = By.xpath("//input[@id='gender-male']");
	private By FirstName = By.xpath("//input[@id='FirstName']");
	private By LastName = By.xpath("//input[@id='LastName']");
	private By Email = By.xpath("//input[@id='Email']");
	private By Password = By.xpath("//input[@id='Password']");
	private By ConfirmPassword = By.xpath("//input[@id='ConfirmPassword']");
	private By RegisterButton = By.xpath("//input[@id='register-button']");
	private By registrationCompletedText = By.xpath("//div[@class='result']");
	private By InvalidEmailText = By.xpath("//span[@for='Email']");
	

	public RegisterPageObjects(WebDriver driver) 
	{
		
		this.driver= driver;
	}

	public WebElement clickOnRegister() {

		return driver.findElement(Register);

	}

	public WebElement selectgender() {

		return driver.findElement(Gender);

	}

	public WebElement firstname() {

		return driver.findElement(FirstName);

	}

	public WebElement lastname() {

		return driver.findElement(LastName);

	}

	public WebElement email() {

		return driver.findElement(Email);

	}

	public WebElement password() {

		return driver.findElement(Password);

	}

	public WebElement confirmpassword() {

		return driver.findElement(ConfirmPassword);

	}

	public WebElement registerbutton() {

		return driver.findElement(RegisterButton);

	}

	public WebElement successText() {
		// TODO Auto-generated method stub
		return driver.findElement(registrationCompletedText);
	}

	public WebElement InvalidEmailText() {
		// TODO Auto-generated method stub
		return driver.findElement(InvalidEmailText);
	}

}
