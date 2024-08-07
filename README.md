## Herokuapp-Selenium-Automation
Just a simple Selenium Automation project I started to practice POM (page object model) and test various website features (such as file upload/download, checkboxes, dropdown menues, etc.). I'm currently updating it as I go.
## Dependencies
* Run on Windows 10 OS
* IDE for this project is IntelliJ Idea Community Edition 2024.1
* Browsers needed is Chrome (mandatory)

## Instalation

Open terminal in IDE and git clone the repository

```
git clone https://github.com/DamjanQA/Herokuapp-Selenium-Automation.git
```
* java version "21" 2024-01-16 LTS
* Apache Maven 3.9.6

## Framework Walkthorugh
Packages:
* Base - Contains classes used throughout the app
* Pages - Contains classes for each page
* Tests - Contains test classes

## Naming Convention
* Classes are written in camel case with first character in upper case
* Methods are written in camel case with first character in lower case
* Class objects are named the same as a class name with lower case for first character
* Test methods are named as test case names

## Other
* Test methods are kept clean
* Each test should have at least 2 assertions with few test exceptions
* Priorities are set with 10 increment, if higher priority occur later in testing, priority of such tests are placed between the two priorities
