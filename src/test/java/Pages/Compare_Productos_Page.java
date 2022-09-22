package Pages;

import Utilerias.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Compare_Productos_Page extends PageObject {
    public Compare_Productos_Page(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@name='submit_search']")
    public static WebElement Submit_Button_Search_Bar;

    @FindBy(id = "search_query_top")
    public static WebElement Search_Bar;


}
