Feature: Get users happy path

  Scenario: Verify successful response when client requests all users data
    When client makes a request to get the users
    Then client should receive response with status code as 200
