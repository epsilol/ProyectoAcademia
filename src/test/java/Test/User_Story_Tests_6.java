package Test;

import Pages.AddMyAddress_Page;
import Pages.Home_Page;
import Pages.Login;
import Steps.User_Story_Step_6;
import Utilerias.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.openqa.selenium.Alert;


public class User_Story_Tests_6 {
    public static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        // ChromeDriver location set up in Utilerias.Utils class
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }




    @Test (testName = "Addresses")
    public static void LogIn (){
        driver.get(Utils.BASE_URL);
        Home_Page Home_Page = new Home_Page(driver);
        Login Login = new Login(driver);
        AddMyAddress_Page AddMyAddress_Page = new AddMyAddress_Page(driver);
        User_Story_Step_6 LogUser = new User_Story_Step_6(driver);
        LogUser.ClickSignIn();
        LogUser.EnterUser();
        LogUser.EnterPassword();
        LogUser.EnterSubmit();
        LogUser.EnterMyAdresses();
        LogUser.EnterAddMyAdresses();
        LogUser.EnterFirstNameMyAddress();
        LogUser.EnterLastNameMyAddress();
        LogUser.EnterCompanyMyAddress();
        LogUser.EnterAddressMyAddress();
        LogUser.EnterCityMyAddress();
        LogUser.EnterStateMyAddress();
        LogUser.EnterZipcodeMyAddress();
        LogUser.EnterCountryMyAddress();
        LogUser.EnterPhoneMyAddress();
        LogUser.EnterMobilePhoneMyAddress();
        LogUser.EnterAliasMyAddress();
        LogUser.EnterSubmitMyAddress();
        LogUser.DeleteMyAddress();
        Alert alert = driver.switchTo().alert();
        alert.accept();
            }
    @AfterTest
    public void endSession() {
        //driver.quit();
    }
}

