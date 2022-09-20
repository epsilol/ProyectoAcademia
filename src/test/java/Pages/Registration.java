package Pages;

import Utilerias.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registration extends PageObject {

    public static String EMAIL_NEWACC = "danna@test.com";
    public static String FIRST_NAME = "Danna";
    public static String LAST_NAME = "López";
    public static String EMAIL = "danna@test.com";
    public static String DAY = "11";
    public static String MONTH = "October";
    public static String YEAR = "1997";

    //password minimo 5 caracteres y acepta mayusculas, minusculas y caracteres especiales
    public static String PASSWORD = "Test123*";


    @FindBy(id = "email_create")
    public static WebElement email_create;

    @FindBy(xpath = "//input[@name='SubmitCreate']")
    public static WebElement createAnAccountbtn;


    @FindBy(xpath = "//a[contains(text(),'Submit')]")
    public static WebElement submit_button;

    @FindBy(id = "id_gender1")
    public static WebElement Mrbutton;

    @FindBy(id = "uniform-id_gender2")
    public static WebElement Mrsbutton;

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

    @FindBy(id = "phone")
    public static WebElement home_phone;

    @FindBy(id = "phone_mobile")
    public static WebElement phone_mobile;

    @FindBy(id = "alias")
    public static WebElement alias;

    @FindBy(id = "submitAccount")
    public static WebElement register;

    public Registration(WebDriver driver) {
        super(driver);
    }
}
