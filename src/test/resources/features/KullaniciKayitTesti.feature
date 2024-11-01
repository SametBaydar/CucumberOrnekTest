Feature: https://automationexercise.com/ sitesinden kullanicinin yeni kayit olusturabilme testi

  Scenario:Kullanici Kayit Testi

    Given Kullanici Automation exercise sayfasina gider
    Then Kullanici SignUp-Login butonuna tiklar
    Then New User Signup! bolumunde name ve email adresi girer
    And SignUp butonuna basar
    Then Kullanici kisisel bilgilerini doldurur
    And Create Account butonuna basar
    Then Hesap olustugunu test eder