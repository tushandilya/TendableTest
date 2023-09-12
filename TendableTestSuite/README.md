
# Tendable Automation

This repo contains the sample test framework that is given as an Assignment by Tendable as part of recruitment process.

This test automation framework is designed on the basis of Page Object Model.

One Base Class is created to initialize the WebDriver instance and other utility instances and to perform intial browser setup.This is placed under com.tendable.utilities package

-BaseClass.java

One utility Class is included to read the url and other credentilas from properties file.This is included under com.tendable.utilities package

ReadConfig.java

Two Page classes are created to cater the page elemnts and it's operations as per the scenarios given in the challenge.These are placed under com.tendable.pageObjects package

-HomePage.java

-ContactUsPage.java

A test class is included which contains 2 test methods to cater the test scenarios mentioned in the challange.This is placed under com.tendable.testcase package

-Tendable_TestCase.java  


## Authors

- [@tushandilya](https://github.com/tushandilya/)
- 
## 🚀 About Me
I'm an Automation Test Engineer

## How to Build and run the Project

Required tools
•Git
•JDK8
•Maven (v3+)

## Clone project using git bash:

To run tests, run the following command

git clone git@github.com:springernature/fluffy.git

Run - Tendable_TestCase.java OR
TestNG.xml

#### Run tests from any console from command line:
Run it with `mvn clean test` in project's root.



