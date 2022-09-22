package Test;

import Pages.Compare_Products_Page;
import Steps.User_Story_Step_9;
import Utilerias.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class User_Story_Tests_9 {
    public static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        // ChromeDriver location set up in Utilerias.Utils class
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @Test(testName="R9.1 Adding products to the comparison list ")
    public static void AddProductsToCompare() {
        driver.get(Utils.BASE_URL);
        Compare_Products_Page compare = new Compare_Products_Page(driver);

        User_Story_Step_9 compareItems = new User_Story_Step_9();
        compareItems.SearchProduct();


    }


}
