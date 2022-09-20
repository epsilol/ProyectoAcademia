package Test;

import Pages.Home_Page;
import Steps.User_Story_Step_1;
import Steps.User_Story_Step_2;
import Steps.User_Story_Step_3;
import Utilerias.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class User_Story_Tests_2 {
    public static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        // ChromeDriver location set up in Utilerias.Utils class
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @Test(testName = "Page Navigation")
    public static void navigation() throws InterruptedException {
        driver.get(Utils.BASE_URL);
        Home_Page Home_Page = new Home_Page(driver);
        User_Story_Step_2 Nav = new User_Story_Step_2();
        Thread.sleep(2000);
        Nav.navWomen();
        Thread.sleep(2000);
        Nav.navDresses();
        Thread.sleep(2000);
        Nav.navT_shirts();
    }
    @Test(testName = "Product Details")
    public static void productDetails(){
        driver.get(Utils.BASE_URL);
        Home_Page Home_Page = new Home_Page(driver);


    }
    @Test(testName = "Browse Products")
    public static void browseProducts() throws InterruptedException {
        driver.get(Utils.BASE_URL);
        Home_Page Home_Page = new Home_Page(driver);
        User_Story_Step_2 Search = new User_Story_Step_2();
        Thread.sleep(5000);
        Search.dressSearch();
        Thread.sleep(3000);




    }
    @AfterSuite
    public static void cleanUp(){
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
