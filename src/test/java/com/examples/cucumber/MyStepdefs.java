package com.examples.cucumber;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.io.File;

public class MyStepdefs {
    private WebDriver driver = new ChromeDriver();
    private String baseUrl =  "https://the-internet.herokuapp.com/";
    JavascriptExecutor js;




    @Given("the user navigates to  https:\\/\\/the-internet.herokuapp.com\\/")
    public void the_user_navigates_to_https_the_internet_herokuapp_com() {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anicet\\Desktop\\chromedriver.exe");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        js = (JavascriptExecutor) driver;
        driver.get(baseUrl);
    }
        @When("^user clicks on link A/B Testing$")
        public void readABTesting() throws  Exception{//Test clicking on the "A/B Testing" link on the website
            driver.findElement(By.linkText("A/B Testing")).click() ;

        }

    @Then("a new page opens about A\\/B Test Control description.")
    public void aNewPageOpensAboutABTestControlDescription() {
        //get the url that was just accessed
        String accessedUrl = driver.getCurrentUrl();
        //Confirm the correct url was accessed.
        assertEquals(accessedUrl, "https://the-internet.herokuapp.com/abtest");
    }


}
