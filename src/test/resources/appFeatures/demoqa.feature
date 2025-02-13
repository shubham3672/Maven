Feature: Insert Information  	
Scenario: Inserting required info

Given user navigated to form page
When user enters name
And user enters lastname
And user enters email
And user selects gender
And user enters mobileno
And user enters dob
And user selects hobbies
And user enters current address
And user selects state
And user selects city
And clicks on submit
Then user redirects to nextpage 