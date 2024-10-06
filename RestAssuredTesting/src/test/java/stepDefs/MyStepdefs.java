package stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static org.junit.Assert.*;

import static io.restassured.RestAssured.baseURI;

public class MyStepdefs {

    private Response response;

    @When("client makes a request to get the users")
    public void client_makes_a_request_to_get_the_users() {

        baseURI = "https://reqres.in/api/";

        RequestSpecification requestSpecification = RestAssured.given();

        requestSpecification.header("Content-Type", "application/json");

        response = requestSpecification.get("/users?page=2");

        System.out.println(response.getBody().prettyPrint());

    }

    @Then("client should receive response with status code as {int}")
    public void clientShouldReceiveResponseWithStatusCodeAs(int expectedStatusCode) {

        assertEquals(response.getStatusCode(), expectedStatusCode);
    }
}

