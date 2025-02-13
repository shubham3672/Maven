@all
Feature: Sending email campaign
@Sanity
Scenario: create campaign
Given user is at campaign page
When user clicks on campaign button
And user enters information
And user clicks on save button
Then campaign should be created

@Functional
Scenario: Schedule campaign
Given user is at campaign page
When user clicks on edit campaign
And user enters schedule information
And user clicks on save button
Then campaign should be scheduled

@Regression
Scenario: Schedule campaign
Given user is at campaign page
When user clicks on edit campaign
And user enters schedule information
And user clicks on save button
Then campaign should be scheduled