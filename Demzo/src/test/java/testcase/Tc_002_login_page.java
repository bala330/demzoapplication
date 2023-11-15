package testcase;

import org.testng.annotations.Test;

import base.Base_class;
import pages.Home_page;

public class Tc_002_login_page extends Base_class {
	
@Test
public void loginpage() {
	new Home_page(driver)
	.login()
	.loginusername("balaramesh")
	.loginpassword("Vijaya2@")
	.loginbutton()
	.Assert("Welcome balaramesh", "Welcome balaramesh");
	
	
	
	
	
}
}
