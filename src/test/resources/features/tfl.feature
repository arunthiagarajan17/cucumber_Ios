@Tfl
Feature: IOS mobile app Tests
@test1
  Scenario: Successful Login user, sign out and validate home page
    Given a TFL user lands of application
    When  user enters "emma@tfl.gov.uk" and "password123" to signIn
    Then user validates "Emma Smith" "Senior Test Analyst" and "Pier Walk" in homepage
    And user signOut the application
    Then user navigate to login screen

@test1
Scenario: Failed Login
  Given a TFL user lands of application
   When  user enters invalid "jemma@tfl.gov.uk" and "password123" to signIn
   Then user validates the "Login Error" text in the popup
