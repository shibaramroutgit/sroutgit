package setpDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddAPIStepDefinition {
    @Given("Add Place Payload")
    public void add_place_payload() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("1");
    }
    @When("User calls AddPlaceAPI with POST HTTP Request")
    public void user_calls_add_place_api_with_post_http_request() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("2");
    }
    @Then("API call success with status code")
    public void api_call_success_with_status_code() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("3");
    }
    @Then("status in response body is ok")
    public void status_in_response_body_is_ok() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("4");
    }

}
