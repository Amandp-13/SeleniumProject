Feature: Verify the user login functionality


As a user I want to test the login process of application. So that I can purchase product.

Scenario: Verify the successful login with valid details.(Expected Result)

 Given User launch Chrome browser 113.0.5672 on win 11
 And Enter URL as "www.flipkart.com"
 And Login with phone as "9646739868" and password "Aman@1234"
 When User clicks on "Login" button
 Then User should login into application