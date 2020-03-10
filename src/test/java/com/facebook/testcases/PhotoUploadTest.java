package com.facebook.testcases;

import org.testng.annotations.Test;

import com.facebook.core.Page;
import com.facebook.pages.LandingPage;
import com.facebook.pages.MyProfilePage;

public class PhotoUploadTest {

	@Test
	public void testPhotoUpload() throws Exception{
		
		Thread.sleep(5000);
		
		LandingPage lp = Page.topNav.gotoLandingPage();
		MyProfilePage mp = lp.gotoProfile();
		mp.gotoPhotos();
		//Page.topNav.logout();
		
		
	}
}
