Feature: Verify Hotel room booking.
As a user I want to search Hotel room for selected date(s).

Background:
	Given I have Logged in as a registered user
	And I have navigated to Booking screen

Scenario: Search Hotel Room for 1 day
	And Click on Hotels button
	And click on Oneway radio button
	And Click on Location field
	And Enter From as "Goa"
	And Select Check-In date from calendar as "25-05-2023"
	And Select Check-Out date from calendar as "26-05-2023"
	And Click on Room & Guests
	And Select Room as "1"
	And Select as Adult as "2"
	And Select as Children as "1"
	And Click on Apply button
	When Click on Search button
	Then search result appear for screen