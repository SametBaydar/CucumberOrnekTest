package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TestOtomasyonuPage {
    public TestOtomasyonuPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="global-search")
    public WebElement aramaKutusu;

    @FindBy(className = "product-count-text")
    public WebElement aramaSonucuBulunanYazi;

    @FindBy(className = "e-cart")
    public WebElement accountLink;

    @FindBy(id = "email")
    public WebElement customerLoginEmail;

    @FindBy(id="password")
    public  WebElement  customerLoginPassword;

    @FindBy(id="submitlogin")
    public  WebElement customerLoginSignInButton;

    @FindBy(xpath = "//span[text()='Logout']")
    public WebElement customerLogoutLink;
}
