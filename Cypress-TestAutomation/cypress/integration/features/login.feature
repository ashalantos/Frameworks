Feature: Login

    I want to login in MIT website

    @smoke
    Scenario: Login as Administrator
        Given I navigate to MIT website
        When I type in "ashal.anto" and "password123!"
        And I click on login button
        Then Homepage is displayed

    @smoke
    Scenario: Login as Administrator - Fixtures example
        Given I navigate to MIT website
        When I type in credentials
        And I click on login button
        Then Homepage is displayed

     Scenario: Login as Administrator with multiple accounts
        Given I navigate to MIT website
        When I type in below
            |   username    |   password    |
            |   ashal.anto  |   password123!    |
            
        And I click on login button
        Then Homepage is displayed