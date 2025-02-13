Feature: opening bank account
Scenario: registration with nominee

Given user is at account opening page
When user enters data in following manner
|FN|LN|Email|Mob|
|shubh|agra|sa@gmail.com|9877899877|
|ishu|godsh|ig@gmail.com|6987465866|
And clicks on submit button
Then nominee name must be added