package Page;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class POM extends BasePage {
	
	
		@Given("Browser is open and user is on login page")
		public void accessibleSwagLabs() throws Exception {
		
		browseURL(swagLabs);
		
		}
	 	
	    @When("^user enters (.*) and (.*)$")
		public void userNameAndPass(String username, String password) throws InterruptedException{
	    	
	  
		driver.findElement(userNameInputLocator).sendKeys(username);
		driver.findElement(passInputLocator).sendKeys(password);
		Thread.sleep(2000);
			
		}
				
	    @And("click on login button")
		public void clickOnLogin() throws InterruptedException {
			
			driver.findElement(loginButton).click();	    	
			
		}
		
	    @Then("user navigate to product page")
	    public void navigateToProducts() throws InterruptedException {
	    	
	    	driver.get(swagLabsProduct);
	    	String actualurl = "https://www.saucedemo.com/inventory.html";
			assertActualEqualsExpected(driver.getCurrentUrl(),actualurl);
			Thread.sleep(2000);
	    }
	    
		
	    @When("user add to cart product")
	    public void addToCart() {
	    	
	    	driver.findElement(clickOnATC).click();
	    }
		
		
	    @Then("click on cart icon")
		public void clickOnCart() throws InterruptedException {
	    	
	    	driver.findElement(clickonCartIcon).click();
	    	Thread.sleep(2000);
	    }
	    
		
	    @And("click on checkout")
		public void clickOnCheckout() {
	    	
	    	driver.findElement(clickOnCheckout).click();
	    }
	    
		
	    @And("fill user info")
		public void userinfo() throws InterruptedException {
	    	
	    	driver.findElement(enterFName).sendKeys("TestH");
	    	driver.findElement(enterLName).sendKeys("TestR");
	    	driver.findElement(enterZip).sendKeys("74600");
	    	Thread.sleep(2000);
	    }
	    
	    @Then("click on continue")
		public void clickOnCcontinueButton() throws InterruptedException {
	    	
	    	driver.findElement(clickonContinue).click();
	    	Thread.sleep(2000);
	    }
	    
	    @And("finish")
		public void clickOnFinishButton() {
	    	
	    	driver.findElement(clickonFinish).click();
	    	driver.close();
	    }
	    
}    
//	    public void errorMsgCompare() throws InterruptedException {
//			
//			String actualError = "";
//	    	String errorMsg = driver.findElement(errorText).getText();
//	    	System.out.println(errorMsg);
//	    	assertActualEqualsExpected(actualError, errorMsg);
//	    	
//			
//			
//		}

	 
	


	
