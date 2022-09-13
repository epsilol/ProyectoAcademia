import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class WebForm extends PageObject{

    private final String FIRST_NAME = "José";
    private final String LAST_NAME = "Vázquez";
    private final String JOB_TITLE = "Ingeniero de Pruebas";

    @FindBy(id = "first-name")
    private WebElement first_name;

    @FindBy(id = "last-name")
    private WebElement last_name;

    @FindBy(id = "job-title")
    private WebElement job_title;

    /*@FindBy(xpath = "//div[5]/div[2]/input")
    private WebElement Male;*/

    @FindBy(xpath = "//a[contains(text(),'Submit')]")
    private WebElement submit_button;

    @FindBy(xpath = "//div[contains(text(),'The form was successfully submitted!')]")
    private WebElement alertSuccess;

    public WebForm(WebDriver driver) {
        super(driver);
    }

    public void enterFirstName(){

        this.first_name.sendKeys(FIRST_NAME);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void enterLastName(){

        this.last_name.sendKeys(LAST_NAME);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void enterJobTitle(){

        this.job_title.sendKeys(JOB_TITLE);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void pressSubmitButton(){
        this.submit_button.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void verifyAlertSuccess(){

        this.alertSuccess.isDisplayed();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
}
