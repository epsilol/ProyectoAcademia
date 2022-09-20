package Test;

import Pages.Home_Page;
import Pages.Login;
import Steps.User_Story_Step_4;
import Steps.User_Story_Step_6;
import Utilerias.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class User_Story_Tests_6 {
    public static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        // ChromeDriver location set up in Utilerias.Utils class
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @Test(testName = "R6.1 Add a new address") // poner aqui de que se trata caso de prueba
    public static void userLoginn() {     //submit form cambiar nombre de funcion NO LLAMARSE IGUAL
        driver.get(Utils.BASE_URL);
        Home_Page Home_Page = new Home_Page(driver);
        Login Login = new Login(driver);
        User_Story_Step_4 LogUser = new User_Story_Step_4();
        LogUser.ClickSignIn(); //clic en sign in
        LogUser.EnterUser();
        LogUser.EnterPassword();
        LogUser.SubmitButton();

        WebElement clickToButtonMyAddresses = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[3]/a/span"));
        clickToButtonMyAddresses.click();

        WebElement clickToButtonAddANewAddress = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[2]/a/span"));
        clickToButtonAddANewAddress.click();

    }

    @Test
    public void fillSignIn() throws InterruptedException {
        driver.get(Utils.BASE_URL);
        Home_Page Home_Page = new Home_Page(driver);
        Login Login = new Login(driver);
        User_Story_Step_4 LogUser = new User_Story_Step_4();
        User_Story_Step_6 authPage = new User_Story_Step_6(driver);
        LogUser.ClickSignIn(); //clic en sign in
        LogUser.EnterUser();
        LogUser.EnterPassword();
        LogUser.SubmitButton();

        WebElement clickToButtonMyAddresses = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[3]/a/span"));
        clickToButtonMyAddresses.click();

        WebElement clickToButtonAddANewAddress = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[2]/a/span"));
        clickToButtonAddANewAddress.click();


        //User_Story_Tests_6 mainPage = User_Story_Tests_6.initElements(driver, User_Story_Tests_6.class);
        //User_Story_Step_6 authPage = User_Story_Tests_6.initElements(driver, User_Story_Step_6.class);

        //mainPage.openSignInPage();
        authPage.fillSignIn(
                "Abdiel","Hernandez", "ACN", "Calle falsa 123", "Los Angeles", "California", "69852", "United States", "8117891234", "Domicilio 2");


    }



}

