package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationExercisePage {
    public AutomationExercisePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[text()=' Signup / Login']")
    public WebElement SignupLink;

    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement SignupName;

    @FindBy(xpath = "//*[text()='Signup']")
    public WebElement SignupButton;

    @FindBy(xpath = "//*[@id='id_gender1']")
    public WebElement SignupRadioButtonMr;

    @FindBy(id = "password")
    public WebElement SignupPassword;

    @FindBy(id = "first_name")
    public WebElement SingupFirstName;

    @FindBy(xpath = "//*[text()='Create Account']")
    public WebElement SingupCreateAccountButton;

  @FindBy(xpath = "//b[text()='Account Created!']")
    public WebElement AccountCreated;

}
