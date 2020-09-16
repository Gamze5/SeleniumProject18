package test.day9_testbase_properties_driverUtil;

public class OFFICE_GURHAN_NOTES {
    /*
    JUL 1, WEDNESDAY
TESTBASE --> BASE--> just one parent class to tests that has the common setups, and teardowns.
What is test data?
- Test data is all the information we use to test the application.
How we are currently passing test data to our application?
- We are currently HARDCODING our test data.
What is hard coding?
- We are literally entering the test data into our CODE.
- If we are putting the data itself into the ACTUAL CODE, it means we are hard coding.
How do we understand if we are hard coding test data?
- If you have to go inside of the test to change the data, it means you hardcoded the data into your source.
WHAT IS PROPERTIES TYPE OF FILE?
--> PROPERTIES FILE is just another type of file.
--> There are different types of TEXT storing files such as:
    -txt
    -doc
    -csv
    -xml
--> Properties file is storing information in KEY=VALUE format.
--> Key has to be exact match in order to be able to read the value.
--> Also be careful on passing value 100% correct as well.
    configuration.properties --> this file we will only store important test data that will change the flow of the tests
    enviroments (different urls) =>
    qa1.vytrack.com
    qa2.vytrack.com
    staging1.vytrack.com
    staging2.vytrack.com
    production (PROD) -->  www.vytrack.com
    configuration --> name of the file
    .properties --> type of the file
    ex:
        url= if I change the url i can make the whole test suite run on different environment
        username= if I change the username/password I can run the whole test suite against different accounts.
        password=

        browser= chrome/firefox --> if I change the browser type, I could be running the whole test suite against a different browser.
WHAT IS CROSS BROWSER TESTING?
    => Running same test suite against different browsers.
    ex: 90% chrome
        5% firefox-safari
        %5 rest (IE, edge)
PARALLEL TESTING --> is running your tests on multiple machines.
ex : lets say you have 100 tests to run.
    1 test taking 1 min to run.
    -> 1 machine takes = 100 mins
    -> 2 machines takes = 50 mins
    -> 4 machines takes = 25mins total run time of all test suite
WHERE DO WE CREATE PROPERTIES FILE AND WHY?
-> We store it in the project folder level, and NOT inside of any of our code package.
-> Because this is not JAVA code, this is just test data we want to pass to our java code from outside.
WHY DO WE NEED? WHAT ARE WE GOING TO DO WITH IT?
--> #1 REASON : Is not having to hardcode your configuration test data into your code itself.
What is configuration test data?
    -> Important test data that can change running flow of the test suite.
    ex: Changing 1 string value of key URL => helps you run your test on different environment
--> #2 REASON: Easy to fix any issue. You just need to go 1 file, (configuration.properties) and fix it there
--> #3 REASON: East to do DATA DRIVEN TESTING
WHAT IS DATA DRIVEN TESTING?
    -> Running the same tests with different data sets.
    ex: login test:
        username1, password1
        username2, password2
        username3, password3
        username4, password4
HOW DO WE READ FROM THE PROPERTIES?
=> There is an existing java class called Properties that helps us read properties file.
-> Properties class was created to read ".properties" type of file
--> When we create and object of this class, and load the configuration.properties file into this object, it has its ready methods to help us read key=value format.
What is framework?
    -> Is the combination of the tools, and utilities that we use in and project makes our framework.
    -> What kind of logic you created in your project.
--> STEP BY STEP HOW TO READ FROM PROPERTIES
1- Create an instance of Properties class
5MINS BREAK -> 12.25
DRIVER UTILITIES

     */
}
