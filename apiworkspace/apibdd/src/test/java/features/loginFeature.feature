Feature: Validating Place API
  Scenario: Add Place API validate
    Given Add Place Payload
    When User calls AddPlaceAPI with POST HTTP Request
    Then API call success with status code
    And status in response body is ok

