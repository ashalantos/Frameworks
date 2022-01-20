Feature: Login1

    I want to login in MIT website

    @smoke
    Scenario: Login as Administrator
        Given I navigate to MIT website from homepage
        When I type in "ashal.anto" and "password123!"
        And I click on login button
        Then Homepage is displayed