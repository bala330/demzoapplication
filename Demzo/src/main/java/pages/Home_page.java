package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base_class;

public class Home_page extends Base_class {
	
	@FindBy(xpath ="//a[contains(text(),'Sign up')]")
	WebElement register;
	@FindBy(xpath = "//a[contains(text(),'Log in')]")
	WebElement login;
	
	public Home_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public Signup_page signupbutton() {
		clickbutton(register);
		return new Signup_page(driver);
	}
	public Loginpage login() {
		clickbutton(login);
		return new Loginpage(driver);
	}

}