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



public class addRemove {
    private WebDriver driver = new ChromeDriver();
    private String baseUrl = "https://the-internet.herokuapp.com/";;
    JavascriptExecutor js;

    @Given("the user navigates to the url https:\\/\\/the-internet.herokuapp.com\\/")
    public void theUserNavigatesToTheUrlHttpsTheInternetHerokuappCom() {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anicet\\Desktop\\chromedriver.exe");
        baseUrl = "https://the-internet.herokuapp.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        js = (JavascriptExecutor) driver;
        driver.get(baseUrl);
        //assertEquals(driver.getCurrentUrl(), "https://the-internet.herokuapp.com/abtest");

    }

    
    @When("user clicks on link Add\\/Remove Elements")
    public void userClicksOnLinkAddRemoveElements() {
        driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[2]/a")).click();
    }

    @And("a new page opens with Add Element button that the user clicks")
    public void aNewPageOpensWithAddElementButton() {
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/button")).click();
    }

    @And("user sees the {string} button on the screen that he clicks")
    public void userSeesTheButtonOnTheScreenThatHeClicks(String argument) {
        assertEquals(argument,driver.findElement(By.xpath("//*[@id=\"elements\"]/button")).getText() );
        driver.findElement(By.xpath("//*[@id=\"elements\"]/button")).click();
    }

    @Then("the {string} button disappears")
    public void theButtonDisappears(String arg0) throws NoSuchElementException {
        //Check for all the button elements that have "Delete" text and confirm the result is none, zero.
      assertTrue((driver.findElements(By.xpath("//*[@id=\"elements\"]/button")).size() == 0));
    }





}
