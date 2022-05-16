Feature: This feature file is related to maps

  @Test
  Scenario Outline: Validate that AmiGO app search functionality works as expected when user provides full address. Also validate the expected icons displayed in each page
    When User enter "<address>" in the search bar
    And User choose an "<address>" from auto suggested text view
    Then Validate that share option,star icon,route button,close map,back button are present
    When user click on route button
    Then Validate that route information page has all proper information
    When Uer click on the options button
    Then User should see "Toll roads","Ferries","Motorways","Unpaved roads" options are present
    When User click on go button
    Then Navigation shown on the map

    Examples:
      | address          |
      | 1421 TE,Uithoorn |

  @Test
  Scenario Outline: validate that when user selected some sub category item from three dots menu then selected text is properly entered in the search text field.
    When User click on three dot menu option on the maps home page
    And User click on the "<mainCategoryText>" and choose "<subCategoryText>"
    Then Validate "<subCategoryText>" is matched with text present in search text box

    Examples:
      | mainCategoryText | subCategoryText |
      | Education        | School          |

  @Test
  Scenario Outline: Validate that if user report an issue while travelling then reported issue is updated on the map
    When User click on report issue icon present on homepage
    Then List of available options should be displayed
      | Speed camera | Road works | Jam | Closed road | Broken down car | Hazard |
    When User click on one of the "<reportIssue>" from report page
    Then Map should display the "<reportIssue>" icon that was selected by the user on the map
    Examples:
      | reportIssue     |
      | Broken down car |

  @Test
  Scenario: Validate icons shown on the maps homepage
    Then Validate that all expected icons are shown properly