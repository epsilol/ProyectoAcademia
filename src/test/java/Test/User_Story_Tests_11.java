package Test;


import Pages.Home_Page;
import Pages.Login;
import Steps.User_Story_Step_11;
import Steps.User_Story_Step_4;
import Steps.User_Story_Step_7;
import Utilerias.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class User_Story_Tests_11 {
    public static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        // ChromeDriver location set up in Utilerias.Utils class
            System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @Test(testName = "R.11 Check user information")
    public static void checkInfo(){
        driver.get(Utils.BASE_URL);
        Home_Page Home_Page = new Home_Page(driver);
        Login Login = new Login(driver);
        User_Story_Step_4 LogUser = new User_Story_Step_4();
        User_Story_Step_11 CheckInformation = new User_Story_Step_11();
        LogUser.ClickSignIn();
        LogUser.EnterUser();
        LogUser.EnterPassword();
        LogUser.SubmitButton();
    }

    @Test(testName = "R.11 Edit user information")
    public static void addProducts(){
        driver.get(Utils.BASE_URL);
        Home_Page Home_Page = new Home_Page(driver);

    }

    @AfterSuite
    public static void cleanUp(){
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
