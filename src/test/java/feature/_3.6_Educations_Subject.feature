Feature: Educations Subject Functionalty


  Scenario: Create a Education Subject

    Given Navigate to basgar
    When Enter username and password and click login button
    Given Navigate to Education

    Then Create  a Subject
    Then Success message be displayed

    When User delete  Subject
    Then Success message be displayed

