package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Locators;



public class BasePage extends Locators {
	
//	protected static String WEBDRIVER_URL = "webdriver.chrome.driver";
//	protected static String WEBDRIVER_PATH = System.getProperty("C:\\ChromeWebDriver\\chromedriver.exe");
	protected static String swagLabs = "https://www.saucedemo.com/";
	protected static String swagLabsProduct = "https://www.saucedemo.com/inventory.html";
	
	
	public static WebDriver driver;
	
	protected void browseURL(String url) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\ChromeWebDriver\\chromedriver.exe");
	 driver = new ChromeDriver();
	
	 driver.get(url);
	 driver.manage().window().maximize();
	 
	}
		
	
	protected void assertActualEqualsExpected(String actual, String expected) {
		
	}
	
	
	

}


