Feature: Login functionality with Data
Scenario: Login to app with data

Given user navigated to login page
When user enters username as "testuser"
And user enters password as "test@1234"
And clicks login button
Then user redirects to homepage 