package Pages;

import Utilerias.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends PageObject {



    //AQUI PUEDEN PONER SUS OBJETOS RECUERDEN PONERLOS PUBLIC STATIC

    @FindBy(xpath = "//div[@class='login']") //busca el elemento con clase login que es el boton de login
    public static WebElement Sign_in;


    @FindBy(id = "email")
    public static WebElement email;

    @FindBy(id = "passwd")
    public static WebElement password;

    @FindBy(id = "SubmitLogin")
    public static WebElement submit_button_login;





    public Login(WebDriver driver) {
        super(driver);
    }
}
