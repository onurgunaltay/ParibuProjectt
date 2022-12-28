Feature: Checking the functionalities of headers on binance.com
  Background:
    Given The user should be at the Binance home page


  Scenario: The user should be able to use buttons and test dropdown options functionalities on top header
    When The user sees that homepage is opened and waits on trade button on top header
    And The user clicks spot button in dropdown list of trade
    Then The user sees the page opens succesfully
    And The user sees pop-up page and closes it
    And The user clicks login button on opening page
    And The user tries to log in with wrong credentials
    Then The user sees error message after triying to log in with wrong credentials