package com.examples.cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.security.UserAndPassword;

import java.util.concurrent.TimeUnit;

public class BaseAuth {
    private WebDriver driver = new ChromeDriver();
    private String baseUrl = "https://the-internet.herokuapp.com/";

    @Given("the user navigates to  the web address for the Internet website")
    public void theUserNavigatesToTheWebAddressForTheInternetWebsite() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anicet\\Desktop\\chromedriver.exe");
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }


    @When("the user clicks the link {string}")
    public void theUserClicksTheLink(String arg0) {
        driver.findElement(By.linkText(arg0)).click();
    }

    @And("the user enters the username and password")
    public void theUserEntersTheUsernameAndPassword() {
        //Use the method to pass the credentials in the url;
        String username = "admin";
        String password = "admin";
        String newUrl = "https://" + username+":" + password + "@" + baseUrl.substring(8) + "/basic_auth";
        driver.get(newUrl);

    }

    @Then("the user is greeted with the message {string}")
    public void theUserIsGreetedWithTheMessage(String arg0) {
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),  arg0);
    }
}