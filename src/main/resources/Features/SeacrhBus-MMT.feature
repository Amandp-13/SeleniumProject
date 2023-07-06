Feature: Verify the search bus functionality.

As a registered user I want to book a seat on Bus.


Scenario: 
	Given User launch Chrome browser 113.0.5672 on win 11
	And Enter URL as "www.makemytrip.com"
	And Click Login or Create Account button
	And Enter phone number as "9646739868"
	And Click on continue button
	And Enter password as "Aman@134"
	When Click on Login button
	Then User will redirect to home screen.
	And Click on "Buses"
	And Click on From field
	And Enter From as "Chandigarh"
	And Enter To as "Amritsar"
	And Select date from Calendar as "27-05-2023"
	When Click on Search button
	Then search results appear on screen
	