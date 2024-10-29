package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import pages.TestOtomasyonuPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TestotomasyonuStepdefinitions {

    TestOtomasyonuPage testOtomasyonuPage = new TestOtomasyonuPage();
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();

    @Given("Kullanici test otomasyonu anasayfaya gider")
    public void kullanici_test_otomasyonu_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("toURL"));

    }
    @Then("Arama kutusuna {string} yazar")
    public void arama_kutusuna_phone_yazar(String aranacakKelime) {
        testOtomasyonuPage.aramaKutusu.sendKeys(aranacakKelime+ Keys.ENTER);

    }
    @Then("Urun bulundugunu test et")
    public void urunBulundugunuTestEt() {
      String expected = testOtomasyonuPage.aramaSonucuBulunanYazi.getText();
      String actual = ConfigReader.getProperty("aramaSonucYazi");
        Assertions.assertNotEquals(expected,actual);

    }
    @Then("Sayfayi Kapatir")
    public void sayfayi_kapatir() {
        Driver.quitDriver();

    }


    @Then("{int} saniye bekle")
    public void saniyeBekle(int saniye) {
        ReusableMethods.bekle(saniye);
    }

    @Then("Account linkine tiklar")
    public void accountLinkineTiklar() {
        testOtomasyonuPage.accountLink.click();
    }

    @Then("Mail adresini girer")
    public void mailAdresiniGirer() {
        testOtomasyonuPage.customerLoginEmail.sendKeys(ConfigReader.getProperty("toEmailGiris"));

    }

    @Then("Sifresini girer")
    public void sifresiniGirer() {
        testOtomasyonuPage.customerLoginPassword.sendKeys(ConfigReader.getProperty("toPasswordGiris"));
        jse.executeScript("arguments[0].scrollIntoView();",testOtomasyonuPage.customerLoginSignInButton);

    }

    @Then("SignIn butonuna tiklar")
    public void signinButonunaTiklar() {

        testOtomasyonuPage.customerLoginSignInButton.click();
    }

    @And("Giris yapabildigini test eder")
    public void girisYapabildiginiTestEder() {
    Assertions.assertTrue(testOtomasyonuPage.customerLogoutLink.isDisplayed());
    // Kullanıcı giriş yapabilmiş ise logout butonu görünür. Dolayısıyla
        // kullanıcı giriş yapabilmiş demektir.
    }
}
