package test.automation.twitter;

import cucumber.api.PendingException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PostGiftHelper {
    WebDriver driver;
    public PostGiftHelper(WebDriver driver){
        this.driver = driver;
    }

    public void select_gift() throws Throwable {
        driver.findElement(By.xpath("//div[@aria-label=\"Add a GIF\"]")).click();
    }

    public void send_tweet_gift_as(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    public void tweet_be_posted(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
