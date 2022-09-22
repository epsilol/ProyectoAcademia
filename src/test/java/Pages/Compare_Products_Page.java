package Pages;

import Utilerias.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Compare_Products_Page extends PageObject {
    public Compare_Products_Page(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@name='submit_search']")
    public static WebElement Submit_Button_Search_Bar;

    @FindBy(id = "search_query_top")
    public static WebElement Search_Bar;


    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[3]/div[2]/a")
    public static WebElement ButtonAddCompare1;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[2]/div/div[3]/div[2]/a")
    public static WebElement ButtonAddCompare2;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[3]/div/div[3]/div[2]/a")
    public static WebElement ButtonAddCompare3;



}