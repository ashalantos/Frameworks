#Author
#Date
#Description
Feature: View available services under Booking Available Services menu

  Scenario Outline: Check available services under Booking Available Services menu
    Given user is on homepage page
    When user clicks on 'Booking Available Service' menu
    Then user should be able to see all <available services>
      | available services          |
      | ONLINE MEDICAL CONSULTATION |
      | HOME CARE SERVICES          |
      | Pragnancy Consulting        |
