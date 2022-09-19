package Pages;

import org.openqa.selenium.WebDriver;
import Utilerias.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Shopping_Cart extends  PageObject{

    public Shopping_Cart(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")
    public static WebElement buttonCart;

    //XPATH COMPLETO
    @FindBy(xpath = "//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[1]")
    public static WebElement AddItem;


    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[1]")
    public static WebElement AlertSuccess;







}
