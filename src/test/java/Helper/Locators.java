package Helper;

import org.openqa.selenium.By;

public class Locators {

	protected By userNameInputLocator = By.id("user-name");
	protected By passInputLocator = By.id("password");
	protected By loginButton = By.id("login-button");
	
	protected By clickOnATC = By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]");
	protected By clickonCartIcon = By.id("shopping_cart_container");
	protected By clickOnCheckout = By.id("checkout");
	protected By enterFName = By.id("first-name");
	protected By enterLName = By.id("last-name");
	protected By enterZip = By.id("postal-code");
	protected By clickonContinue = By.id("continue");
	protected By clickonFinish = By.id("finish");
	//protected By errorText = By.cssSelector("#login_button_container > div > form > div.error-message-container.error > h3");
	
}
