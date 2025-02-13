Feature: Signup functionality with Data
Scenario Outline: signup to application with multiple test data
Given user is at login page
When user enters username as "<username>"
And user enters password as "<password>"
And clicks login button
Then user redirects to homepage

Examples:
|username|password|
|shubh123|shubh@123|
|baba321|baba@321|
|gyanu524|gyanu@441|
