Feature: Summer Dresses to checkout
@SmokeTest
Scenario: Validation of summer dresses addition to cart
	Given user navigates to homepage
	When user adds summer dress to cart
	And use clicks checkout
	And user clicks Proceed to checkout
	Then Signin page is displayed