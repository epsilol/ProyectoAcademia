package Pages;

import Utilerias.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Customer_Support extends PageObject {


    @FindBy(xpath="//*[@id='contact-link']/a")
    public static WebElement contactUs_button;

    @FindBy(xpath="//*[@id='id_contact']")
    public static WebElement HeadingDropDown;

    @FindBy(xpath="//*[@id='uniform-id_contact']/span")
    public static WebElement chooseDropDown;

    @FindBy(xpath="//*[@id='email']")
    public static WebElement ContactUsEmail;

    @FindBy(xpath="//*[@id='message']")
    public static WebElement CustomerServiceEnterText;

    @FindBy(xpath="//*[@id='submitMessage']/span")
    public static WebElement CustomerServiceSend;

    public Customer_Support(WebDriver driver) {
        super(driver);
            }
}
