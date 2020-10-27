Feature: Application Login  //feature file that stores the test cases

Scenario Outline: Home page default login
Given User is on NetBank landing page 
When User enters user "<name>" and password "<password>"
Then Home page is populated 
And Credit cards displayed "true"

Examples:
	|name 	 | password |
	|AAhouse |  English |
	|BBhouse | Spanish  |

Scenario: Add items to card
Given User is on home page
When User clicks on add to card button
Then Item is added to card 
And Count of item in the card increases
