Feature: Validating the Home Page

  Background: 
    Given user is on roku homepage

 @test
  Scenario: Verify the Roku Logo on home page
    When the page is loaded
    Then user should see the Roku Logo

  @testproxy
  Scenario: Verifing the navigation item "What is Roku" on home page
    When user mouse hover the navigation item  - What is Roku
    Then user should see a dopdown menu items
    And user click on sub menu - What is Roku
    And user should be redirected to the Roku Intro page
    And user mouse hover the navigation item  - What is Roku
    And user click on sub menu - Roku OS
    And user should be redirected to the Roku OS page

@test
  Scenario: validating the signin navigation item on the home page
    When user clicks on signin
    Then the page should be redirected to the sign in page
    
@test
  Scenario: validating the cart symbol on the home page
    When user clicks on cart symbol
    Then the page should be directed to the checkout page

@test
  Scenario: validating the signin process from home page
    When user clicks on sign-in from the home page
    And user should be redirected to the sign-in page
    And user enter the email ID
    And user enter the password
    And user click the Remember me option
    And user click on sign-in button
    Then user should be redirected to home page
    And user able to see the user-menu icon
    
    
    
