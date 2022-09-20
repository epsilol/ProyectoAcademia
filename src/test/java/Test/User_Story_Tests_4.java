package Test;

import Pages.Home_Page;
import Pages.Login;
import Pages.My_Account;
import Steps.User_Story_Step_4;
import Utilerias.Accounts;
import Utilerias.Utils;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static Test.User_Story_Tests_7.driver;

public class User_Story_Tests_4 {
    public static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        // ChromeDriver location set up in Utilerias.Utils class
            System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @Test(testName = "R4.1 Access to my account") // poner aqui de que se trata caso de prueba
    public static void userLogin(){     //submit form cambiar nombre de funcion NO LLAMARSE IGUAL
        driver.get(Utils.BASE_URL);
        Home_Page Home_Page = new Home_Page(driver);
        Login Login = new Login(driver);
        User_Story_Step_4 LogUser = new User_Story_Step_4();
        LogUser.ClickSignIn();
        LogUser.EnterUser();
        LogUser.EnterPassword();
        //driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        LogUser.SubmitButton();

    }

    @Test(testName = "R4.2 Valid login")
    public static void userCredentialsValid(){
        driver.get(Utils.BASE_URL);
        Home_Page Home_Page = new Home_Page(driver);
        Login Login = new Login(driver);
        My_Account MyAccount = new My_Account(driver);
        User_Story_Step_4 LogUser = new User_Story_Step_4();
        LogUser.ClickSignIn();
        LogUser.EnterUser();
        LogUser.EnterPassword();
        LogUser.CheckMailOk();
        LogUser.SubmitButton();
        // LogUser.ClickShopCart();
        // LogUser.ClickHomeBot();
        LogUser.ClickHomeUp();


    }

    @Test(testName = "R4.3.0.1 Login with required files: no data")
    public static void userNoCredentials(){
        driver.get(Utils.BASE_URL);
        Home_Page Home_Page = new Home_Page(driver);
        Login Login = new Login(driver);
        User_Story_Step_4 LogUser = new User_Story_Step_4();
        LogUser.ClickSignIn();
        LogUser.SubmitButton();
        LogUser.NoAddressMessage();

    }

    @Test(testName = "R4.3.0.2 Login with required files: no email")
    public static void userNoEmail(){
        driver.get(Utils.BASE_URL);
        Home_Page Home_Page = new Home_Page(driver);
        Login Login = new Login(driver);
        User_Story_Step_4 LogUser = new User_Story_Step_4();
        LogUser.ClickSignIn();
        LogUser.EnterPassword();
        LogUser.SubmitButton();
        LogUser.NoAddressMessage();

    }

    @Test(testName = "R4.3.0.3 Login with required files: no password")
    public static void userNoPass(){
        driver.get(Utils.BASE_URL);
        Home_Page Home_Page = new Home_Page(driver);
        Login Login = new Login(driver);
        User_Story_Step_4 LogUser = new User_Story_Step_4();
        LogUser.ClickSignIn();
        LogUser.EnterUser();
        LogUser.SubmitButton();
        LogUser.NoPassMessage();

    }

    @Test(testName = "R4.3.1.1 Invalid email")
    public static void userEmailWrong(){
        driver.get(Utils.BASE_URL);
        Home_Page Home_Page = new Home_Page(driver);
        Login Login = new Login(driver);
        User_Story_Step_4 LogUser = new User_Story_Step_4();
        LogUser.ClickSignIn();
        LogUser.EnterWrongUser();
        LogUser.EnterPassword();
        LogUser.CheckWrongMail();
        LogUser.SubmitButton();
        LogUser.MailErrorMessage();

    }

    @Test(testName = "R4.3.1.2 Invalid password")
    public static void userPasswordWrong(){
        driver.get(Utils.BASE_URL);
        Home_Page Home_Page = new Home_Page(driver);
        Login Login = new Login(driver);
        User_Story_Step_4 LogUser = new User_Story_Step_4();
        LogUser.ClickSignIn();
        LogUser.EnterUser();
        LogUser.EnterWrongPassword();
        LogUser.SubmitButton();
        LogUser.PassErrorMessage();

    }

    @Test(testName = "R4.3.2 Authentication failure")
    public static void userNoAccount(){
        driver.get(Utils.BASE_URL);
        Home_Page Home_Page = new Home_Page(driver);
        Login Login = new Login(driver);
        User_Story_Step_4 LogUser = new User_Story_Step_4();
        LogUser.ClickSignIn();
        LogUser.EnterUserNoAccount();
        LogUser.EnterPasswordNoAccount();
        LogUser.SubmitButton();
        LogUser.AuthFailed();

    }



    @AfterSuite
    public static void cleanUp(){
        driver.manage().deleteAllCookies();
        //driver.close();
    }
}
