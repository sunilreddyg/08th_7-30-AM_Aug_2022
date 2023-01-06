Feature: Veriyfing User Registration
	Scenario: Valid Registration
	
	    Given Enter Facebook Site url
		When user enter valid mobilenumber
		And wait for OTP
		And Enter valid OTP
		And Click on Create Account Button
		Then Verify Registration successful message displayed

		Scenario:
			Given Enter Facebook Site url