package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.DialogContent_Internship;
import pages.Left_Nav_Internship;
import utilities.BaseDriver_Internship;

import java.util.concurrent.TimeUnit;

public class _01_Login_Steps {


    WebDriver driver= BaseDriver_Internship.getDriver();

    private  final DialogContent_Internship dc;


    public _01_Login_Steps(DialogContent_Internship dc ) {
        this.dc = dc;

    }

    @Given("^Navigate to basgar$")
    public void navigateToBasgar() {
        driver.get("https://demo.mersys.io/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

    }

    @When("^Enter username and password and click login button$")
    public void enterUsernameAndPasswordAndClickLoginButton() {
      dc.findAndSend(dc.getUsername(),"richfield.edu");
      dc.findAndSend(dc.getPassword(),"Richfield2020!");
      dc.findAndClick(dc.getCookies());
      dc.findAndClick(dc.getLoginButton());
    }

}
