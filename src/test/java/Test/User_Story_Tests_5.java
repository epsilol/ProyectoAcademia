package Test;


import Pages.Shopping_Cart;
import Steps.User_Story_Step_5;
import Utilerias.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
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

    @Test(testName = "Click in the cart button") // poner aqui de que se trata caso de prueba
    public static void clickCartButton(){     //submit form cambiar nombre de funcion NO LLAMARSE IGUAL
        driver.get(Utils.BASE_URL);
        Shopping_Cart Home_Page = new Shopping_Cart(driver);
        User_Story_Step_5 cart = new User_Story_Step_5();
        cart.clickButtonCart();
    }

    @Test(testName = "add an item to the cart")
    public static void addItem(){
        driver.get(Utils.BASE_URL);
        Shopping_Cart Home_Page = new Shopping_Cart(driver);
        User_Story_Step_5 cart = new User_Story_Step_5();
        cart.addItem();
       // cart.verityAlertSuccess();
    }




    @AfterSuite
    public static void cleanUp(){
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
