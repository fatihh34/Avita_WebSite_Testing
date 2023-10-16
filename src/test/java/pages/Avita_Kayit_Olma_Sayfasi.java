package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Avita_Kayit_Olma_Sayfasi {
    public Avita_Kayit_Olma_Sayfasi(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[text()='Kayıt Ol']")
    public WebElement kayitOl;

    @FindBy(xpath = "//*[@class='mb-3 text-center font-weight-normal']")
    public WebElement kayitOlText;

    @FindBy(xpath = "//*[@id='name']")
    public WebElement asSoyadAlani;

    @FindBy(xpath = "//*[@id='email']")
    public WebElement ePostaAlani;

    @FindBy(xpath = "//*[text()='Cep Telefonunuz']")
    public WebElement cepTelefonAlani;

    @FindBy(xpath = "(//*[text()='Lütfen bu alanı doldurun.'])[1]")
    public WebElement uyariMesaji;

    @FindBy(xpath = "//*[@class='btn btn-primary px-3']")
    public WebElement kayitOlButonAlt;

    @FindBy(xpath = "//*[@class='form-control rounded-right is-valid']")
    public WebElement validAdOnay;















}
