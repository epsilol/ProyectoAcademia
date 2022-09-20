package Test;

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


    @Test(testName = "R7.1  “Cart” button has products and signed in successfully.") // poner aqui de que se trata caso de prueba
    public static void userLogin(){     // cambiar nombre de funcion NO LLAMARSE IGUAL
        driver.get(Utils.BASE_URL);
        Home_Page Home_Page = new Home_Page(driver);
        Login Login = new Login(driver);
        Shopping_Cart Shopping_Cart = new Shopping_Cart(driver);
        User_Story_Step_7 LogUser = new User_Story_Step_7();
        LogUser.ClickSignIn();
        LogUser.EnterUser();
        LogUser.EnterPassword();
        LogUser.SubmitButton();
        LogUser.clickLogo();
        LogUser.clickAddCart();
    }

    @AfterSuite
    public static void cleanUp(){
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
