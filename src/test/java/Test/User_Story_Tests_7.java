package Test;


import Pages.Home_Page;
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

    @Test(testName = "Submit a Pages.Home_Page") // poner aqui de que se trata caso de prueba
    public static void addProducts(){     //submit form cambiar nombre de funcion NO LLAMARSE IGUAL
        driver.get(Utils.BASE_URL);
        Home_Page Home_Page = new Home_Page(driver);
        User_Story_Step_7 Shop = new User_Story_Step_7();
        Shop.enterFirstName();
        Shop.enterLastName();
        Shop.enterJobTitle();
        Shop.pressSubmitButton();

       Shop.verifyAlertSuccess();
    }

    @AfterSuite
    public static void cleanUp(){
        driver.manage().deleteAllCookies();
        driver.close();
    }
}