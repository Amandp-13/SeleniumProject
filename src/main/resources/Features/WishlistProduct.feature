Feature: User want to add product to Wishlist

Scenario: Add Product to Wishlist

 Given User launch Chrome browser 113.0.5672 on win 11
 And Enter URL as "www.flipkart.com"
 And Enter email as "aman1312@gmail.com" and password as "Aman@1312"
 When Click on Login button
 And User login into application
 And Enter search as "samsung s23"
 And Click on "samsung s23"
 When Click on Add to Wishlist button
 Then Product is added into wishlist