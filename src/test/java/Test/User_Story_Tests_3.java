package Test;


import Pages.Home_Page;
import Pages.Registration;
import Steps.User_Story_Step_1;
import Steps.User_Story_Step_3;
import Utilerias.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
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
    public static void createAnAccountPage() throws InterruptedException {
        driver.get(Utils.BASE_URL);
        Registration reg = new Registration(driver);
        Home_Page Home_Page = new Home_Page(driver);
        User_Story_Step_3 registration = new User_Story_Step_3();
        //Ingresa primero a login page
        Home_Page.Sign_in.click();
        //Ingresa el correo y da click en crear la cuenta
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
        //assert first and last name

        //continua llenando el formulario
        registration.enterCompany();
        registration.enterAddress1();
        registration.enterAddress2();
        registration.enterCity();
        registration.enterState();
        registration.enterPostalCode();
        registration.enterCountry();
        registration.enterAddInfo();
        registration.enterHomePhone();
        registration.enterMobilePhone();
        registration.enterAlias();
        registration.clickRegisterButton();
        //Valida que es redirigido a my account
        registration.myAccountHeader();


    }

    @Test(testName = "R.3.1 General Rules Invalid Email") // Authentication
    public static void enterInvalidEmail() throws InterruptedException {
        driver.get(Utils.BASE_URL);
        Registration reg = new Registration(driver);
        Home_Page Home_Page = new Home_Page(driver);
        User_Story_Step_3 registration = new User_Story_Step_3();
        //Ingresa primero a login page
        Home_Page.Sign_in.click();
        //Ingresa el correo y da click en crear la cuenta
        registration.enterWrongEmail();
        registration.clickCreateAnAccount();
        registration.invalidMessage();

    }

    @Test(testName = "R3.2 Mandatory data and Optional user Data") // Authentication
    public static void enterMandatoryData() throws InterruptedException {
        driver.get(Utils.BASE_URL);
        Registration reg = new Registration(driver);
        Home_Page Home_Page = new Home_Page(driver);
        User_Story_Step_3 registration = new User_Story_Step_3();
        //Ingresa primero a login page
        Home_Page.Sign_in.click();
        //Ingresa el correo y da click en crear la cuenta
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
        //assert first and last name

        //continua llenando el formulario
        registration.enterCompany();
        registration.enterAddress1();
        registration.enterAddress2();
        registration.enterCity();
        registration.enterState();
        registration.enterPostalCode();
        registration.enterCountry();
        registration.enterAddInfo();
        registration.enterHomePhone();
        registration.enterMobilePhone();
        registration.enterAlias();
        registration.clickRegisterButton();
        //valida que es redirigido a my account
        registration.myAccountHeader();



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
