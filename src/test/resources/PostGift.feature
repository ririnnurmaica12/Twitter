Feature: Post Gift

  Scenario Outline:post gift is successfully
    Given I already logged in with "<username>" and "<password>" for post
    And I navigate to home page for post
    When I select gift
    And I send tweet gift as "<gift>"
    Then Gift tweet "result" be posted

    Examples:
      | username     | password  | result  |
      | 082139805022 | ririn1212 | Success |
