package stepDefination;

import io.cucumber.java.en.*;

public class loginStep {

    @Given("User open the Chrome Browser")
    public void user_open_the_chrome_browser() {
        System.out.println("User open the Chrome Browser");
    }
    @When("User open DoD Submission Site")
    public void user_open_do_d_submission_site() {
        System.out.println("User open DoD Submission Site");
    }
    @When("User navigates to Topic modules")
    public void user_navigates_to_topic_modules() {
        System.out.println("User navigates to Topic modules");

    }
    @Then("User successfully navigates to Topic page")
    public void user_successfully_navigates_to_topic_page() {
        System.out.println("User navigates to Topic modules");
    }
}
