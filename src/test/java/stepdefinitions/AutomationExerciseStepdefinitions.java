package stepdefinitions;
import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import pages.AutomationExercisePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class AutomationExerciseStepdefinitions {

       AutomationExercisePage automationExercisePage = new AutomationExercisePage();
        Faker faker = new Faker();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();



    @Given("Kullanici Automation exercise sayfasina gider")
    public void kullanici_automation_exercise_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("AutoExeURL"));

    }
    @Then("Kullanici SignUp-Login butonuna tiklar")
    public void kullaniciSignUpLoginButonunaTiklar() {
             automationExercisePage.SignupLink.click();
    }


    @Then("New User Signup! bolumunde name ve email adresi girer")
    public void new_user_signup_bolumunde_name_ve_email_adresi_girer() {
           automationExercisePage.SignupName.sendKeys(faker.name().firstName()
             + Keys.TAB
             + faker.internet().emailAddress());


    }
    @Then("SignUp butonuna basar")
    public void sign_up_butonuna_basar() {
          automationExercisePage.SignupButton.click();


    }
    @Then("Kullanici kisisel bilgilerini doldurur")
    public void kullanici_kisisel_bilgilerini_doldurur() {
        automationExercisePage.SignupRadioButtonMr.click();
        jse.executeScript("arguments[0].scrollIntoView();",automationExercisePage.SignupPassword);
        automationExercisePage.SignupPassword.sendKeys(faker.internet().password());
        jse.executeScript("arguments[0].scrollIntoView();",automationExercisePage.SingupFirstName);
          automationExercisePage.SingupFirstName.sendKeys(faker.name().firstName()
                          +Keys.TAB
                         +faker.name().lastName()
                         +Keys.TAB
                         +Keys.TAB
                         +faker.address()
                     +Keys.TAB
                     +Keys.TAB
                     +Keys.TAB
                       +faker.address().state()
                      +Keys.TAB
                      +faker.address().city()
                     +Keys.TAB
             +faker.address().zipCode()
               +Keys.TAB
               +faker.phoneNumber());
          jse.executeScript("arguments[0].scrollIntoView();",automationExercisePage.SingupCreateAccountButton);



    }
    @Then("Create Account butonuna basar")
    public void create_account_butonuna_basar() {
          automationExercisePage.SingupCreateAccountButton.click();


    }
    @Then("Hesap olustugunu test eder")
    public void hesap_olustugunu_test_eder() {
        String expectedYazi = ConfigReader.getProperty("AutoExeExpectedCreatedYazi").toLowerCase();
        String actualYazi = automationExercisePage.AccountCreated.getText().toLowerCase();
        Assertions.assertEquals(expectedYazi,actualYazi);

    }
}
