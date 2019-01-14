#Autor: Deivy Reyes
Feature: bbc authentication
  As a web user
  I want to login to BBC page
  to view my options

  # Remember that Keywords are:
    # Feature
    # Examples (Scenario Outline)
    # Given, When, Then, And, But (annotations)
    # Background
    # Combinations

   # The Background is for describes preconditions of scenarios
  Background: User browses the web page
    Given Charlie is on BBC login page

    # The ideal scenario has between 3 and 4 steps.

  @AcceptanceTest  @SmokeTest
  Scenario: User logs in
    When Charlie sign in with correct credentials
    Then He should see your account option




