Feature: Customer adding application

  Scenario: Customers can make and send applications
    Given the 'user' is logged in
    When they navigate to the loan application page
    And they fill in the fields with the correct information
    Then their application is now being processed