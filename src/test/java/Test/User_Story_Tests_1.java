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

import java.lang.annotation.Repeatable;
import java.util.concurrent.TimeUnit;

import static Test.User_Story_Tests_5.driver;

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
    }

    @Test(testName = "R.1 Page Access - Page opened") // Be able to visualize page with URL
    public static void enterPage(){
        driver.get(Utils.BASE_URL);
        Home_Page Home_Page = new Home_Page(driver);
    }


    @AfterSuite
    public static void cleanUp(){
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
