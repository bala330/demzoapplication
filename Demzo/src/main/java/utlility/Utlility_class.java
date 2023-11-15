package utlility;

import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class Utlility_class {
	
	public WebDriver driver;
	
	public void launchbrowser(String browser, String url) {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
	}
	
	public void clickbutton(WebElement element) {
		element.click();
		
	}
	public void sendkeys(WebElement element,String values) {
		element.sendKeys(values);
		
	}
	public void Assert(String actual,String Excepted) {
	    Assert.assertEquals(actual, Excepted);
		
	}
	public void closebrowser() {
		driver.close();
	}
	
	


}
