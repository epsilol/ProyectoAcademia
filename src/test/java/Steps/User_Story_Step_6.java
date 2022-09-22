package Steps;


import Pages.Home_Page;

import java.sql.Driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class User_Story_Step_6 {

    final WebDriver driver;

    public User_Story_Step_6(WebDriver driver) {
        this.driver=driver;
    }

    //Create account section elements
    @FindBy(id="email_create")
    WebElement createEmailTextBox;

    @FindBy(id="SubmitCreate")
    WebElement createAccountButton;


    //Login with credentials elements
    @FindBy(id="email")
    WebElement emailTextBox;

    @FindBy(id="passwd")
    WebElement passwordTextBox;

    @FindBy(xpath="//a[@title='Recover your forgotten password']")
    WebElement forgotPassword;

    @FindBy(id="SubmitLogin")
    WebElement signInButton;


    //My Address elements
    @FindBy(xpath="//*[@id=\"center_column\"]/div/div[1]/ul/li[3]/a/span")
    WebElement buttonMyAddresses;

    @FindBy(xpath="//a[@title='Add an address']")
    WebElement buttonAddAddress;

    @FindBy(id="firstname")
    WebElement firstNameMyAddress;

    @FindBy(id="lastname")
    WebElement lastNameMyAddress;

    @FindBy(id="company")
    WebElement companyMyAddress;

    @FindBy(id="address1")
    WebElement address1MyAddress;

    @FindBy(id="city")
    WebElement cityMyAddress;

    @FindBy(id="id_state")
    WebElement id_stateMyAddress;

    @FindBy(id="postcode")
    WebElement postcodeMyAddress;

    @FindBy(id="id_country")
    WebElement id_countryMyAddress;

    @FindBy(id="phone")
    WebElement phoneMyAddress;

    @FindBy(id="alias")
    WebElement aliasMyAddress;

    @FindBy(id="submitAddress")
    WebElement 	submitAddressMyAddress;

    @FindBy(xpath="//a[@title='Delete']")
    WebElement 	deleteAddressMyAddress;


    public void createNewAccount(String email) throws InterruptedException {
        createEmailTextBox.sendKeys(email);
        Thread.sleep(2000);
        createAccountButton.click();
        Thread.sleep(5000);
    }

    public void fillSignIn(String firstname, String lastname, String company, String address1, String city,
                           String id_state, String postcode, String id_country, String phone, String alias)
            throws InterruptedException {
        //LogIn Section
        //emailTextBox.sendKeys(email);
        //Thread.sleep(2000);
        //passwordTextBox.sendKeys(pwd);
        //Thread.sleep(2000);
        //signInButton.click();
        //Thread.sleep(5000);

        //My Addresses Section
        //buttonMyAddresses.click();
        //Thread.sleep(5000);
        //buttonAddAddress.click();
        //Thread.sleep(5000);

        //Add Address Form
        firstNameMyAddress.sendKeys(firstname);
        Thread.sleep(2000);
        lastNameMyAddress.sendKeys(lastname);
        Thread.sleep(2000);
        companyMyAddress.sendKeys(company);
        Thread.sleep(2000);
        address1MyAddress.sendKeys(address1);
        Thread.sleep(2000);
        cityMyAddress.sendKeys(city);
        Thread.sleep(2000);
        id_stateMyAddress.sendKeys(id_state);
        Thread.sleep(2000);
        postcodeMyAddress.sendKeys(postcode);
        Thread.sleep(2000);
        id_countryMyAddress.sendKeys(id_country);
        Thread.sleep(2000);
        phoneMyAddress.sendKeys(phone);
        Thread.sleep(2000);
        aliasMyAddress.sendKeys(alias);
        Thread.sleep(2000);
        submitAddressMyAddress.click();
        Thread.sleep(2000);

        //Delete Address
        deleteAddressMyAddress.click();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(5000);

    }

}