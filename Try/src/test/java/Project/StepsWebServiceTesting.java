package Project;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import webServiceTesting.CreateUser;

public class StepsWebServiceTesting {

    CreateUser createUser;
    String name, job;

    @Given("^I use user creation service$")
    public void useUserCreationWebService() {
        createUser = new CreateUser();
    }

    @When("^I set name \"([^\"]*)\"$")
    public void setName(String name) {
        createUser.setName(name);
        this.name = name;
    }

    @When("^I set job \"([^\"]*)\"$")
    public void setJob(String job) {
        createUser.setJob(job);
        this.job = job;
    }

    @Then("^I validate my response is correct$")
    public void validateMyResponseIsCorrect() {
        createUser.getRequestSpecification()
                .given()
                .body(createUser.buildBody())
                .when()
                .post("https://reqres.in/api/users")
                .then()
                .statusCode(201);
    }

}
