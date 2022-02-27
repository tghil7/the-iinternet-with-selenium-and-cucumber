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
    private WebDriver driver;
    private String baseUrl;
    private StringBuffer verificationErrors = new StringBuffer();
    JavascriptExecutor js;



        @Given("^the user navigates to the url https://the-internet\\.herokuapp\\.com/$")
        public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anicet\\Desktop\\chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "https://the-internet.herokuapp.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        js = (JavascriptExecutor) driver;
        driver.get(baseUrl);
        }
        @When("^user clicks on link A/B Testing$")
        public void readABTesting() throws  Exception{//Test clicking on the "A/B Testing" link on the website
            driver.findElement(By.linkText("A/B Testing")).click() ;
        }

        @Then("^new page opens about A/B Test Control description\\.$")
        public void checkLink()throws Exception{
            //get the url that was just accessed
            String accessedUrl = driver.getCurrentUrl();
            //Confirm the correct url was accessed.
            assertEquals(accessedUrl, "https://the-internet.herokuapp.com/abtest");
        }





}
