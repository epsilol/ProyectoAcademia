package Test;


import Pages.Home_Page;
import Steps.User_Story_Step_1;
import Steps.User_Story_Step_3;
import Utilerias.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class User_Story_Tests_3 {
    public static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        // ChromeDriver location set up in Utilerias.Utils class
            System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @Test(testName = "R.3.1 General Rules") // Authentication
    public static void createAnAccountPage(){
        driver.get(Utils.BASE_URL);
        Home_Page Home_Page = new Home_Page(driver);
        User_Story_Step_3 registration = new User_Story_Step_3();
        //Ingresa primero a login page
        Home_Page.Sign_in.click();
        //Ingresa el correo y crea la cuenta
        registration.enterEmailCreated();
        registration.clickCreateAnAccount();
        //Llena el formulario
        registration.pressMrs();
        registration.enterFirstName();
        registration.enterLastName();
        registration.enterPassword();
        registration.enterDayOfBirth();
        registration.enterMonthOfBirth();
        registration.enterYearOfBirth();
        registration.clickNewsletter();
        registration.clickOffers();






    }

    /*If no email address is input on the text box or an invalid email address is
    input (No @) and the “create account” button is clicked, a pop up displaying “invalid email
    address” will be shown. */
    @Test(testName = "R.3.1 General Rules") // Authentication
    public static void enterInvalidData(){
        driver.get(Utils.BASE_URL);
        Home_Page Home_Page = new Home_Page(driver);
        User_Story_Step_3 registration = new User_Story_Step_3();
        //Ingresa primero a login page
        Home_Page.Sign_in.click();
        //Ingresa el correo y crea la cuenta
        registration.enterEmailCreated();
        registration.clickCreateAnAccount();
        //Llena el formulario
        registration.pressMrs();





    }

    @Test(testName = "R3.2 Mandatory data and Optional user Data") // Authentication
    public static void enterMandatoryData(){
        driver.get(Utils.BASE_URL);
        Home_Page Home_Page = new Home_Page(driver);
        User_Story_Step_3 registration = new User_Story_Step_3();




    }

    @Test(testName = "R.3.3 Registrering an account") // Authentication
    public static void enterModifiedPage(){
        driver.get(Utils.BASE_URL);
        Home_Page Home_Page = new Home_Page(driver);
        User_Story_Step_3 registration = new User_Story_Step_3();




    }

    @AfterSuite
    public static void cleanUp(){
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
