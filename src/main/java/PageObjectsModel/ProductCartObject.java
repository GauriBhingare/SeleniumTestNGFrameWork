package PageObjectsModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductCartObject {

	public WebDriver driver;

	private By SearchItem = By.xpath("//input[@id='small-searchterms']");

	private By Search = By.xpath("//input[@value='Search']");

	private By product = By.xpath("//h2[@class='product-title']/a");

	private By price = By.xpath("//span[@class='price actual-price']");

	private By cart = By.xpath("//input[@value='Add to cart']");
	
	private By Processor = By.xpath("(//input[@name='product_attribute_75_5_31'])");
	
	private By Addtocart = By.xpath("//input[@class='button-1 add-to-cart-button']");
	 
	private By capturethemessage = By.xpath("//div[@id='bar-notification']");
	 
	private By clinkOnCross = By.xpath("//span[@class='close']");

	private By ClinkOnShopingCart = By.xpath("(//a[@class='ico-cart'])");
	 
	private By CaptureTotal = By.xpath("//span[@class='product-price order-total']");
	 
	  
	
	

	public ProductCartObject(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement EnterKeyword() {
		return driver.findElement(SearchItem);
	}
	
	public WebElement SearchKeyword() {
		return driver.findElement(Search);
	}
	

	public List<WebElement> Product() {
		return driver.findElements(product);
	}

	public List<WebElement> Price() {
		return driver.findElements(price);
	}

	public List<WebElement> Cart() {
		return driver.findElements(cart);
	}
	
	public WebElement processor() {
		return driver.findElement(Processor);
	}
	public WebElement addtocart() {
		return driver.findElement(Addtocart);
	}
	public WebElement Message() {
		return driver.findElement(capturethemessage);
	}
	public WebElement ClinkOnCross() {
		return driver.findElement(clinkOnCross);
	}
	public WebElement shopingcart() {
		return driver.findElement(ClinkOnShopingCart);
	}
	public WebElement Total() {
		return driver.findElement(CaptureTotal);
	}
}
