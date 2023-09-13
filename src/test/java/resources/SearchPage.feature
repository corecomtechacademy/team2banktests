Feature: Search Page
  As a customer or admin
  I should be able to search for previous applications on the search page

Scenario: A customer or admin can search on the page to show applications
  Given A customer opens ups the search page
  When they make a search
  Then result based on their search should be shown

Scenario Outline: