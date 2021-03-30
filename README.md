# Challenge

## Requirements

* Maven
* Java (JDK 8)
* Git

## Browser and Web Services Testing

The objective of this challenge is to implement Cucumber steps to develop automatic
functional tests on both browser and a web service.  
It is also expected that the candidate is able to understand unit testing and develop some
JAVA methods.  
First, perform some exploratory tests in the following
portal: https://qa-automation-challenge.github.io/sandbox/. If there is any defect, make a
document to report it.

#### Instructions:

* Look at the unit tests and develop the necessary code to run them with success.
* Develop four automated tests according to the description in the acceptanceCriteria
  directory
    * The tests have to be in .feature files described in Gherkin language
    * A report must be generated after test execution
* Describe how you executed the automated tests in your local machine
* Feel free to change, remove or add new Cucumber steps according to the best coding
  practices

**Note: The solution should be shared in your own Git repository. Make sure that you keep
the Git commit history clean**

============================================================================================

### Exploratory tests

| Action                | Possible Problem      |
|:----------------------|:----------------------|
| Choose "Monthly duration" | Negative number should not be selectable |
| Choose "Monthly duration" and click "Calculate" | It is not possible to submit more than 12 months |
| Write "Comments" | "Add a comment..." should not be text (should be placeholder)  |
| Resize "Comments" textareas (main one and the one in the "Your selection summary") | Textarea should not be resizable |
| Click on "See our products" | Should open in the same tab |
| Click on "Win a prize" | Button does not do anything |
| Check and drag "See our sales progress" chart | Shoud not have data to future months (or it is a projection?) |
| In "Product Catalogue" page | It is not possible to do anything else than select option "Contract" |

PS: I do not know the use cases or purpose of any feature in this website, so the previous table have just opinions from the usability point of view.

### Run automated tests in local machine

I used IntelliJ IDEA to develop the challenge and to run it.  
It is just necessary to run "mvn verify" inside the folder "Try" in any command line with java and maven.  
It will run the 2 unit tests and the 4 automated tests.  
Furthermore reports will be generated in "Try\target\cucumber-report-html\cucumber-html-reports". 
The file "feature-overview" has all the information about the automated tests.  