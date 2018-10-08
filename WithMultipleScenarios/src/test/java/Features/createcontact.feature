Feature: Create contact
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
