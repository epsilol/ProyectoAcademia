package Test;


import Pages.Home_Page;
import Pages.Login;
import Steps.User_Story_Step_7;
import Steps.User_Story_Step_8;
import Utilerias.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class User_Story_Tests_8 {
    public static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        // ChromeDriver location set up in Utilerias.Utils class
            System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @Test(testName="R8.1 Contact customer support")//poner aqui de que se trata caso de prueba
    public static void ContactCustomerSupport(){
        driver.get(Utils.BASE_URL);
        Home_Page Home_Page = new Home_Page(driver);
        Login Login = new Login(driver);
        //ContactUs Contact_Us = new ContactUs(driver);
        User_Story_Step_8 ContactUs = new User_Story_Step_8();
        ContactUs.ClickContactUs();
        ContactUs.HeadingDropDown();
        WebDriverWait wait = new WebDriverWait(driver,100);
        WebElement DropDown = driver.findElement(By.id("id_contact"));
        Select select = new Select(DropDown);
        select.selectByValue("2");
        ContactUs.ContactUsEmail();
        ContactUs.EnterEmail();
        ContactUs.CustomerServiceEnterText();
        ContactUs.CustomerServiceSend();
    }

    @AfterSuite
    public static void cleanUp(){
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
