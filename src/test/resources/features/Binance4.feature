Feature: Checking the functionalities of links on binance.com
  Background:
    Given The user should be at the Binance home page


  Scenario: The user should be able to click buttons and test links functionalities on homepage
    When The user randomly clicks on links below aboutus title
    And The user randomly clicks on links below aboutus title four times more
    Then The user sees the pages open succesfully

