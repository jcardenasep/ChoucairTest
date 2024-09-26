
Feature: The navigation bar to search for jobs

To view pages within the page
Without having entered
I can click on the links

Scenario Outline: User Login and Navigation to Recruitment
   Given I navigate to www.opensource-demo.orangehrmlive.com
   When The user enters Admin and admin123
   And the user clicks the login button
  

Scenario: Register a New Candidate

   Then you are on the home page click on Recruitment
   When you are on the recruitment page click on add
   And the user fills out the recruitment form firstname <firstname> middlename <middlename> lastname <lastname>
   When the list is displayed an option is chosen
   And user fills out email <email> and contactnumber <contactnumber>
   And user click in load file
   And user fills out palabra <palabra>
  When user fills out textarea <palabra>
   And click in accept buttom

       Examples:
           |firstname|middlename|lastname|  email  |contactnumber|   palabra  |
           |  Julian |   David  |Cardenas|pp@qq.com|  3002357432 |automatizada|

Scenario: Shortlist Candidate

   Given application Initiated Click on shortlist
   When you are in Shortlist Candidate add the note aprobado
   And click in save buttom


Scenario: Schedule an Interview

   Given click in schedule interview buttom
   And user is in Schedule Interview add the tittle <tittle>
    When user is in Interviewer add the tittle <interviewer>
    Then the list is displayed and one is chosen
   And being in the field enter date <date>
   And click in hour buttom
    And click in save

       Examples:
        |tittle|interviewer|   date   |
        |  Entrevista  |     a     |2024-09-30|

Scenario: Mark Interview as Passed and Offer Job

   Given being in Application Stage click on Mark Interview Passed
   And user inssert <notes>
   And click in save buttom again
   And click in offer job
   And click the save button once again
   And click the hire button
   And now click on the save button

       Examples:
           |  notes |
           |aprobado|

Scenario: Verify Candidate Data After Hiring

   Given you are in Recruitment
   And verify data
   And Exit
