package Pages;

import Utilerias.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Checkout extends PageObject {

    public Checkout(WebDriver driver) {
        super(driver);
    }



    //Find element cart by xpath
    @FindBy(xpath = "//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")
    public static WebElement Cart;

    //find element cart by xpath alternative
    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/")
    public static WebElement Cart2;

    //find element proceed to checkout summary by xpath
    @FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]")
    public static WebElement Proceed_to_checkout_summary;

    //find element proceed to checkout address by xpath
    @FindBy(xpath = "//*[@id=\"center_column\"]/form/p/button")
    public static WebElement Proceed_to_checkout_address;

    //find element proceed to checkout shipping by xpath
    @FindBy(xpath = "//*[@id=\"form\"]/p/button")
    public static WebElement Proceed_to_checkout_shipping;

    //find element checkbox by id
    @FindBy(id = "cgv")
    public static WebElement Checkbox;

    //find element proceed to checkout payment by xpath
    @FindBy(xpath = "//*[@id=\"form\"]/p/button")
    public static WebElement Proceed_to_checkout_payment;



    //find element pay by bank wire by xpath
    @FindBy(xpath = "//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")
    public static WebElement Pay_by_bank_wire;

    //find element email by id
    @FindBy(id = "email")
    public static WebElement Email2;

    //find element password by id
    @FindBy(id = "passwd")
    public static WebElement Password2;

    //find element submit login by id
    @FindBy(id = "SubmitLogin")
    public static WebElement SubmitLogin2;


    //find element dropdown addresses by id
    @FindBy(id = "id_address_delivery")
    public static WebElement Dropdown_addresses;


    //dropdown addresses select by value 2
    @FindBy(xpath = "//*[@id=\"id_address_delivery\"]/option[2]")
    public static WebElement Dropdown_addresses2;

    //find element continue shopping botton by xpath
    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span")
    public static WebElement Continue_shopping;

    //find shopping cart number of products by xpath
    @FindBy(xpath = "//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a/span[1]")
    public static WebElement Shopping_cart_number_of_products;


}
