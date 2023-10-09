package StepDefination;

import org.testng.annotations.Test;
import Page.BasePage;
import Page.POM;


public class Login extends BasePage {
	
	
	  
	  @Test(priority = 1)
	    public void TC1_validateLogin() throws Exception {
	    	POM page = new POM();
	    	page.accessibleSwagLabs();
	    	page.userNameAndPass("standard_user","secret_sauce");
	    	page.clickOnLogin();
	    	page.navigateToProducts();
	    	//page.addToCart();
	    }
	  
	  
	  @Test(priority = 2)
	  public void TC2_validateATCAndCheckout() throws Exception {
	    	POM page1 = new POM();
	    	page1.addToCart();
	    	page1.clickOnCart();
	    	page1.clickOnCheckout();
	    	page1.userinfo();
	    	page1.clickOnCcontinueButton();
	    	page1.clickOnFinishButton();
	    }
	  
//	  @Test(priority = 3)
//	    public void TC3_validateInvalidLogin() throws Exception {
//	    	POM page2 = new POM();
//	    	page2.accessibleSwagLabs();
//	    	page2.userNameAndPass("test","test");
//	    	page2.clickOnLogin();
//	    	Thread.sleep(3000);
//	    	page2.errorMsgCompare();
//	    	
//			
//	  }
}

	
	


