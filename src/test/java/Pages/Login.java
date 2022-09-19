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



    public Login(WebDriver driver) {
        super(driver);
    }
}
