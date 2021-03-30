package webServiceTesting;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class DeleteUser {

    private final RequestSpecification requestSpecification;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DeleteUser() {
        this.requestSpecification = RestAssured.given()
                .baseUri("https://reqres.in/api")
                .basePath("/users");
    }

    public RequestSpecification getRequestSpecification() {
        return requestSpecification;
    }

}

