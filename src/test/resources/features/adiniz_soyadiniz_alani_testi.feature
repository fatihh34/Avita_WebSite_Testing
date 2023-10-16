@adiniz_soyadiniz_alani
  Feature:Adınız Soyadınız Alanı Testi

    Scenario:Pozitif_Negatif_Testler

      Given Kullanıcı belirtilen sayfanın URL'ine gider
      When Kullanici 'Adiniz Soyadiniz' alanina basarili bir sekilde ad ve soyad girer
      Then Kullanici 'Adiniz Soyadiniz' alanini bos birakir ve uyarı mesaji goruntuler
      Then Kullanicinin 'Adiniz Soyadiniz' alanina 6 karakterli sadece ad girmesine ragmen hata almadigi ve onay isareti goruntuledigi dogrulanir
      Then Kullanici 'Adınız Soyadınız' alanina 5 karakter girer, 6 karakterden az oldugu icin giris yapamaz ve uyari mesaji goruntuler
      Then Kullanici 'Adınız Soyadınız' alanina 6 adet ozel karakter girerek giris yapmaya calisirken uyari mesaji alamamasini dogrular
      Then Kullanici 'Adınız Soyadınız' alanına 6 adet numerik karakter girerek giris yapmaya calisirken uyari mesaji alamamasini dogrular
