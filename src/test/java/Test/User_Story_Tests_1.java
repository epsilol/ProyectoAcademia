package Test;


import Pages.Home_Page;
import Steps.User_Story_Step_1;
import Steps.User_Story_Step_7;
import Utilerias.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class User_Story_Tests_1 {
    public static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        // ChromeDriver location set up in Utilerias.Utils class
            System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @Test(testName = "R.1 Page Not Found") // Enter with a modified URL
    public static void enterModifiedPage(){
        driver.get(Utils.MODIFIED_URL);
        Home_Page Home_Page = new Home_Page(driver);
        User_Story_Step_1 Enter = new User_Story_Step_1();
        Enter.timeOutStep1();
    }

    @AfterSuite
    public static void cleanUp(){
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
