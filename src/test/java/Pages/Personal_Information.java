package Pages;

import Utilerias.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Personal_Information extends PageObject {

    //Objetos de la pagina "Your Personal Information" para requirement 11

    @FindBy(id = "id_gender1")
    public static WebElement Mrbutton;

    @FindBy(id = "id_gender2")
    public static WebElement Mrsbutton;

    @FindBy(id = 'firstname')
    public static WebElement first_name;

    @FindBy(id = 'lastname')
    public static WebElement last_name;

    @FindBy(id = 'email')
    public static WebElement e_mail;

    @FindBy(id = 'days')
    public static WebElement days;

    @FindBy(id = 'months')
    public static WebElement months;

    @FindBy(id = 'years')
    public static WebElement years;

    @FindBy(id = 'old_passwd')
    public static WebElement old_password;

    @FindBy(id = 'passwd')
    public static WebElement new_password;

    @FindBy(id = 'confirmation')
    public static WebElement password_confirmation;

    @FindBy(xpath = "//*[@id='center_column']/div/form/fieldset/div[11]/button/span")
    public static WebElement save_info;

}
