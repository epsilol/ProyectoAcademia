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
        User_Story_Step_7 Buy_process = new User_Story_Step_7();
        //setting up scenario 1
        Buy_process.ClickSignIn();
        Buy_process.EnterUser();
        Buy_process.EnterPassword();
        Buy_process.SubmitButton();
        Buy_process.clickLogo();
        Buy_process.clickAddCart();
        Thread.sleep(6000);
        Buy_process.clickContinueShopping();


        //testcase 1

        Buy_process.clickShoppingCart();
        Buy_process.clickProceedToCheckoutSummary();
        Buy_process.clickProceedToCheckoutAddress();
        Buy_process.ClickTermsAndConditions();
        Buy_process.clickProceedToCheckoutShipping();
    }

    @Test(testName = "R7.2  “No sign in” and “Cart” button shows quantity of products.")
    public static void Case2() throws InterruptedException {     // cambiar nombre de funcion NO LLAMARSE IGUAL
        //open website
        driver.get(Utils.BASE_URL);
        Home_Page Home_Page = new Home_Page(driver);
        Checkout Checkout = new Checkout(driver);
        Login Login = new Login(driver);
        Shopping_Cart Shopping_Cart = new Shopping_Cart(driver);
        User_Story_Step_7 Buy_process = new User_Story_Step_7();
        //setting up scenario 2


        Buy_process.clickAddCart();
        Thread.sleep(6000);
        Buy_process.clickContinueShopping();
        //assert Shopping_cart_number_of_products != 0;
        Buy_process.assertShoppingCartNumberProducts();
        //testcase 2


        Buy_process.clickShoppingCart();
        Buy_process.clickProceedToCheckoutSummary();
        Buy_process.sendKeysToEmailAddress();
        Buy_process.sendKeysToPassword();
        Buy_process.clickSubmitLogin2();

    }

    @Test(testName = "R7.3  ““Cart” button is (empty) and did not “Sign in” previously.  ")
    public static void Case3() throws InterruptedException {     // cambiar nombre de funcion NO LLAMARSE IGUAL
        //open website
        driver.get(Utils.BASE_URL);
        Home_Page Home_Page = new Home_Page(driver);
        Checkout Checkout = new Checkout(driver);
        Login Login = new Login(driver);
        Shopping_Cart Shopping_Cart = new Shopping_Cart(driver);
        User_Story_Step_7 Buy_process = new User_Story_Step_7();

        //testcase 3
        Buy_process.clickAddCart();
        Thread.sleep(6000);
        Buy_process.clickContinueShopping();
        Buy_process.ClickSignIn();
        Buy_process.EnterUser();
        Buy_process.EnterPassword();
        Buy_process.SubmitButton();
        Buy_process.clickLogo();

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
        User_Story_Step_7 Buy_process = new User_Story_Step_7();
        //setting up scenario 4
        Buy_process.ClickSignIn();
        Buy_process.EnterUser();
        Buy_process.EnterPassword();
        Buy_process.SubmitButton();
        Buy_process.clickLogo();
        Buy_process.clickAddCart();
        Thread.sleep(6000);
        Buy_process.clickContinueShopping();

        //testcase 4

        Buy_process.clickShoppingCart();
        Buy_process.clickProceedToCheckoutSummary();
        Buy_process.clickDropdownAddresses();
        Buy_process.clickDropdownAddressesValue2();
        Thread.sleep(8000); //wait
        Buy_process.clickProceedToCheckoutAddress();
        Buy_process.ClickTermsAndConditions();
        Buy_process.clickProceedToCheckoutShipping();
    }

    @AfterSuite
    public static void cleanUp(){
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
