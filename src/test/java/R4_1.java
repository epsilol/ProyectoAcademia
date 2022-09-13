import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import static

public class R4_1 extends Utils  {

    @Test(testName = "Submit a WebForm")
    public static void submitForm(){
        driver.get(BASE_URL);
        WebForm webForm = new WebForm(driver);
        webForm.enterFirstName();
        webForm.enterLastName();
        webForm.enterJobTitle();
        webForm.pressSubmitButton();
        webForm.verifyAlertSuccess();
    }


}
