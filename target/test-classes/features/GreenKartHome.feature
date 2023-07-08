Feature: Validating GreenKart Home Page

Scenario: Validate the Page Title

Given Access the URL "https://rahulshettyacademy.com/seleniumPractise/"
When Page loads the Maximize the page
Then Validate the page title

Scenario: Validate the Product name

Then Validate the product name

Scenario: Validate the Search bar

When Verify Whether search bar is visible
Then Validate the Search field placeholder text "Search for Vegetables and Fruits"

Scenario: Validate the following keywords in search field

When Verify Whether search bar is visible
Then Validate the <Keywords> in search field area

|Apple|Orange|Tomato|


