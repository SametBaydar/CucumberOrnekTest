Feature: Kullanici test otomasyonu sayfasına giriş testi

  Scenario: Kullanici test otomasyonu sayfasına kayıtlı mail ve şifre ile girebilmeli

    Given Kullanici test otomasyonu anasayfaya gider
    Then Account linkine tiklar
    Then Mail adresini girer
    Then Sifresini girer
    Then SignIn butonuna tiklar
    And Giris yapabildigini test eder
    And 2 saniye bekle
    And Sayfayi Kapatir

