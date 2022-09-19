package Pages;

import org.openqa.selenium.WebDriver;
import Utilerias.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Shopping_Cart extends  PageObject{


    @FindBy(xpath = "//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")
    public static WebElement buttonCart;

    //XPATH COMPLETO
    @FindBy(xpath = "/html/body/div/div[2]/div/div[2]/div/div[1]/ul[1]/li[1]/div/div[2]/div[2]/a[1]")
    public static WebElement AddItem;






    public Shopping_Cart(WebDriver driver) {
        super(driver);
    }
}
