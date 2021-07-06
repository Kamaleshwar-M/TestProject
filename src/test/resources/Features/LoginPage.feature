Feature: Verifying facebook details
Scenario Outline: Verifying facebook Login details with valid credentials

Given User is on facebook login page
When User should enter "<Username>" and "<Password>"
When User should click login button
Then User should verify success message

Examples:

|Username|Password|
|Kamalesh|Kamal@123|