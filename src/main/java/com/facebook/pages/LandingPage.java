package com.facebook.pages;

import org.openqa.selenium.By;

import com.facebook.core.Page;

public class LandingPage extends Page{

	public void updateStatus(){
		
	}
	
	public MyProfilePage gotoProfile(){
		
		driver.findElement(By.xpath("//div[contains(text(),'Umesh Kumar Singh')]")).click();
		topNav.logout();//because Encapsulation so able to access
		return new MyProfilePage();
		
	}
	
}
