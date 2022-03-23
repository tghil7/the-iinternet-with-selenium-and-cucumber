package com.examples.cucumber;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;


public class brokenImages {

    private WebDriver driver = new ChromeDriver();
    private String  baseUrl = "https://the-internet.herokuapp.com";

    @Given("I navigate to the url https:\\/\\/the-internet.herokuapp.com")
    public void iNavigateToTheUrlHttpsTheInternetHerokuappCom() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anicet\\Desktop\\chromedriver.exe");
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }


    @When("I click on the link {string}")
    public void iClickOnTheLink(String arg0) {
        driver.findElement(By.linkText("Broken Images")).click();
    }

    @Then("{int}  broken images are displayed on the screen")
    public void brokenImagesAreDisplayedOnTheScreen(int arg0) {
    }
}
