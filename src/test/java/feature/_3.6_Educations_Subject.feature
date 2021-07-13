Feature: Educations Subject Functionalty


  Scenario: Create a Education Subject

    Given Navigate to basgar
    When Enter username and password and click login button
    Given Navigate to Education

    Then Create  a Subject name as "Abdullah" code as "4561"
    Then Success message be displayed

    When User delete  Subject name as "Abdullah"
    Then Success message be displayed

