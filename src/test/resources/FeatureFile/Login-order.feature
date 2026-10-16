Feature: User have to validate the login functionality for the adactin hotel application
Background:
Given User have to pass to check the dashboard

@sanity
Scenario Outline: User have to validate the functionality with different credentials
When user have to pass the "<username>" and "<password>" and click the login button
And User have to search the hotel and click search
And User have to select the hotel and click continue
And User have to fill the required details and click book
Then User have to generate the orderId


Examples:
|username|password|
|Aakash321|O8K54X|
|Aakash321|Aakash@321|
|Aakash456|O8K54X|
|Aakash789|Aakash@789|
|||