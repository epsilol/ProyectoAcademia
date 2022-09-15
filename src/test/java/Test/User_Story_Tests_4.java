package Test;

import Pages.Home_Page;
import Pages.Login;
import Steps.User_Story_Step_4;
import Utilerias.Accounts;
import Utilerias.Utils;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class User_Story_Tests_4 {
    public static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        // ChromeDriver location set up in Utilerias.Utils class
            System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @Test(testName = "R4.1 Access to my account") // poner aqui de que se trata caso de prueba
    public static void userLogin(){     //submit form cambiar nombre de funcion NO LLAMARSE IGUAL
        driver.get(Utils.BASE_URL);
        Home_Page Home_Page = new Home_Page(driver);
        Login Login = new Login(driver);
        User_Story_Step_4 LogUser = new User_Story_Step_4();
        LogUser.ClickSignIn(); //clic en sign in
        LogUser.EnterUser();
        LogUser.EnterPassword();
        LogUser.SubmitButton();



    }

    @AfterSuite
    public static void cleanUp(){
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
