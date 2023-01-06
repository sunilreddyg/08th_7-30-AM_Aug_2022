Feature: Verify Flipkart Registration
	Scenario: Registration with mobile number
		Given site url as "http://flipkart.com"
		And click on Register with us
		When user enter valid mobilenumber "9030248855"
		And Enter firstname as "Sunil"
		And Enter Surname as "Gajjala"
		And Enter age as 22
		And click on Register
		Then verify Sucessful message