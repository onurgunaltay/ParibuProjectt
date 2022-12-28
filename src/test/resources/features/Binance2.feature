Feature: Checking the functionalities of markets on binance.com
  Background:
    Given The user should be at the Binance home page


  Scenario: The user should be able to use headers and markets buttons function and see a specific coin in detail page
    When The user clicks markets button
    And The user clicks spot markets button on markets page
    And The user clicks usdt button on markets page
    And The user clicks avax usdt button in spot markets list
    Then The user sees the new page opens succesfully



