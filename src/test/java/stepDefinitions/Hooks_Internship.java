package stepDefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utilities.BaseDriver_Internship;

public class Hooks_Internship {

    @Before
    public void befor(){
    }
    @After
    public void after() throws InterruptedException {
        Thread.sleep(1000);
        BaseDriver_Internship.getDriver().quit();
    }
}
