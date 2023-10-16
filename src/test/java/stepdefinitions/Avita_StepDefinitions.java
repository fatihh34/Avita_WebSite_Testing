package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.Avita_Kayit_Olma_Sayfasi;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Avita_StepDefinitions {

    Avita_Kayit_Olma_Sayfasi avita_kayit_olma_sayfasi= new Avita_Kayit_Olma_Sayfasi();
    ReusableMethods reusableMethods= new ReusableMethods();

    @Given("Kullanıcı belirtilen sayfanın URL'ine gider")
    public void kullanıcı_belirtilen_sayfanın_url_ine_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("avita_url"));
    }
    @When("Kullanici {string} butonunu goruntuleyebilmelidir")
    public void kullanici_butonunu_goruntuleyebilmelidir(String string) {
        Assert.assertTrue(avita_kayit_olma_sayfasi.kayitOlButonAlt.isDisplayed());

    }
    @Then("Kullanici {string} sayfasini goruntuleyebilmeli")
    public void kullanici_sayfasini_goruntuleyebilmeli(String string) {
        avita_kayit_olma_sayfasi.kayitOlText.click();
        reusableMethods.waitFor(3);
        Assert.assertTrue(avita_kayit_olma_sayfasi.kayitOlText.isDisplayed());

    }
    @Then("Kullanici {string},{string},{string} alanlarini goruntuleyebimeli")
    public void kullanici_alanlarini_goruntuleyebimeli(String string, String string2, String string3) {
        Assert.assertTrue(avita_kayit_olma_sayfasi.asSoyadAlani.isDisplayed());
        reusableMethods.waitFor(2);
        Assert.assertTrue(avita_kayit_olma_sayfasi.ePostaAlani.isDisplayed());
        reusableMethods.waitFor(2);
        Assert.assertTrue(avita_kayit_olma_sayfasi.cepTelefonAlani.isDisplayed());
    }

    @Then("Kullanici {string} butonunu goruntuleyebilmeli")
    public void kullanici_butonunu_goruntuleyebilmeli(String string) {
        Actions actions= new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Assert.assertTrue(avita_kayit_olma_sayfasi.kayitOlButonAlt.isDisplayed());
    }

}
