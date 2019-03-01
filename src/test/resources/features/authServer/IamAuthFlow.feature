Feature: User authorization

  The user is able to authorize via iam-server.

  @success
  Scenario Outline: Authorization from application
    Given the existing user wants to login via "<applicationName>"
    And navigates to Login Page
    When he provides correct credentials on Login Page
    Then he is authorized

    @full
    Examples:
        |applicationName|
        |client1|
        |cliet2|

    @client1
    Examples:
        |applicationName|
        |client1|

  @error
  Scenario Outline: This is just an example of scenario which will be surrently skipped
    Given the existing user wants to login via "<applicationName>"
    And navigates to Login Page
    When he provides wrong credentials on Login Page
    Then Login Page is displayed with error
    Examples:
        |applicationName|
        |iam-test-client|
        |iam|



