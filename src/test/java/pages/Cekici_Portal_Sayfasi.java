package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Cekici_Portal_Sayfasi {
    public Cekici_Portal_Sayfasi(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "(//*[text()=' Onay Bekleyenler'])[2]")
    public WebElement onayBekleyenler;

    @FindBy (xpath = "(//*[text()='Çekici'])[1]")
    public WebElement cekiciText;

    @FindBy (name = "username")
    public WebElement email;

    @FindBy (name = "password")
    public WebElement password;

    @FindBy (xpath = "//*[text()='Giriş Yap']")
    public WebElement girisYapButonu;
}
