package Test;


import Pages.Home_Page;
import Pages.Login;
import Pages.My_Account;
import Pages.Personal_Information;
import Steps.User_Story_Step_11;
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

    @Test(testName = "R11.1 User can verify their personal info")
    public static void userVerifyInfo(){
        driver.get(Utils.BASE_URL);
        Home_Page home_page = new Home_Page(driver);
        My_Account my_account = new My_Account(driver);
        Login Login = new Login(driver);
        Personal_Information personal = new Personal_Information(driver);
        User_Story_Step_11 logUser = new User_Story_Step_11();
        logUser.ClickSignIn();
        logUser.ClickSignIn();
        logUser.EnterUser();
        logUser.EnterPassword();
        logUser.pressSubmitButton();
        logUser.ClickMyPersonalInfo();
        logUser.addPasswordToSave();
        logUser.clickOnSaveChanges();

    }

    @Test(testName = "R11.2 User can modify their personal info")
    public static void userEditPersonalInfo(){
        driver.get(Utils.BASE_URL);
        Home_Page home_page = new Home_Page(driver);
        My_Account my_account = new My_Account(driver);
        Login Login = new Login(driver);
        Personal_Information personal = new Personal_Information(driver);
        User_Story_Step_11 logUser = new User_Story_Step_11();
        logUser.ClickSignIn();
        logUser.ClickSignIn();
        logUser.EnterUser();
        logUser.EnterPassword();
        logUser.pressSubmitButton();
        logUser.ClickMyPersonalInfo();
//        logUser.editUserEmail();
        logUser.editUserName();
        logUser.editUserLastName();
        logUser.editUserDayBirth();
        logUser.editUserMonthBirth();
        logUser.editUserYearBirth();
        logUser.addPasswordToSave();
        logUser.clickOnSaveChanges();

    }

    @AfterSuite
    public static void cleanUp(){
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
