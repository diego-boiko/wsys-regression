Feature: Portal W-Sys 2.0

    @Smoke
    Scenario: Checking on test wsys 2.0 login page
        Given I access the test wsys 2.0 login page
        When the page is loaded
        Then its components are correctly displayed

    @Smoke
    Scenario: Login at test wsys 2.0
        Given I access the test wsys 2.0 login page
        When I perform a succesful login
        Then its homePage is correctly displayed