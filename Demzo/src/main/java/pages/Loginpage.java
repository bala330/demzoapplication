package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base_class;

public class Loginpage extends Base_class {
	
	@FindBy(xpath="//input[@id='loginusername']")
	WebElement username;
	@FindBy(xpath = "//input[@id='loginpassword']")
	WebElement password;
	@FindBy(xpath="//button[contains(text(),'Log in')]")
	WebElement button;
	 String actual="Welcome balaramesh";
	    String excepted="Welcome balaramesh";
	
public Loginpage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
public Loginpage loginusername(String name) {
	sendkeys(username, name);
	return this;
}
public Loginpage loginpassword(String pass) {
	sendkeys(password, pass);
	return this;
}
public Loginpage loginbutton() {
	clickbutton(button);
	return this;
}
public Loginpage assertaion() {
	Assert(actual, excepted);
	return this;
}
}
