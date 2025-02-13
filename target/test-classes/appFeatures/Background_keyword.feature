Feature: Login functionality

Background:
Given user logged in to the app
When user clicks on order link
Then user redirected to order page

Scenario: Fetching currently placed order
When user clicks on currently placed order
Then user should see current order info

Scenario: Fetching previously placed order
When user clicks on previous placed order
Then user should see previous order info

Scenario: Fetching cancelled order
When user clicks on cancelled order
Then user should see cancelled order info