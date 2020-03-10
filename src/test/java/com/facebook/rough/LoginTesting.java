package com.facebook.rough;

import com.facebook.core.Page;
import com.facebook.pages.HomePage;
import com.facebook.pages.LandingPage;
import com.facebook.pages.MyProfilePage;

public class LoginTesting {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		HomePage hm = new HomePage();
		LandingPage lp = hm.doLogin("umeshkumarsingh@gmail.com", "shubhratannuumesh21");
		
		Thread.sleep(5000);
		MyProfilePage mp = lp.gotoProfile();
		mp.gotoPhotos();
		Page.topNav.logout();
		

		
		
	}

}
