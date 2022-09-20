package Pages;

import Utilerias.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class My_Account extends PageObject {

    @FindBy(id = "first-name")
    public static WebElement first_name;

    @FindBy(xpath = "//a[contains(text(),'Submit')]")
    public static WebElement submit_button;

    @FindBy(xpath = "//div[contains(text(),'The form was successfully submitted!')]")
    public static WebElement alertSuccess;

    @FindBy(className = "login") //busca el elemento con clase login que es el boton de login
    public static WebElement Sign_in;

    @FindBy(css = "#header > div:nth-child(3) > div > div > div:nth-child(3) > div > a")
    public static WebElement shopping_cart;

    @FindBy(xpath = "//*[@class = 'lnk_wishlist']//a")
    public static WebElement my_wishlist;

    @FindBy(xpath = "//*[@class = 'icon-list-ol']")
    public static WebElement order_history_details;

    @FindBy(xpath = "//*[@class = 'icon-ban-circle']")
    public static WebElement credit_slips;

    @FindBy(xpath = "//*[@class = 'icon-building']")
    public static WebElement my_addresses;

    @FindBy(xpath = "//*[@class = 'icon-user']")
    public static WebElement personal_info;

    @FindBy(xpath = "//*[@class = 'icon-chevron-left']")
    public static WebElement home_bot;

    @FindBy(xpath = "//*[@class = 'icon-home']")
    public static WebElement home_up;

    @FindBy(xpath = "//a[class='login']")
    public static WebElement signIn_button;

    @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[1]/a")
    public static WebElement women_button;

    @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[2]/a")
    public static WebElement dresses_button;

    @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[3]/a")
    public static WebElement shirts_button;

    @FindBy(xpath = "//*[@id='contact-link']")
    public static WebElement contact_us;

    @FindBy(xpath = "//*[@class = 'logout']")
    public static WebElement sign_out;

    @FindBy(xpath = "//*[@class = 'header_user_info']")
    public static WebElement customer_account;

    @FindBy(xpath = "//*[@class = 'logo img-responsive']")
    public static WebElement your_logo;

    @FindBy(xpath = "//*[@class = 'btn btn-default button-search']")
    public static WebElement submit_search_button;

    @FindBy(xpath = "//*[@class = 'search_query form-control ac_input']")
    public static WebElement search_bar;

    public My_Account(WebDriver driver) {
        super(driver);
    }
}
