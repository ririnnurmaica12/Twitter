Feature: Post Text And Image

  Scenario Outline: Text and image is successfully posted
    Given I already logged in with "<username>" and "<password>"
    And I navigate to home page
    When I enter tweet "<text>" text
    And I enter tweet "<image>" image
    And I send tweet "<text>" text and "<image>" image
    Then Tweet "<result>" be posted

    Examples:
      | username     | password  | text    | image   | result    |
      | 082139805022 | ririn1212 | with    | with    | should    |
      | 082139805022 | ririn1212 | with    | without | should    |
      | 082139805022 | ririn1212 | without | without | shouldn't |
