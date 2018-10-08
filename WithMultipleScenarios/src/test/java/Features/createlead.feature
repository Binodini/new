Feature: Login to the TestLeaf application and navigate to create Lead Create contact

Background: Login to the testleaf application
Given Launch the Browser
And Navigate to the URL
And Enter the Username as DemoSalesManager
And Enter the Password as crmsfa
When Click on Login button
Then Navigate to CRMSFA
And Click on CRMSFA link

@CreateLead
Scenario Outline:Create Lead
And Click on leads tab
And Click on Create Lead menu
And Enter company name as <Company Name>
And Enter First Name as <First Name>
And Enter last Name as <Last Name>
When Click on submit button
Then Lead created successfully
And Close the Browser
Examples:
|Company Name|First Name|Last Name|
|O Enter|OYO|Gupta|
|I EnterPrises|Ola|Gupta|
|B Enterprizes|Uber|Srivastav|


@createcontact
Scenario Outline:Create Contact
And Click on Contacts
And Click on Create Contacts
And Enter First name as <First Name>
And Enter Last name as <Last Name>
When Click on Create Contact Button
Then The contact created successfully
And The browser closed
Examples:
|First Name|Last Name|
|Binodini|Sahoo|
|Kunmun|Verma|


