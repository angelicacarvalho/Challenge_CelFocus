package webServiceTesting;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;

public class RegisterUser {

    private String user;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    private final RequestSpecification requestSpecification;


    public RegisterUser() {
        this.requestSpecification = RestAssured.given()
                .baseUri("https://reqres.in/api")
                .basePath("/register");
    }

    public RequestSpecification getRequestSpecification() {
        return requestSpecification;
    }
    public String buildBody() {
        JSONObject request = new JSONObject();
        request.put("email", this.user);
        return request.toString(4);
    }

}
