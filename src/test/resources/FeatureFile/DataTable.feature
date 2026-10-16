@login
Feature: User have to validate the login functionality for the adactin hotel application
Background:
Given User have to validate the url of the login page

@smoke
Scenario: User have to validate the login functionality by passing the valid username and valid password
When user have to pass the valid username and valid password and click the login button

|Aakash321|
|O8K54X|
|Aakash456|
|Aakash@321|

Then User have to validate the login

@sanity
Scenario: User have to validate the login functionality by passing the Invalid username and valid password
When user have to pass the Invalid username and valid password and click the login button

|Aakash321|Aakash@123|
|Aakash456|Aakash@654|
|Aakash789|Aakash@987|

Then User have to verify login page

@smoke
Scenario: User have to validate the login functionality by passing the valid username and Invalid password
When user have to pass the valid username and Invalid password and click the login button

|username|Aakash321|
|password|Aakasg@321|

Then User have to validate the login page

@regression
Scenario: User have to validate the login functionality by passing the Invalid username and Invalid password
When user have to pass the Invalid username and Invalid password and click the login button

|username|password|
|Aakash000|Aakash@000|
|Aakash111|Aakash@111|

Then User have to verify the dashboard