package Test;


import Pages.Shopping_Cart;
import Steps.User_Story_Step_5;
import Utilerias.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class User_Story_Tests_5 {
    public static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        // ChromeDriver location set up in Utilerias.Utils class
            System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @Test(testName = "R5.1 / view the Shopping cart page with no items in it")
    public static void clickCartButton(){
        driver.get(Utils.BASE_URL);
        Shopping_Cart Home_Page = new Shopping_Cart(driver);
        User_Story_Step_5 cart = new User_Story_Step_5();
        cart.clickButtonCart();
    }

    @Test(testName = "R5.2 / add item to the shopping cart ")
    public static void addItem(WebDriver driver, WebElement element,int timeout,String value) {
        driver.get(Utils.BASE_URL);
        Shopping_Cart shopping_cart = new Shopping_Cart(driver);
        User_Story_Step_5 cart = new User_Story_Step_5();
        cart.addItem();
        cart.verityAlertSuccess();
        cart.closeModalSuccess();
        cart.clickButtonCart();
    }


    @Test(testName = "R5.3 / add items to the shopping cart ")
    public static void AddItems() throws InterruptedException {
        driver.get(Utils.BASE_URL);
        Shopping_Cart shopping_cart = new Shopping_Cart(driver);
        User_Story_Step_5 cart = new User_Story_Step_5();

        cart.DetailsItem2();
        cart.ButtonCardItems();
        cart.verityAlertSuccess();
        cart.closeModalSuccess();
        cart.clickLogo();
        cart.DetailsItem3();
        cart.ButtonCardItems();
        cart.verityAlertSuccess();
        cart.closeModalSuccess();
        cart.clickButtonCart();
        cart.clickLogo();
    }

    @Test(testName = "R5.5 / Deleting items from the shopping cart")
    public static void DeleteItems() throws InterruptedException {
        driver.get(Utils.BASE_URL);
        Shopping_Cart shopping_cart = new Shopping_Cart(driver);
        User_Story_Step_5 cart = new User_Story_Step_5();

        cart.addItem();
        cart.verityAlertSuccess();
        cart.closeModalSuccess();
        cart.clickButtonCart();
        cart.buttonDelete();
        cart.clickLogo();
        clickCartButton();

    }


    @Test(testName = " quantitys to item")
    public static void Quantitys() throws InterruptedException {
        driver.get(Utils.BASE_URL);
        Shopping_Cart shopping_cart = new Shopping_Cart(driver);
        User_Story_Step_5 cart = new User_Story_Step_5();
        cart.addItem();
        cart.verityAlertSuccess();
        cart.closeModalSuccess();
        cart.clickButtonCart();
        cart.addQuantity();

        cart.downQuantity();

    }



    @AfterSuite
    public static void cleanUp(){
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
