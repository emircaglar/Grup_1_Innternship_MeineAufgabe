package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.DialogContent_Internship;
import pages.Left_Nav_Internship;
import utilities.BaseDriver_Internship;
import utilities.ExcelUtilities;

import java.util.List;

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

    @Then("^Create  a Subject$")
    public void createASubject() {
        List<List<String>>excelReturnList = ExcelUtilities.getListData("src/test/java/ApachePOI/recources/ApacheExcel2.xlsx","testCitizen",2);
        for (int i = 0; i <excelReturnList.size() ; i++) {
            dc.findAndClick(dc.getEducation_Subject_addButton());
            dc.findAndSend(dc.getEducation_Subject_inputName(),excelReturnList.get(i).get(0));
            dc.findAndSend(dc.getEducation_Subject_inputCode(),excelReturnList.get(i).get(1));
            dc.findAndClick(dc.getEducation_Subject_Category_Button());
            dc.findAndSelect(dc.getEducation_Subject_Options(),"Foreign Languages");
            dc.findAndClick(dc.getEduc_Sub_saveButton());
        }
    }

    @When("^User delete  Subject$")
    public void userDeleteSubject() {
        List<List<String>>excelReturnList = ExcelUtilities.getListData("src/test/java/ApachePOI/recources/ApacheExcel2.xlsx","testCitizen",2);
        for (int i = 0; i <excelReturnList.size() ; i++) {
            dc.findandDelete(excelReturnList.get(i).get(0));
        }
    }
}
