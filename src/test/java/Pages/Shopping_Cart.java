package Pages;

import org.openqa.selenium.WebDriver;
import Utilerias.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class Shopping_Cart extends  PageObject{

    public Shopping_Cart(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//*[@id=\"header_logo\"]/a/img")
    public static  WebElement Logo;
    @FindBy(xpath = "//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")
    public static WebElement buttonCart;

    @FindBy(xpath = "//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[1]")
    public static WebElement AddItem;

    @FindBy(xpath = "//*[@id=\"homefeatured\"]/li[2]/div/div[1]/div/a[1]/img")
    public static WebElement AddItem2;

    @FindBy(xpath = "//*[@id=\"homefeatured\"]/li[3]/div/div[1]/div/a[1]/img")
    public static WebElement AddItem3;

    @FindBy(xpath = "//*[@id=\"add_to_cart\"]/button/span")
    public static WebElement ButtonAddCartDetails;


    @FindBy(xpath = "//*[@id=\"header\"]/div[3]/div/div/div[5]")
    public  static WebElement Overlayer;

    @FindBy(xpath = "//*[@id=\"layer_cart\"]")
    public static WebElement AlertSuccess;

    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[1]/span")
    public static WebElement CloseModalButton;

    @FindBy(id = "1_1_0_0") //Del primer elemento que encuentre en la tabla
    public static WebElement buttonDelete;


    @FindBy(id = "cart_quantity_up_1_1_0_0")//Boton para incrementar las cantidades
    public static WebElement buttonQuantityUp;

    @FindBy(id = "cart_quantity_down_1_1_0_0")//Boton para reducir las cantidades
    public static WebElement buttonQuantityDown;

}
