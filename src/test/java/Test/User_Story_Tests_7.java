package Test;


import Pages.Checkout;
import Pages.Login;
import Pages.Home_Page;
import Pages.Shopping_Cart;
import Steps.User_Story_Step_7;
import Utilerias.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class User_Story_Tests_7 {
    public static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        // ChromeDriver location set up in Utilerias.Utils class
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }


    @Test(testName = "R7.1  “Cart” button has products and signed in successfully.")
    // poner aqui de que se trata caso de prueba
    public static void Case1() throws InterruptedException {     // cambiar nombre de funcion NO LLAMARSE IGUAL
        //open website
        driver.get(Utils.BASE_URL);
        Home_Page Home_Page = new Home_Page(driver);
        Checkout Checkout = new Checkout(driver);
        Login Login = new Login(driver);
        Shopping_Cart Shopping_Cart = new Shopping_Cart(driver);
        User_Story_Step_7 LogUser = new User_Story_Step_7();
        //setting up scenario 1
        LogUser.ClickSignIn();
        LogUser.EnterUser();
        LogUser.EnterPassword();
        LogUser.SubmitButton();
        LogUser.clickLogo();
        LogUser.clickAddCart();
        Thread.sleep(6000);

        //testcase 1
        LogUser.clickContinueShopping();
        LogUser.clickShoppingCart();
        LogUser.clickProceedToCheckoutSummary();
        LogUser.clickProceedToCheckoutAddress();
        LogUser.ClickTermsAndConditions();
        LogUser.clickProceedToCheckoutShipping();
    }

    @Test(testName = "R7.2  “No sign in” and “Cart” button shows quantity of products.")
    public static void Case2() throws InterruptedException {     // cambiar nombre de funcion NO LLAMARSE IGUAL
        //open website
        driver.get(Utils.BASE_URL);
        Home_Page Home_Page = new Home_Page(driver);
        Checkout Checkout = new Checkout(driver);
        Login Login = new Login(driver);
        Shopping_Cart Shopping_Cart = new Shopping_Cart(driver);
        User_Story_Step_7 LogUser = new User_Story_Step_7();
        //setting up scenario 2


        LogUser.clickAddCart();
        Thread.sleep(6000);
        LogUser.clickContinueShopping();
        //assert Shopping_cart_number_of_products != 0;
        LogUser.assertShoppingCartNumberProducts();
        //testcase 2


        LogUser.clickShoppingCart();
        LogUser.clickProceedToCheckoutSummary();
        LogUser.sendKeysToEmailAddress();
        LogUser.sendKeysToPassword();
        LogUser.clickSubmitLogin2();

    }

    @Test(testName = "R7.3  ““Cart” button is (empty) and did not “Sign in” previously.  ")
    public static void Case3() throws InterruptedException {     // cambiar nombre de funcion NO LLAMARSE IGUAL
        //open website
        driver.get(Utils.BASE_URL);
        Home_Page Home_Page = new Home_Page(driver);
        Checkout Checkout = new Checkout(driver);
        Login Login = new Login(driver);
        Shopping_Cart Shopping_Cart = new Shopping_Cart(driver);
        User_Story_Step_7 LogUser = new User_Story_Step_7();

        //testcase 3
        LogUser.clickAddCart();
        Thread.sleep(6000);
        LogUser.clickContinueShopping();
        LogUser.ClickSignIn();
        LogUser.EnterUser();
        LogUser.EnterPassword();
        LogUser.SubmitButton();
        LogUser.clickLogo();

    }


    @Test(testName = "R7.4  Different delivery to billing address. ")
    // poner aqui de que se trata caso de prueba
    public static void Case4() throws InterruptedException {     // cambiar nombre de funcion NO LLAMARSE IGUAL
        //open website
        driver.get(Utils.BASE_URL);
        Home_Page Home_Page = new Home_Page(driver);
        Checkout Checkout = new Checkout(driver);
        Login Login = new Login(driver);
        Shopping_Cart Shopping_Cart = new Shopping_Cart(driver);
        User_Story_Step_7 LogUser = new User_Story_Step_7();
        //setting up scenario 4
        LogUser.ClickSignIn();
        LogUser.EnterUser();
        LogUser.EnterPassword();
        LogUser.SubmitButton();
        LogUser.clickLogo();
        LogUser.clickAddCart();
        Thread.sleep(6000);
        LogUser.clickContinueShopping();

        //testcase 4

        LogUser.clickShoppingCart();
        LogUser.clickProceedToCheckoutSummary();
        LogUser.clickDropdownAddresses();
        LogUser.clickDropdownAddressesValue2();
        Thread.sleep(8000); //wait
        LogUser.clickProceedToCheckoutAddress();
        LogUser.ClickTermsAndConditions();
        LogUser.clickProceedToCheckoutShipping();
    }

    @AfterSuite
    public static void cleanUp(){
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
