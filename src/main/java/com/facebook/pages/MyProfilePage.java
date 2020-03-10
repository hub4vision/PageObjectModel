package com.facebook.pages;

import org.openqa.selenium.By;

import com.facebook.core.Page;

public class MyProfilePage extends Page{
	
	
	public void gotoPhotos(){
		
		driver.findElement(By.xpath("//a[contains(text(),'Photos')]")).click();
		
	}

	public void gotoFriends(){
		driver.findElement(By.xpath("//a[@class='_6-6'][contains(text(),'Friends')]")).click();
	}
	
}
