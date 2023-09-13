Feature: About page information

  Scenario: A user or admin can find information on the loan application here
    Given the 'user' is logged in
    When they navigate to the about page
    Then information about the loan app is displayed