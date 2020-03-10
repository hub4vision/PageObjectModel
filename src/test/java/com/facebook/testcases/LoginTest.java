package com.facebook.testcases;

import org.testng.annotations.Test;

import com.facebook.core.Page;
import com.facebook.pages.HomePage;
import com.facebook.pages.LandingPage;
import com.facebook.pages.MyProfilePage;

public class LoginTest {

	@Test
	public void testLogin() {
		HomePage hm = new HomePage();
		LandingPage lp = hm.doLogin("umeshkumarsingh@gmail.com", "");
	
	}

}
