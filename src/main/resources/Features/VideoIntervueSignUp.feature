Feature: Verify user can signup into application. 
As User want to access the application



Scenario: SignUp into application
Given User launch Chrome browser 113.0.5672 on win 11
And User enter URL as "www.videointervue.com"
When User click on "Sign Up" button
Then SignUp page will open
And user enter value as <Company Name> , <Full Name> , <Email> , <Phone Number> , <Password> , <Confirm Password>
|Company Name| |Full Name| 	|Email| 						|Phone Number| 	|Password| 		|Confirm Password|
|BC Logistics| |Aman Singh| |bclogic@gmail.com| |9541257856| 		|Bclogic@123| |Bclogic@123|

And User click on check box appear with Terms and Privacy Policy
When User click on "Sign Up Now" button
Then user will navigate to Subscription page.