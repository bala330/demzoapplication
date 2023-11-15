package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base_class;

public class Signup_page extends Base_class {
	@FindBy(xpath ="//input[@id='sign-username']")
	WebElement username;
	@FindBy(xpath = "//input[@id='sign-password']")
	WebElement password;
	@FindBy(xpath = "//button[contains(text(),'Sign up')]")
	WebElement button;
	


	public Signup_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public Signup_page username(String name) {
		sendkeys(username, name);
		return this;
	}
	public Signup_page pass(String passw) {
		sendkeys(password, passw);
		return this;
	}
	public Signup_page registerbutton() {
		clickbutton(button);
		return this;
	}
	
	
}
