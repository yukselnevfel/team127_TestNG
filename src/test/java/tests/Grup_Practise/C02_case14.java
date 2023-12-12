package tests.Grup_Practise;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AutomationExercisePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class C02_case14 {
    @Test
    public void test14(){

        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("aeUrl"));
        //3. Verify that home page is visible successfully
        String expectedUrl="https://automationexercise.com/";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(actualUrl,expectedUrl,"Homepage sayfasında değilsiniz!");
        //4. Add products to cart
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        AutomationExercisePage automationExercisePage=new AutomationExercisePage();
        automationExercisePage.urunElementleriList.get(1).click();
        automationExercisePage.urunSepetiEkleButonu.click();
        automationExercisePage.continueSoppingButonu.click();
        Driver.getDriver().navigate().back();
        automationExercisePage.urunElementleriList.get(5).click();
        automationExercisePage.urunSepetiEkleButonu.click();
        automationExercisePage.continueSoppingButonu.click();

        //5. Click 'Cart' button
        automationExercisePage.cardLinki.click();

        //6. Verify that cart page is displayed
        softAssert.assertTrue(automationExercisePage.cardSayfasi.isDisplayed(),"Card sayfasi görüntülenemedi!");

        //7. Click Proceed To Checkout
        automationExercisePage.proceedToCheckoutButonu.click();
        //8. Click 'Register / Login' button
        automationExercisePage.registerLoginButonu.click();

        //9. Fill all details in Signup and create account
        automationExercisePage.sinupName.sendKeys(ConfigReader.getProperty("aeSinupName"));
        automationExercisePage.sinupEmail.sendKeys(ConfigReader.getProperty("aeSinupEmail"));
        ReusableMethods.bekle(2);
        automationExercisePage.sinupButton.click();

        automationExercisePage.title.click();
        automationExercisePage.password.sendKeys(ConfigReader.getProperty("aePassword"));

        Select select= new Select(automationExercisePage.day);
        select.selectByIndex(3);
        Select selectmounth = new Select(automationExercisePage.month);
        selectmounth.selectByVisibleText("April");
        Select selectyear= new Select(automationExercisePage.years);
        selectyear.selectByVisibleText("1991");
         Faker faker=new Faker();
         automationExercisePage.firstName.sendKeys(faker.name().firstName());
         automationExercisePage.lastName.sendKeys(faker.name().lastName());
         automationExercisePage.company.sendKeys(faker.artist().name());
         automationExercisePage.ilkAdres.sendKeys(faker.address().fullAddress());
         automationExercisePage.adress2.sendKeys(faker.address().secondaryAddress());
         automationExercisePage.country.sendKeys(faker.address().country());
         automationExercisePage.state.sendKeys(faker.address().state());
         automationExercisePage.city.sendKeys(faker.address().city());
         automationExercisePage.zipCode.sendKeys(faker.address().zipCode());
         automationExercisePage.telNo.sendKeys(faker.address().buildingNumber());
         automationExercisePage.creatAccountButonu.click();

        //10. Verify 'ACCOUNT CREATED!' and click 'Continue' button
        softAssert.assertTrue(automationExercisePage.creatAccountButonu.isDisplayed(),"Creat Account yazisi görünmedi!");
        automationExercisePage.continueButonu.click();

        //11. Verify ' Logged in as username' at top
        //12.Click 'Cart' button
        //13. Click 'Proceed To Checkout' button
        //14. Verify Address Details and Review Your Order
        //15. Enter description in comment text area and click 'Place Order'
        //16. Enter payment details: Name on Card, Card Number, CVC, Expiration date
        //17. Click 'Pay and Confirm Order' button
        //18. Verify success message 'Your order has been placed successfully!'
        //19. Click 'Delete Account' button
        //20. Verify 'ACCOUNT DELETED!' and click 'Continue' button
       softAssert.assertAll();
    }
}
