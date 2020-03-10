package com.facebook.core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page {
	
	public static WebDriver driver; //Static means we access driver using Page.driver directly
	public static TopNavigation topNav; //Encapsulation
	
	public Page(){
		
		if(driver==null){
			
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20L,TimeUnit.SECONDS);
			topNav = new TopNavigation(); //Encapsulation
		}
	}
	

}
