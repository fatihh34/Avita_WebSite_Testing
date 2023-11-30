@cekici_portal
  Feature: Remedportal Cekici Sayfası


    Background: Login olma
      When kullanici siteye gider
      Given Kullanici email ve sifre girer
      Then Kullanici giris yap butonuna tiklar

    Scenario:

      When Kullanici onay bekleyenler linkine tiklar
      Then Kullanici cekici dosyalarini goruntuledigini dogrular


