package webServiceTesting;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;

public class CreateUser {

  private String name;
  private String job;
  private String surname;

  private final RequestSpecification requestSpecification;

  public CreateUser() {
    this.requestSpecification = RestAssured.given()
            .baseUri("https://reqres.in/api")
            .basePath("/users");
  }

  public RequestSpecification getRequestSpecification() {
    return requestSpecification;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setJob(String job) {
    this.job = job;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public String buildBody() {
    JSONObject request = new JSONObject();
    request.put("name", this.name);
    request.put("job", this.job);
    return request.toString(4);
  }

  public String buildBodyWithSurname() {
    JSONObject request = new JSONObject();
    request.put("name", this.name + " "+ this.surname);
    request.put("job", this.job);
    return request.toString(4);
  }
}
