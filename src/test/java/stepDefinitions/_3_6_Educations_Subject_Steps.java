package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.DialogContent_Internship;
import pages.Left_Nav_Internship;
import utilities.BaseDriver_Internship;

public class _3_6_Educations_Subject_Steps {
    WebDriver driver= BaseDriver_Internship.getDriver();
    private final DialogContent_Internship dc;
    private final Left_Nav_Internship ln;

    public _3_6_Educations_Subject_Steps(DialogContent_Internship dc,Left_Nav_Internship ln){
        this.dc=dc;
        this.ln=ln;

    }

    @Given("^Navigate to Education$")
    public void navigateToEducation() {
     ln.findAndClick(ln.getEducations_Button());
     ln.findAndClick(ln.getEducation_Setup_Button());
     ln.findAndClick(ln.getEducation_Subject_Button());
    }

    @Then("^Success message be displayed$")
    public void successMessageBeDisplayed() {
    dc.verifyFunctions(dc.getEducation_successfullyMessage(),"successfully");
    }

    @When("^User delete  Citizenschip name as \"([^\"]*)\"$")
    public void userDeleteCitizenschipNameAs(String name) {
      dc.findandDelete(name);
    }
    @Then("^Create  a Subject name as \"([^\"]*)\" code as \"([^\"]*)\"$")
    public void createASubjectNameAsCodeAs(String name, String code)  {
        dc.findAndClick(dc.getEducation_Subject_addButton());
        dc.findAndSend(dc.getEducation_Subject_inputName(),name);
        dc.findAndSend(dc.getEducation_Subject_inputCode(),code);
        dc.findAndClick(dc.getEducation_Subject_Category_Button());
        dc.findAndSelect(dc.getEducation_Subject_Options(),"Foreign Languages");
        dc.findAndClick(dc.getEduc_Sub_saveButton());
    }
}
