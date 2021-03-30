package Project;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import webServiceTesting.CreateUser;
import webServiceTesting.DeleteUser;
import webServiceTesting.RegisterUser;

public class StepsRegisterUser {
    RegisterUser registerUser;
    String user;

    @Given("^I access the API to register user$")
    public void i_access_the_API(){
        registerUser = new RegisterUser();
    }
    @When("^I set the user \"([^\"]*)\"$")
    public void i_set_the_user(String user){
        registerUser.setUser(user);
        this.user = user;
    }

    @Then("^I validate that the user is not created$")
    public void i_validate_that_the_user_is_not_created(){
        registerUser.getRequestSpecification()
                .given()
                .body(registerUser.buildBody())
                .when()
                .post("https://reqres.in/api/register")
                .then()
                .statusCode(400);
    }
}
