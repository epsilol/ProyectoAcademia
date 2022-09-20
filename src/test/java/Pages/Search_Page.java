package Pages;

import Utilerias.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Search_Page extends PageObject{
    public Search_Page(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "grid")
    public static WebElement Grid_Button;
    @FindBy(id = "list")
    public static WebElement List_Button;







}
