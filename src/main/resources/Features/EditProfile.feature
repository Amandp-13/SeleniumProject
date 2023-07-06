Feature: Verify that user can modify its Profile information

Background:
 Given User launch Chrome browser 113.0.5672 on win 11
 And Enter URL as "www.flipkart.com"
 And Enter email as "aman1312@gmail.com" and password as "Aman@1312"
 When Click on Login button
 And User login into application


Scenario: User wants to update its Profile
 And User cick on My Profile button
 And User click on Profile Information button
 And Click on Edit button
 And Enter Profile Information as <First Name>, <Last Name>, <Gender>, <Email> and <Mobile>

 |First Name| |Last Name| |Gender| |Email| 						|Mobile|
 |Aman| 			 |Singh| 		 |Male| 	|aman123@gmail.com| |9854785621|

 When Click on Save button
 Then Profile information get update