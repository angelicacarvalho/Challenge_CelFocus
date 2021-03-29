package webServiceTesting;

import gherkin.deps.com.google.gson.JsonObject;
import gherkin.deps.com.google.gson.JsonParser;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class CreateUser {

  private String name;
  private String job;
  private String surname;

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  private final RequestSpecification requestSpecification;

  public String getName() {
    return name;
  }

  public String getJob() {
    return job;
  }

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

  public String buildBody() {
    String res = "{\n    \"name\": \"" + this.getName() + "\",\n    \"job\": \"" + this.getJob() + "\"\n}";
    return res;
  }

  public String buildBodyWithSurname() {
    String res = "{\n    \"name\": \"" + this.getName() +" " + this.getSurname() + "\",\n    \"job\": \"" + this.getJob() + "\"\n}";
    return res;
  }
}
