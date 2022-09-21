package Test;

import Pages.Home_Page;
import Pages.Login;
import Pages.My_Account;
import Steps.User_Story_Step_10;
import Utilerias.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class User_Story_Tests_10 {
    public static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @Test(testName = "R10 Sign out")
    public static void userLogOut(){
        driver.get(Utils.BASE_URL);
        Home_Page home_page = new Home_Page(driver);
        My_Account my_account = new My_Account(driver);
        Login Login = new Login(driver);
        User_Story_Step_10 logUser = new User_Story_Step_10();
        logUser.ClickSignIn();
        logUser.ClickSignIn();
        logUser.EnterUser();
        logUser.EnterPassword();
        logUser.pressSubmitButton();
        logUser.ClickSignOut();
    }

    @AfterSuite
    public static void cleanup(){
        driver.manage().deleteAllCookies();
        driver.close();
    }

}


