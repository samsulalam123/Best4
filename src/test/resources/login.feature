@Login
Feature: Check automationpractice login

Scenario Outline: login with valid credential and check the different functionality
		
Given open the chrome browser
And Enter the "<URL>"
When Click on sign in
And Enter userEmail "<email>"
And Enter the userPass "<password>"
And Click on Sign in button

Examples: 
|URL										|email								|password|
|http://automationpractice.com/index.php	|jahirultech86@gmail.com			|sunday2019|