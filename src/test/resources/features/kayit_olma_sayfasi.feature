@kayit_olma_sayfasi
  Feature: Kayıt Olma Sayfasi Gorunurluk Testi

    Scenario:Pozitif_Negatif_Testler

      Given Kullanıcı belirtilen sayfanın URL'ine gider
      When Kullanici "Kayit Ol" butonunu goruntuleyebilmelidir
      Then Kullanici "Kayit Ol" sayfasini goruntuleyebilmeli
      Then Kullanici 'Adiniz Soyadiniz','E-Posta Adresiniz','Cep Telefonunuz' alanlarini goruntuleyebimeli
      Then Kullanici 'Kayıt Ol' butonunu goruntuleyebilmeli
