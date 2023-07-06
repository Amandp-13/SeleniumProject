Feature: User want to purchase the product

Scenario: Place order for product

 Given User launch Chrome browser 113.0.5672 on win 11
 And Enter URL as "www.flipkart.com"
 And Enter email as "aman1312@gmail.com" and password as "Aman@1312"
 When Click on Login button
 Then User login into application
 And Enter search as "samsung s23"
 And Click on "samsung s23"
 And Click on Buy Now button
 And Click on Add New Address button
 And Enter Address as <Name>,<Mobile>,<Pincode>,<Locality>,<Address>,<City>,<State> and <Address Type>

 |Name|       |Mobile|  		|Pincode| |Locality| 		|Address| 		 |City| 			|State| 			|Address Type|
 |Aman Singh| |986592|		  |160101| 	|Chandigarh|	|29,Sector 31| |Chandigarh| |Chandigarh| 	|Home|
 |Aman Singh| |9865498592| |1601| 	|Chandigarh|	|29,Sector 31| |Chandigarh| |Chandigarh| 	|Home|
 |Aman Singh| |9865498592| |160101| 	|Chandigarh|	|29,Sector 31| |Chandigarh| |Chandigarh| 	|Home|

 And Click on Save and Deliver here button
 And Click on Continue button on Order Summary
 When Click on Cash on Delivery button
 Then The order is placed
