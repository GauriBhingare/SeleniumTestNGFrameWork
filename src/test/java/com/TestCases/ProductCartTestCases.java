package com.TestCases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Resources.Constants;
import com.Resources.baseclass;

import PageObjectsModel.LoginPageObject;
import PageObjectsModel.ProductCartObject;

public class ProductCartTestCases extends baseclass {

	@Test
	public void verifyproductprice() throws IOException, InterruptedException {

		initilizeDriver();

		driver.get("https://demowebshop.tricentis.com/");

		ProductCartObject pco = new ProductCartObject(driver);

		pco.EnterKeyword().sendKeys(Constants.product);

		pco.SearchKeyword().click();
		
		/*driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("computer");

		driver.findElement(By.xpath("//input[@value='Search']")).click();
        */
		
		List<WebElement> product = pco.Product();
		List<WebElement> price = pco.Price();

		List<WebElement> cart = pco.Cart();
		String pricebeforeCart = "";

		for (int i = 0; i < product.size(); i++) {

			if (product.get(i).getText().equalsIgnoreCase(Constants.productName)) {

				pricebeforeCart = price.get(i).getText();
				cart.get(i).click();
				break;

			}

		}

		System.out.println(pricebeforeCart);
		
		Thread.sleep(2000);
		
		pco.processor().click();
		
		pco.addtocart().click();
		
		Thread.sleep(2000);

		
		String a = pco.Message().getText();
		
		System.out.println(a);
		
		Thread.sleep(2000);

		
		pco.ClinkOnCross().click();
		
		pco.shopingcart().click();
		
		String priceaftercart = pco.Total().getText();
		System.out.println(priceaftercart);
		
		
		if(priceaftercart.equalsIgnoreCase(pricebeforeCart)) 
		   {
		    System.out.println("amount matching succesfully");
		   } 
		   else
		   {
			   System.out.println("amount does not match");
			   }
	

		/*
		 * driver.findElement(By.xpath("(//input[@id='product_attribute_75_5_31_96']")).
		 * click();
		 * 
		 * driver.findElement(By.xpath("//input[@id='add-to-cart-button-75']")).click();
		 * 
		 * String Message =
		 * driver.findElement(By.xpath("//div[@id='bar-notification']")).getText();
		 * 
		 * driver.findElement(By.xpath("//span[@class='close']")).click();
		 * 
		 * driver.findElement(By.xpath("(//span[@class='cart-label'])[1]")).click();
		 * 
		 * String Total =
		 * driver.findElement(By.xpath("//span[@class='product-price order-total']")).
		 * getText();
		 * 
		 */
	}
}
