Feature: dragDropping
    @wipOther
  Scenario: dragDrop exercises
    Given User is on the dashboard page
    When  Handle with cookies
      And user move item four and five under first box
    And move rest of the items under first box
    # Then assert that all items move successfully under first box