package test.automation.twitter;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PostGift {
    WebDriver driver = new ChromeDriver();
    PostGiftHelper postGiftHelper= new PostGiftHelper(driver);
    LoginHelper loginHelper = new LoginHelper(driver);
    PostHelper postHelper = new PostHelper(driver);

    @Given("^I already logged in with \"(.*?)\" and \"(.*?)\" for post$")
    public void i_already_logged_in_with(String username, String password) {
        loginHelper.navigate_to_twitter_page();
        loginHelper.navigate_to_login_page();
        loginHelper.enter_user_name_as(username);
        loginHelper.enter_password_as(password);
        loginHelper.click_login_botton();
    }

    @When("^I navigate to home page for post$")
    public void i_navigate_to_home_page() {
        postHelper.navigate_to_home_page();
    }
    @When("^I select gift$")
    public void i_select_gift() throws Throwable {
        postGiftHelper.select_gift();
    }

    @When("^I send tweet gift as \"(.*?)\"$")
    public void i_send_tweet_gift_as(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Gift tweet \"(.*?)\" be posted$")
    public void gift_tweet_be_posted(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
