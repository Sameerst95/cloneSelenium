Feature: This is a Sample Scenario Outline

  @ScenarioOutline
  Scenario Outline: This is a Sample Scenario outline
    Given We open the browser
    When we type the username as "<username>"
    And we type the password as "<password>"
    Then the user must be able to login

    Examples:
      | username | password |
      | abcd     | 1234567  |
      | bcde     | 2345677  |
      | cdef     | 3456789  |
      | defg     | 4567890  |
      | efgh     | 4567890  |