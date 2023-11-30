package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Cekici_Portal_Sayfasi;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Cekici_Portal_StepDef {

    ReusableMethods reusableMethods= new ReusableMethods();
    Cekici_Portal_Sayfasi cekici_portal_sayfasi= new Cekici_Portal_Sayfasi();

    @When("kullanici siteye gider")
    public void kullanici_siteye_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("remedtestportal_url"));
    }
    @Given("Kullanici email ve sifre girer")
    public void kullanici_email_ve_sifre_girer() {
        cekici_portal_sayfasi.email.sendKeys(ConfigReader.getProperty("remedtestportalemail"));
        cekici_portal_sayfasi.password.sendKeys(ConfigReader.getProperty("remedtestportalpassword"));
    }
    @Then("Kullanici giris yap butonuna tiklar")
    public void kullanici_giris_yap_butonuna_tiklar() {
        cekici_portal_sayfasi.girisYapButonu.click();
    }
    @When("Kullanici onay bekleyenler linkine tiklar")
    public void kullanici_onay_bekleyenler_linkine_tiklar() {
        cekici_portal_sayfasi.onayBekleyenler.click();
    }
    @Then("Kullanici cekici dosyalarini goruntuledigini dogrular")
    public void kullanici_cekici_dosyalarini_goruntuledigini_dogrular() {
        Assert.assertTrue(cekici_portal_sayfasi.cekiciText.isDisplayed());
    }



}
