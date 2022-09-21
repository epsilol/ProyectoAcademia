package Test;


import Pages.Shopping_Cart;
import Steps.User_Story_Step_5;
import Utilerias.Utils;
import org.openqa.selenium.WebDriver;
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
    public static void addItem() throws InterruptedException {
        driver.get(Utils.BASE_URL);
        Shopping_Cart shopping_cart = new Shopping_Cart(driver);
        User_Story_Step_5 cart = new User_Story_Step_5();
        cart.addItem();
        Thread.sleep(3000);
        cart.verityAlertSuccess();
        Thread.sleep(3000);
        cart.closeModalSuccess();
        Thread.sleep(3000);
        cart.clickButtonCart();
        Thread.sleep(3000);
    }


    @Test(testName = "R5.3 / add items to the shopping cart ")
    public static void AddItems() throws InterruptedException {
        driver.get(Utils.BASE_URL);
        Shopping_Cart shopping_cart = new Shopping_Cart(driver);
        User_Story_Step_5 cart = new User_Story_Step_5();

        cart.DetailsItem2();
        cart.ButtonCardItems();
        Thread.sleep(300);
        cart.verityAlertSuccess();
        Thread.sleep(600);
        cart.closeModalSuccess();
        Thread.sleep(300);
        cart.clickLogo();
        Thread.sleep(300);
        cart.DetailsItem3();
        Thread.sleep(300);
        cart.ButtonCardItems();
        Thread.sleep(300);
        cart.verityAlertSuccess();
        Thread.sleep(300);
        cart.closeModalSuccess();
        Thread.sleep(300);
        cart.clickButtonCart();
        Thread.sleep(300);
        cart.clickLogo();
        Thread.sleep(300);
    }

    @Test(testName = "R5.5 / Deleting items from the shopping cart")
    public static void DeleteItems() throws InterruptedException {
        driver.get(Utils.BASE_URL);
        Shopping_Cart shopping_cart = new Shopping_Cart(driver);
        User_Story_Step_5 cart = new User_Story_Step_5();

        cart.addItem();
        Thread.sleep(500);
        cart.verityAlertSuccess();
        Thread.sleep(500);
        cart.closeModalSuccess();
        Thread.sleep(600);
        cart.clickButtonCart();
        Thread.sleep(3000);
        cart.buttonDelete();
        Thread.sleep(3000);
        cart.clickLogo();
        Thread.sleep(300);
        clickCartButton();
        Thread.sleep(300);

    }


    @Test(testName = " quantitys to item")
    public static void Quantitys() throws InterruptedException {
        driver.get(Utils.BASE_URL);
        Shopping_Cart shopping_cart = new Shopping_Cart(driver);
        User_Story_Step_5 cart = new User_Story_Step_5();
        Thread.sleep(3000);
        cart.addItem();
        Thread.sleep(4000);
        cart.verityAlertSuccess();
        Thread.sleep(4000);
        cart.closeModalSuccess();
        Thread.sleep(6000);
        cart.clickButtonCart();
        Thread.sleep(9000);
        cart.addQuantity();
        Thread.sleep(3000);
        cart.downQuantity();

    }



    @AfterSuite
    public static void cleanUp(){
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
