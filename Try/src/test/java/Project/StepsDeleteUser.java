package Project;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.json.JSONObject;
import webServiceTesting.DeleteUser;

public class StepsDeleteUser {

    DeleteUser deleteUser;
    int id;

    @Given("^I access the API to delete user$")
    public void i_access_the_API(){
        deleteUser = new DeleteUser();
    }

    @When("^I set user id \"([^\"]*)\"$")
    public void i_set_user_id(int id){
        deleteUser.setId(id);
        this.id = id;
    }

    @Then("^I validate that user was deleted$")
    public void i_validate_that_user_was_deleted(){
        JSONObject request = new JSONObject();
        deleteUser.getRequestSpecification()
                .given()
                .body(request.toString())
                .when()
                .delete("https://reqres.in/api/users/"+deleteUser.getId())
                .then()
                .statusCode(204);
    }
}
