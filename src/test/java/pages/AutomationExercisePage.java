package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AutomationExercisePage {

    public AutomationExercisePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[text()='View Product']")
    public List<WebElement> urunElementleriList;
    @FindBy(xpath = "//button[@type='button']")
    public WebElement urunSepetiEkleButonu;

    @FindBy(xpath = "//button[text()='Continue Shopping']")
    public WebElement continueSoppingButonu;

    @FindBy(xpath = "//a[@href='/view_cart']")
    public WebElement cardLinki;

    @FindBy(id = "cart_info")
    public WebElement cardSayfasi;

    @FindBy(xpath = "//a[text()='Proceed To Checkout']")
    public WebElement proceedToCheckoutButonu;

    @FindBy(xpath = "(//a[@href='/login'])[2]")
    public WebElement registerLoginButonu;

    @FindBy(xpath = "//input[@data-qa='signup-name']")
    public WebElement sinupName;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement sinupEmail;

    @FindBy(xpath = "//*[@data-qa='signup-button']")
    public WebElement sinupButton;

    @FindBy(id = "id_gender1")
    public WebElement title;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "days")
    public WebElement day;

    @FindBy(id = "months")
    public WebElement month;

    @FindBy(id = "years")
    public WebElement years;

    @FindBy(id = "first_name")
    public WebElement firstName;

    @FindBy(id = "last_name")
    public WebElement lastName;

    @FindBy(id = "company")
    public WebElement company;

    @FindBy(id = "address1")
    public WebElement ilkAdres;

    @FindBy(id = "address2")
    public WebElement adress2;

    @FindBy(id = "country")
    public WebElement country;

    @FindBy(xpath = "//input[@id='state']")
    public WebElement state;

    @FindBy(xpath = "//input[@id='city']")
    public WebElement city;

    @FindBy(id = "zipcode")
    public WebElement zipCode;

    @FindBy(id = "mobile_number")
    public WebElement telNo;

    @FindBy(xpath = "//button[@data-qa='create-account']")
    public WebElement creatAccountButonu;

    @FindBy(tagName = "h2")
    public WebElement AccountCreatedYazisi;

    @FindBy(xpath = "//div[@class='pull-right']")
    public WebElement continueButonu;


}
