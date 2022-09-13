import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class UserLogin {

    private static final WebDriver driver = new ChromeDriver();
    @FindBy(xpath = "//a[@class='login']")
    private WebElement sign_in_button;
}
