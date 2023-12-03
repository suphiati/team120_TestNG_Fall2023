package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QaSmartCardLinkPage {

    public QaSmartCardLinkPage(){

        PageFactory.initElements(Driver.getDriver(),this);


    }
    @FindBy(linkText = "Sign In")
    public WebElement signIn;

    @FindBy(name = "email")
    public WebElement email;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement login;

    @FindBy(linkText = "Create an Account")
    public WebElement newAccount;

    @FindBy(linkText = "Home")
    public WebElement headerHome;

    @FindBy(linkText = "Features")
    public WebElement headerFeatures;

    @FindBy(linkText = "About")
    public WebElement headerAbout;

    @FindBy(linkText = "Pricing")
    public WebElement headerPricing;

    @FindBy(linkText = "Contact")
    public WebElement headerContact;

    @FindBy(xpath = "//*[.='Stripe']")
    public WebElement stripeYazisi;

    @FindBy(xpath = "//input[@id='stripeEnable']")
    public WebElement stripeEnableButonu;

    @FindBy(xpath = "//label[@for='stripe_key']")
    public WebElement stripeKeyYazisi;

    @FindBy(xpath = "//input[@id='stripeKey']")
    public WebElement sripeKeyBox;

    @FindBy(xpath = "//label[@for='stripe_secret']")
    public WebElement stripeSecretYazisi;

    @FindBy(xpath = "//input[@id='stripeSecret']")
    public WebElement stripeSecretBox;


    @FindBy(xpath = "//*[.='Paypal']")
    public WebElement paypalYazisi;

    @FindBy(xpath = "//input[@id='paypalEnable']")
    public WebElement paypalEnableButonu;

    @FindBy(xpath = "//label[@for='paypal_client_id']")
    public WebElement paypalClientIdYazisi;

    @FindBy(xpath = "//input[@id='paypalKey']")
    public WebElement paypalClientIdBox;

    @FindBy(xpath = "//label[@for='paypal_secret']")
    public WebElement paypalSecretYazisi;

    @FindBy(xpath = "//input[@id='paypalSecret']")
    public WebElement paypalSecretBox;

    @FindBy(xpath = "//label[@for='paypal_mode']")
    public WebElement paypalModeYazisi;

    @FindBy(xpath = "//input[@id='paypalMode']")
    public WebElement paypalModeBox;

    @FindBy(xpath = "//label[@for='currency']")
    public WebElement currencyYazisi;

    @FindBy(xpath = "//span[@title='Select Currency']")
    public WebElement selectCurrency;

    @FindBy(xpath = "//span[@title='€ - EUR Euro']")
    public WebElement currencySecimi;










}
/*

                 //7- first name, last name, email gir
                 driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Suphi Atılım");
                 driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Çeliköz");
                 driver.findElement(By.xpath("//input[@name='email']")).sendKeys("atilim_88@hotmail.com");

                 //8- password
                 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456Suphi.");
                 driver.findElement(By.xpath("//input[@name='password_confirmation']")).sendKeys("123456Suphi.");


      ********* zaten bir hesap varsa buraya tıklar***

        driver.findElement(By.linkText("Sign in here")).click();

                 //9-Koşul kabul
                 driver.findElement(By.xpath("//input[@type='checkbox']")).click();

                 //10-giris yap
                 driver.findElement(By.xpath("//button[@type='submit']")).click();
                 */