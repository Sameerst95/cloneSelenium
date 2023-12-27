@FeatureTag
Feature: Sample Feature File

  @Smoke @Regression
  Scenario: This is a Sample Scenario
    Given We open the browser
    When we type our credentials
    And the credentials are correct
    Then the user must be able to login

  @Sanity @Integration
  Scenario: This is another Scenario
    Given We open the browser
    When we type our credentials
    But the credentials are incorrect
    Then the user must not be able to login

    @PassValues
  Scenario: Passing parameters
    Given We open the browser
    When we type the username as "NIT9PM"
    And we type the password as "1234567890"
    And the user must be able to login
    Then the user has got 570 marks for 600