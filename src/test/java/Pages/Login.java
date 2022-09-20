package Pages;

import Utilerias.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.sql.SQLData;

public class Login extends PageObject {

    //AQUI PUEDEN PONER SUS OBJETOS RECUERDEN PONERLOS PUBLIC STATIC

    @FindBy(id = "email")
    public static WebElement email;

    @FindBy(id = "passwd")
    public static WebElement password;

    @FindBy(id = "SubmitLogin")
    public static WebElement submit_button;

    @FindBy(xpath = "//*[@class='form-group form-error']")
    public static WebElement mail_error_not;

    @FindBy(xpath = "//*[@class = 'alert alert-danger']//ol//li[contains(text(),'Invalid email address')]")
    public static WebElement invalid_mail_not;

    @FindBy(xpath = "//*[@class = 'alert alert-danger']//ol//li[contains(text(),'Invalid password')]")
    public static WebElement invalid_pass_not;

    @FindBy(xpath = "//*[@class = 'alert alert-danger']//ol//li[contains(text(),'An email address required')]")
    public static WebElement email_address_required;

    public Login(WebDriver driver) {
        super(driver);
    }
}
