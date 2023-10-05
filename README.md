# OrangeHRM-Automation-TestNG
I have created a selenium testNG project for automating OrangeHRM website and asserting the expected message after successfull activities.

## Project Scenario
1. Login as a admin to https://opensource-demo.orangehrmlive.com/
2. Go to PIM menu and create a new employee. Save the employee firstname, lastname, employeeid, username and password into JSONArray file. Generate random password which meets following criteria:
For a strong password, please use a hard to guess combination of text with upper and lower case characters, symbols and numbers. Assert if employee is created successfully.
3. Now go to the dashboard again and search by the employee id to check if the employee is found
4. Now go to the Directory menu and search by employee name and check if the employee is found
5. Logout the session.
6. Now login with the newly created employee creds
7. Assert your full name is showing besides the profile icon.
8. Go to my info
9. Scroll down and select Gender and Blood Type as O+ and save it. Then logout the user.
10. Create a smoke suite configuration which will run only following features (positive cases only):
      - Login to admin
      - Search by the employee id if found
      - Logout admin and login to the employee id you created last
      - Update the blood Group as AB- 
      - Logout the user

## Tools & Framework

Tools : Intellij | Jdk-11 | Selenium | Allure

Frameworks : TestNG


## How to run this project
 - Clone the project
 - Run with Intellij

## Test cases
https://docs.google.com/spreadsheets/d/1tw6Gt6wsXr2JpPahu30fb_MdC6OpRhAFiaWI756Kpe8/edit?usp=sharing

## Allure report for overview & behaviour
   Overview:
   ![Screenshot_22](https://github.com/RedoySQA/OrangeHRM-Automation-TestNG/assets/143482478/b3f4dcd1-23f7-4e70-a97f-291968384e7f)

   Behaviour:
   ![Screenshot_23](https://github.com/RedoySQA/OrangeHRM-Automation-TestNG/assets/143482478/b8b742bc-d92e-4160-b711-825d2baeb491)

## Recorded video for automation output

https://github.com/RedoySQA/OrangeHRM-Automation-TestNG/assets/143482478/36fb5018-3408-42da-9200-57487eecbafd




