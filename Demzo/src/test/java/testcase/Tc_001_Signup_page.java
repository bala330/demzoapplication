package testcase;

import org.testng.annotations.Test;

import base.Base_class;
import pages.Home_page;

public class Tc_001_Signup_page extends Base_class {
	

	
	@Test
	public void signuptest() {
		
		new Home_page(driver)
		.signupbutton()
		.username("balarameshj")
		.pass("Vijaya234@")
		.registerbutton();
		
		
	}

}
