Feature: Urun Arama Testi

  Scenario Outline: Kullanici arama kutusunda phone aratacak

    Given Kullanici test otomasyonu anasayfaya gider
    Then Arama kutusuna "<urunler>" yazar
    Then Urun bulundugunu test et
    Then 1 saniye bekle
    And Sayfayi Kapatir


      Examples:
      |urunler|
      |samsung|
      |phone  |

