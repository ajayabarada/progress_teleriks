Feature: User registered for the application

Scenario Outline: User try to register into the application
Given user open the application
When user click on the your account option
And user clickon create new account option
And user fill the personal info like "<Email>", "<Firstname>", "<Lastname>" and company "<Company>"
And user select the country "<Country>" and fill the phone number "<Phone>"

Examples:
|Email|Firstname|Lastname|Company|Country|Phone|
|suchismitabastia@gmail.com|suchismita|bastia|sillicon valley bank|85|4793886204|

Scenario Outline: user login into application as a registered user
Given user click on your account button
When user enters the Username "<username>" and Password "<Password>" and click on login button

Examples:
|username|password|
|suchismitabastia@gmail.com|Dgtc@123|