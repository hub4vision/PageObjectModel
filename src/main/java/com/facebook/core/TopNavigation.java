package com.facebook.core;

import org.openqa.selenium.By;

import com.facebook.pages.LandingPage;

public class TopNavigation {
	
	
	public LandingPage gotoLandingPage(){
	
			Page.driver.findElement(By.xpath("//span[@class='_2md']'")).click();
			return new LandingPage();
	}
	
	public void doSearch(){
		
	}
	public void logout(){
		
		Page.driver.findElement(By.xpath("//div[@id='userNavigationLabel']")).click();
		Page.driver.findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();
	}

	
	
}
