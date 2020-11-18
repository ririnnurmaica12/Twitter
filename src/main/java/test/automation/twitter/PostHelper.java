package test.automation.twitter;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.UUID;

public class PostHelper {
    WebDriver driver;
    String uuid = UUID.randomUUID().toString();

    public PostHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void navigate_to_home_page() {
        WebDriverWait wait = new WebDriverWait(this.driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-testid=\"AppTabBar_Home_Link\"]")));

        this.driver.findElement(By.xpath("//a[@data-testid=\"AppTabBar_Home_Link\"]")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-testid=\"tweetTextarea_0\"]")));
    }

    public void enter_tweet_text_as(String text) {
        if (text.equalsIgnoreCase("with")) {
            this.driver.findElement(By.xpath("//div[@data-testid=\"tweetTextarea_0\"]")).sendKeys(this.uuid);
        }
    }

    public void enter_tweet_image_as(String is_image_attached) {
        if (is_image_attached.equalsIgnoreCase("with")) {
            String imagePath = System.getProperty("user.dir") + "/src/test/image/view.jpeg";
            this.driver.findElement(By.xpath("//input[@data-testid=\"fileInput\"]")).sendKeys(imagePath);
        }
    }

    public void click_tweet_button(String is_image_attached) {
        this.driver.findElement(By.xpath("//div[@data-testid=\"tweetButtonInline\"]")).click();

        if (is_image_attached.equalsIgnoreCase("with")) {
            WebDriverWait wait = new WebDriverWait(this.driver, 10);
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@data-testid=\"tweetButtonInline\"]")));
        }
    }

    public void tweet_should_be_posted(String result) {
        WebDriverWait wait = new WebDriverWait(this.driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-testid=\"tweetButtonInline\"]")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-testid=\"tweet\"]/div[2]/div[2]/div/div/span")));

        String postText = this.driver.findElement(By.xpath("//div[@data-testid=\"tweet\"]/div[2]/div[2]/div/div/span")).getText();
        if (result.equalsIgnoreCase("shouldn't")) {
            Assert.assertNotEquals(this.uuid, postText);
        } else if(result.equalsIgnoreCase("shouldn")){
            Assert.assertEquals(this.uuid, postText);
        }
    }
}
