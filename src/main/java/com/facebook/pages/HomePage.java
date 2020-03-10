package com.facebook.pages;

import org.openqa.selenium.By;

import com.facebook.core.Page;

public class HomePage extends Page{ //extent Page means Inheritance
	
	//
	public LandingPage doLogin(String UserName, String Password){
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(UserName);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(Password);
		driver.findElement(By.id("u_0_b")).click();
		
		return new LandingPage();
		
		//whichever method is responsible for taking us to next page should return the the page object of next page.
		//dologin method is responsible for returning the object of LandingPage.
		
	}
	
	
	public void signUp(){
		
	}

	
}
