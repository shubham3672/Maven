Feature: Login functionality

Scenario: Login to app
Given user navigated to login page
When user enters username
And user enters password
And clicks login button
Then user redirects to homepage

Scenario: verify title
Given user navigated to login page
Then page title should be displayed
