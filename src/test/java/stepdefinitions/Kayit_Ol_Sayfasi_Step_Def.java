package stepdefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.Avita_Kayit_Olma_Sayfasi;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.security.Key;

public class Kayit_Ol_Sayfasi_Step_Def {

    Avita_Kayit_Olma_Sayfasi avita_kayit_olma_sayfasi= new Avita_Kayit_Olma_Sayfasi();
    ReusableMethods reusableMethods= new ReusableMethods();
    Actions actions = new Actions(Driver.getDriver());

    @When("Kullanici {string} alanina basarili bir sekilde ad ve soyad girer")
    public void kullanici_alanina_basarili_bir_sekilde_ad_ve_soyad_girer(String string) {

        avita_kayit_olma_sayfasi.kayitOl.click();
        reusableMethods.waitFor(3);
        avita_kayit_olma_sayfasi.asSoyadAlani.sendKeys(ConfigReader.getProperty("ad_soyad"));
        reusableMethods.waitFor(3);

    }
    @Then("Kullanici {string} alanini bos birakir ve uyarı mesaji goruntuler")
    public void kullanici_alanini_bos_birakir_ve_uyarı_mesaji_goruntuler(String string) {

        avita_kayit_olma_sayfasi.asSoyadAlani.clear();
        //yukarda isim soyad yazdığımız ad soyad alanını temizliyoruz

        reusableMethods.waitFor(3);

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        //sayfanın alt kısmına ulaşmak için actions classından pageDown ile sayfayı asağı kaydırıyoruz

        reusableMethods.waitFor(3);
        avita_kayit_olma_sayfasi.kayitOlButonAlt.click();
        //ad soyad alanı boşken sayfanın alt kısmında yer alan kayıt butonuna click yapıyoruz

        reusableMethods.waitFor(3);
        actions.sendKeys(Keys.PAGE_UP).perform();
        reusableMethods.waitFor(3);
        Assert.assertTrue(avita_kayit_olma_sayfasi.uyariMesaji.isDisplayed());
        //hata mesajının varlığını doğruluyoruz

        reusableMethods.waitFor(3);
    }
    @Then("Kullanicinin {string} alanina {int} karakterli sadece ad girmesine ragmen hata almadigi ve onay isareti goruntuledigi dogrulanir")
    public void kullanicinin_alanina_karakterli_sadece_ad_girmesine_ragmen_hata_almadigi_ve_onay_isareti_goruntuledigi_dogrulanir(String string, Integer int1) {
        avita_kayit_olma_sayfasi.asSoyadAlani.sendKeys(ConfigReader.getProperty("6_karakterli_ad"));

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        //sayfayı asagı indirdik

        reusableMethods.waitFor(3);
        avita_kayit_olma_sayfasi.kayitOlButonAlt.click();
        reusableMethods.waitFor(3);

        actions.sendKeys(Keys.PAGE_UP).perform();
        //sayfayı yukarı cıkardık(ad soyad alanına ulaşmak için)

        reusableMethods.waitFor(3);

        Assert.assertTrue(avita_kayit_olma_sayfasi.validAdOnay.isDisplayed());
        //hata mesajı alınamadığını yani sadece isim girmenin sistem tarafından onaylandıgını dogrularız

        reusableMethods.waitFor(3);
    }

    @Then("Kullanici {string} alanina {int} karakter girer, {int} karakterden az oldugu icin giris yapamaz ve uyari mesaji goruntuler")
    public void kullanici_alanina_karakter_girer_karakterden_az_oldugu_icin_giris_yapamaz_ve_uyari_mesaji_goruntuler(String string, Integer int1, Integer int2) {
        avita_kayit_olma_sayfasi.asSoyadAlani.clear();
        //ad_soyad alanı temizlendi

        reusableMethods.waitFor(3);
        avita_kayit_olma_sayfasi.asSoyadAlani.sendKeys(ConfigReader.getProperty("5_karakterli_ad"));
        reusableMethods.waitFor(3);

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        //sayfayı asagı indirdik

        reusableMethods.waitFor(3);
        avita_kayit_olma_sayfasi.kayitOlButonAlt.click();
        reusableMethods.waitFor(3);

        actions.sendKeys(Keys.PAGE_UP).perform();
        //sayfayı yukarı cıkardık(ad soyad alanına ulaşmak için)

        reusableMethods.waitFor(3);

        Assert.assertTrue(avita_kayit_olma_sayfasi.uyariMesaji.isDisplayed());
        //hata mesajının varlığını doğruluyoruz

        reusableMethods.waitFor(3);

    }
    @Then("Kullanici {string} alanina {int} adet ozel karakter girerek giris yapmaya calisirken uyari mesaji alamamasini dogrular")
    public void kullanici_alanina_adet_ozel_karakter_girerek_giris_yapmaya_calisirken_uyari_mesaji_alamamasini_dogrular(String string, Integer int1) {
        avita_kayit_olma_sayfasi.asSoyadAlani.clear();
        //ad_soyad alanı temizlendi

        reusableMethods.waitFor(3);
        avita_kayit_olma_sayfasi.asSoyadAlani.sendKeys("------");
        reusableMethods.waitFor(3);

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        //sayfayı asagı indirdik

        reusableMethods.waitFor(3);
        avita_kayit_olma_sayfasi.kayitOlButonAlt.click();
        reusableMethods.waitFor(3);

        actions.sendKeys(Keys.PAGE_UP).perform();
        //sayfayı yukarı cıkardık(ad soyad alanına ulaşmak için)

        reusableMethods.waitFor(3);
        Assert.assertTrue(avita_kayit_olma_sayfasi.validAdOnay.isDisplayed());
        //hata mesajı alınamadığını yani özel simgeyle isim girmenin sistem tarafından onaylandıgını dogrularız

        reusableMethods.waitFor(3);

    }
    @Then("Kullanici {string} alanına {int} adet numerik karakter girerek giris yapmaya calisirken uyari mesaji alamamasini dogrular")
    public void kullanici_alanına_adet_numerik_karakter_girerek_giris_yapmaya_calisirken_uyari_mesaji_alamamasini_dogrular(String string, Integer int1) {
        avita_kayit_olma_sayfasi.asSoyadAlani.clear();
        //ad_soyad alanı temizlendi

        reusableMethods.waitFor(3);
        avita_kayit_olma_sayfasi.asSoyadAlani.sendKeys("123456");
        reusableMethods.waitFor(3);

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        //sayfayı asagı indirdik

        reusableMethods.waitFor(3);

        avita_kayit_olma_sayfasi.kayitOlButonAlt.click();
        reusableMethods.waitFor(3);

        actions.sendKeys(Keys.PAGE_UP).perform();
        //sayfayı yukarı cıkardık(ad soyad alanına ulaşmak için)

        reusableMethods.waitFor(3);
        Assert.assertTrue(avita_kayit_olma_sayfasi.validAdOnay.isDisplayed());
        //hata mesajı alınamadığını yani numeric karakterle isim girmenin sistem tarafından onaylandıgını dogrularız
    }
}
