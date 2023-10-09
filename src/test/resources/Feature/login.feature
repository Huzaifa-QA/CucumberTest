Feature: Test login functionality
  
  
  	Scenario Outline: check login is successful with valid and invalid credentials
    Given Browser is open and user is on login page
    When user enters <username> and <password>
    And click on login button
    Then user navigate to product page
    When user add to cart product
    Then click on cart icon
    And click on checkout
    And fill user info
    Then click on continue
    And finish
 
 Examples:
		| username | password |
		| standard_user | secret_sauce |
		| locked_out_user | secret_sauce |