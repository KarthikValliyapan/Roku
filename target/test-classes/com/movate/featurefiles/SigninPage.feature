Feature: Validating the signin page

  Scenario Outline: validating the sign-in functionality with neagative scenarios
    Given user is on roku homepage
    When user clicks on sign-in from the home page
    And user should be redirected to the sign-in page
    And user enter the email ID
    And user enter the password
    And user click the Remember me option
    And user click on sign-in button
    Then user should see the error message
    But user should be on the same page

    Examples: 
      | reach@gmail.com              | Sai@1234   |
      | reachkarthikyadhav@gmail.com | wrong@1234 |
      | wrong@gmail.com              | wrong@1234 |
      | Sai@1234                     |            |
      | reachkarthikyadhav@gmail.com |            |
      |                              |            |
      | reachkarthikyadhav	Sai@1234  |            |
