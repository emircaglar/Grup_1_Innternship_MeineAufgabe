package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver_Internship;

import java.util.List;

public class DialogContent_Internship extends Parent {

    public DialogContent_Internship() {
        PageFactory.initElements(BaseDriver_Internship.getDriver(), this);
    }


    @FindBy(id = "mat-input-0")
    private WebElement username;
    @FindBy(id = "mat-input-1")
    private WebElement password;
    @FindBy(xpath = "//button[text()='Accept all cookies']")
    private WebElement cookies;
    @FindBy(css = "button[aria-label=\"LOGIN\"]")
    private WebElement loginButton;
    @FindBy(xpath = "//span[contains(text(),'Dashboard')]")
    public WebElement dashboard;

    @FindBy(xpath = "//ms-add-button[@table='true']//button")
    private WebElement Education_Subject_addButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement Education_Subject_inputName;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    private WebElement Education_Subject_inputCode;

    @FindBy(xpath = "//mat-form-field[@formgroupname='subjectCategory']//mat-select")
    private WebElement Education_Subject_Category_Button;

    @FindBy(xpath = "//div[@role='listbox']//mat-option//span")
    private List<WebElement> Education_Subject_Categoryoptions;

    @FindBy(xpath = "//mat-form-field[@formgroupname='css']//mat-select")
    private WebElement Education_Subject_Style_Button;

    @FindBy(xpath = "//div[@role='listbox']//mat-option//span")
    private List<WebElement> Education_Subject_StylOptions;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement Educ_Sub_saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement Education_successfullyMessage;

    @FindBy(xpath = "(//ms-text-field//input)[1]")
    private WebElement Education_Subjct_DeleteName;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement Education_Subjct_searchButton;

    @FindBy(xpath = "//ms-delete-button//button")
    private WebElement Education_Subjct_deleteButton;

    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement Education_Subjct_deleteButton2;


    @FindBy(xpath = "(//div[@class='ps__rail-y'])[2]")
    private WebElement rigtScroll;

    public WebElement getRigtScroll() {
        return rigtScroll;
    }
    
    public WebElement getEducation_Subjct_DeleteName() {
        return Education_Subjct_DeleteName;
    }

    public WebElement getEducation_Subjct_searchButton() {
        return Education_Subjct_searchButton;
    }

    public WebElement getEducation_Subjct_deleteButton() {
        return Education_Subjct_deleteButton;
    }

    public WebElement getEducation_Subjct_deleteButton2() {
        return Education_Subjct_deleteButton2;
    }

    public WebElement getEducation_successfullyMessage() {
        return Education_successfullyMessage;
    }

    public WebElement getEduc_Sub_saveButton() {
        return Educ_Sub_saveButton;
    }

    public List<WebElement> getEducation_Subject_Categoryoptions() {
        return Education_Subject_Categoryoptions;
    }

    public List<WebElement> getEducation_Subject_StylOptions() {
        return Education_Subject_StylOptions;
    }

    public WebElement getEducation_Subject_Style_Button() {
        return Education_Subject_Style_Button;
    }

    //mat-form-field[@formgroupname='css']//mat-select
    public List<WebElement> getEducation_Subject_Options() {
        return Education_Subject_Categoryoptions;
    }

    public WebElement getEducation_Subject_Category_Button() {
        return Education_Subject_Category_Button;
    }

    public WebElement getEducation_Subject_inputCode() {
        return Education_Subject_inputCode;
    }

    public WebElement getEducation_Subject_inputName() {
        return Education_Subject_inputName;
    }

    public WebElement getEducation_Subject_addButton() {
        return Education_Subject_addButton;
    }

    public WebElement getUsername() {
        return username;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getCookies() {
        return cookies;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getDashboard() {
        return dashboard;
    }

    public void findAndSend(WebElement element, String value) {

        sendKeysFunction(element, value);
    }

    public void findAndClick(WebElement element) {


        clickFunction(element);
    }
    public void findAndSelect(List<WebElement> list,String Option) {

        UserTypeFunction(list,Option);
    }
    public void verifyFunctions(WebElement element,String verify) {

        verifyContainstext(element,verify);
    }

    public void findandDelete(String deleteName) {

       scrollUpElement(rigtScroll);
        findAndSend(getEducation_Subjct_DeleteName(), deleteName);
        findAndClick(getEducation_Subjct_searchButton());

        //WebDriverWait wait=new WebDriverWait(BaseDriver.getDriver(), 10);
        // wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.xpath("//ms-delete-button//button"),2 ));

        waitList_numberOfElementsToBeLessThan(By.xpath("//ms-delete-button//button"), 5);

        findAndClick(getEducation_Subjct_deleteButton());
        findAndClick(getEducation_Subjct_deleteButton2());


    }

}
