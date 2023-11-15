package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utlility.Utlility_class;

public class Base_class extends Utlility_class {
	@Parameters({"browser","url"})
	@BeforeMethod
	public void browserlaunch(String browser,String url) {
		launchbrowser(browser, url);
	}

	@AfterMethod
	public void browserclose() {
		closebrowser();
	}

}
