package test.automation.twitter;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Post {
    WebDriver driver = new ChromeDriver();
    PostHelper postHelper = new PostHelper(driver);
    LoginHelper loginHelper = new LoginHelper(driver);

    @Given("^I already logged in with \"(.*?)\" and \"(.*?)\"$")
    public void i_already_logged_in_with(String username, String password) {
        loginHelper.navigate_to_twitter_page();
        loginHelper.navigate_to_login_page();
        loginHelper.enter_user_name_as(username);
        loginHelper.enter_password_as(password);
        loginHelper.click_login_botton();
    }

    @When("^I navigate to home page$")
    public void i_navigate_to_home_page() {
        postHelper.navigate_to_home_page();
    }

    @When("^I enter tweet \"(.*?)\" text$")
    public void i_enter_tweet_text_as(String text) {
        postHelper.enter_tweet_text_as(text);
    }

    @When("^I enter tweet \"(.*?)\" image$")
    public void i_enter_tweet_image_as(String image) {
        postHelper.enter_tweet_image_as(image);
    }

    @When("^I send tweet \"(.*?)\" text and \"(.*?)\" image$")
    public void i_click_tweet_button(String text, String image) {
        postHelper.click_tweet_button(image);
    }

    @Then("^Tweet \"(.*?)\" be posted$")
    public void tweet_should_be_posted(String result){
        postHelper.tweet_should_be_posted(result);
    }
}
