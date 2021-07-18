package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver_Internship;

public class Left_Nav_Internship extends Parent {

    public  Left_Nav_Internship() {
        PageFactory.initElements(BaseDriver_Internship.getDriver(), this);
    }

    @FindBy(xpath = "//span[text()='Education']")
    private WebElement Educations_Button;


    @FindBy(xpath = "(//span[text()='Setup'])[5]")
    private  WebElement Education_Setup_Button;

    @FindBy(xpath = " //span[text()='Subjects']")
    private  WebElement Education_Subject_Button;


    public WebElement getEducation_Setup_Button() {
        return Education_Setup_Button;
    }

    public WebElement getEducation_Subject_Button() {
        return Education_Subject_Button;
    }

    public WebElement getEducations_Button() {
        return Educations_Button;
    }

    public void findAndSend(WebElement element, String value)
    {

        sendKeysFunction(element,value);
    }
    public void findAndClick(WebElement element)
    {

        clickFunction(element);
    }


}
