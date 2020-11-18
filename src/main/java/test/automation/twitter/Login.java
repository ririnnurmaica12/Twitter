package test.automation.twitter;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    WebDriver driver = new ChromeDriver();
    LoginHelper loginHelper = new LoginHelper(driver);

    @Given("^I navigate to twitter page$")
    public void i_navigate_to_login_page() {
        loginHelper.navigate_to_twitter_page();
    }

    @When("^I navigate to login page$")
    public void i_click_button_login() {
        loginHelper.navigate_to_login_page();
    }

    @When("^I enter user name as \"(.*?)\"$")
    public void i_enter_user_name_as(String userid) {
        loginHelper.enter_user_name_as(userid);
    }

    @When("^I enter password as \"(.*?)\"$")
    public void i_enter_password_as(String password) {
        loginHelper.enter_password_as(password);
    }

    @When("^I click login botton$")
    public void i_click_login_botton() {
        loginHelper.click_login_botton();
    }

    @Then("^Login should be \"(.*?)\"$")
    public void login_should_be_successful(String result) {
        loginHelper.login_should_be_successful(result);
    }
}
