package Pages;

import Utilerias.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.nio.channels.Selector;

public class Home_Page extends PageObject {

    public static String FIRST_NAME = "José";
    public static String LAST_NAME = "Vázquez";
    public static String JOB_TITLE = "Ingeniero de Pruebas";

    @FindBy(id = "first-name")
    public static WebElement first_name;

    @FindBy(id = "last-name")
    public static WebElement last_name;

    @FindBy(id = "job-title")
    public static WebElement job_title;

    /*@FindBy(xpath = "//div[5]/div[2]/input")
    public WebElement Male;*/

    @FindBy(xpath = "//a[contains(text(),'Submit')]")
    public static WebElement submit_button;

    @FindBy(xpath = "//div[contains(text(),'The form was successfully submitted!')]")
    public static WebElement alertSuccess;


    //AQUI PUEDEN PONER SUS OBJETOS RECUERDEN PONERLOS PUBLIC STATIC

    @FindBy(className = "login") //busca el elemento con clase login que es el boton de login
    public static WebElement Sign_in;

   // selenium find element using xpath position
    @FindBy(xpath = "//a[contains(text(),'Add to cart')]")
    public static WebElement Add_to_cart;

    @FindBy(id = "//*[@id='searchbox']/button")
    public static WebElement Submit_Button_Search_Bar;

    @FindBy(id ="id=search_query_top")
    public static WebElement Search_Bar;
    // find by class
    @FindBy(className = "ajax_cart_no_product")
    public static WebElement Cart;

    public Home_Page(WebDriver driver) {
        super(driver);
    }
}
