package Pages;

import Utilerias.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddMyAddress_Page extends PageObject {
    //UserStory6
    @FindBy(xpath = "//a[@title='Addresses']")
    public static WebElement buttonMyAddresses;

    @FindBy(xpath="//a[@title='Add an address']")
    public static WebElement buttonAddAddress;

    @FindBy(xpath = "//*[@id=\"firstname\"]")
    public static WebElement firstNameMyAddress;

    @FindBy(xpath = "//*[@id=\"lastname\"]")
    public static WebElement lastNameMyAddress;

    @FindBy(xpath = "//*[@id=\"company\"]")
    public static WebElement companyMyAddress;

    @FindBy(xpath = "//*[@id=\"address1\"]")
    public static WebElement address1MyAddress;

    @FindBy(xpath = "//*[@id=\"city\"]")
    public static WebElement cityMyAddress;

    @FindBy(xpath = "//*[@id=\"id_state\"]")
    public static WebElement id_stateMyAddress;

    @FindBy(xpath = "//*[@id=\"postcode\"]")
    public static WebElement postcodeMyAddress;

    @FindBy(xpath = "//*[@id=\"id_country\"]")
    public static WebElement id_countryMyAddress;

    @FindBy(xpath = "//*[@id=\"phone\"]")
    public static WebElement phoneMyAddress;

    @FindBy(xpath = "//*[@id=\"phone_mobile\"]")
    public static WebElement phoneMobileAddress;

    @FindBy(xpath = "//*[@id=\"alias\"]")
    public static WebElement aliasMyAddress;

    @FindBy(id="submitAddress")
    public static WebElement 	submitAddressMyAddress;

    @FindBy(xpath="//*[@id=\"center_column\"]/div[1]/div/div[2]/ul/li[9]/a[2]/span")
    public static WebElement 	deleteAddressMyAddress;

    public AddMyAddress_Page(WebDriver driver) {
        super(driver);
    }


    //UserStory6Fin
}
