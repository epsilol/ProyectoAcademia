package Pages;

import Utilerias.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import java.util.Random;

import static Test.User_Story_Tests_3.driver;

public class Registration extends PageObject {

    public static String WRONG_EMAIL = "dannatest.com";
    public static String FIRST_NAME = "Danna";
    public static String LAST_NAME = "López";

    public static String COMPANY = "TEST CO";

    //password minimo 5 caracteres y acepta mayusculas, minusculas y caracteres especiales
    public static String PASSWORD = "Test123*";
    public static String ADDRESS_1 = "Av. siempre viva 777";
    public static String ADDRESS_2 = "Independencia";
    public static String CITY = "Dallas";
    public static String STATE = "Texas";
    public static String POSTAL_CODE = "00000";
    public static String COUNTRY = "United States";
    public static String ADDINFO = "Test";
    public static String HOME_PHONE = "1234567890";
    public static String MOBILE_PHONE = "1234567890";
    public static String ALIAS = "Home";


    //Your personal information

    @FindBy(id = "id_gender1")
    public static WebElement Mrbutton;

    @FindBy(id = "id_gender2")
    public static WebElement Mrsbutton;
    @FindBy(xpath = "//input[@id='email_create']")
    public static WebElement email_create;

    @FindBy(xpath = "//li[contains(text(),'Invalid email address.')]")
    public  static WebElement invalidEmailMsg;

    @FindBy(id = "SubmitCreate")
    public static WebElement createAnAccountbtn;


    @FindBy(xpath = "//a[contains(text(),'Submit')]")
    public static WebElement submit_button;

    @FindBy(id = "customer_firstname")
    public static WebElement first_name;

    @FindBy(id = "customer_lastname")
    public static WebElement last_name;

    @FindBy(id = "email")
    public static WebElement email_user;

    @FindBy(id = "passwd")
    public static WebElement password;

    @FindBy(id = "days")
    public static WebElement day;

    @FindBy(id = "months")
    public static WebElement month;

    @FindBy(id = "years")
    public static WebElement year;

    @FindBy(id = "newsletter")
    public static WebElement newsletter_check;

    @FindBy(id = "optin")
    public static WebElement offers_check;

    //Your address section
    @FindBy(id = "firstname")
    public static WebElement first_name_reg;

    @FindBy(id = "lastname")
    public static WebElement last_name_reg;

    @FindBy(id = "company")
    public static WebElement company;

    @FindBy(id = "address1")
    public static WebElement address_1;

    @FindBy(id = "address2")
    public static WebElement address_2;

    @FindBy(id = "city")
    public static WebElement city;

    @FindBy(id = "id_state")
    public static WebElement state;

    @FindBy(id = "postcode")
    public static WebElement post_code;

    @FindBy(id = "id_country")
    public static WebElement country;

    @FindBy(id = "other")
    public static WebElement add_Info;

    @FindBy(xpath = "//p[contains(text(),'You must register at least one phone number.')]")
    public static WebElement phoneMessage;

    @FindBy(id = "phone")
    public static WebElement home_phone;

    @FindBy(id = "phone_mobile")
    public static WebElement phone_mobile;

    @FindBy(id = "alias")
    public static WebElement alias;

    @FindBy(id = "submitAccount")
    public static WebElement register;

    @FindBy(xpath = "//span[contains(text(),'Required field')]")
    public static WebElement requiredMessage;

    @FindBy(xpath = "///h1[contains(text(),'Create an account')]")
    public static WebElement createAnAccountHeader;

    @FindBy(xpath = "//h3[contains(text(),'Your personal information')]")
    public static WebElement personalInfoHeader;

    @FindBy(xpath = "//h1[contains(text(),'My account')]")
    public static WebElement myAccountHeader;

    static int min = 1000;
    static int max = 6000000;



    static int random_user = (int)Math.floor(Math.random()*(max-min+1)+min);
    static int random_domain = (int)Math.floor(Math.random()*(max-min+1)+min);


    public static String EMAIL_RND = random_user + "@" + random_domain + ".com";


    public Registration(WebDriver driver) {
        super(driver);
    }
}
