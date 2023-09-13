Feature: Go to the loan application page

  Scenario:
  Given the 'user' is logged in
  When they navigate to the loan application page
  Then they're able to create a new application



Feature: Go the the login page

  Scenario:
    Given the user or admin is on the homepage
    When they click the link to log in
    Then the website signs them out and take them to log in as a different user