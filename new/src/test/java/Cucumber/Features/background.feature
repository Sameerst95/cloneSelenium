Feature: Sample Background

  Background: Sample Background
    Given We open the browser
    When we type our credentials

  @Smoke @Regression @Background
  Scenario: This is a Sample Scenario
    And the credentials are correct
    Then the user must be able to login

  @Sanity @Integration @Background
  Scenario: This is another Scenario
#    Given We open the browser
#    When we type our credentials
    But the credentials are incorrect
    Then the user must not be able to login