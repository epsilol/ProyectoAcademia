package Steps;


import Pages.Home_Page;
import Pages.Registration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static Test.User_Story_Tests_3.driver;

public class User_Story_Step_3 {


    public void clickSignIn(){
        Home_Page.Sign_in.click();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
    }
    public void enterEmailCreated(){ Registration.email_create.sendKeys(Registration.EMAIL_NEWACC);}

    public void enterPassword(){ Registration.password.sendKeys(Registration.PASSWORD);}

    public void enterWrongEmail(){ Registration.email_create.sendKeys(Registration.WRONG_EMAIL);}

    public void clickCreateAnAccount() throws InterruptedException {

        Registration.createAnAccountbtn.click();
        Thread.sleep(5000);
    }

    public void pressMr(){

        Registration.Mrbutton.click();
    }

    public void pressMrs(){

        Registration.Mrsbutton.click();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
    }

    public void enterFirstName(){

        Registration.first_name.sendKeys(Registration.FIRST_NAME);

    }

    public void enterLastName(){

        Registration.last_name.sendKeys(Registration.LAST_NAME);

    }


    public void enterDayOfBirth(){
        WebElement DropDownDay = driver.findElement(By.id("days"));
        Select select = new Select(DropDownDay);
        select.selectByValue("11");
    }

    public void enterMonthOfBirth(){
        WebElement DropDownDay = driver.findElement(By.id("months"));
        Select select = new Select(DropDownDay);
        select.selectByValue("10");
    }

    public void enterYearOfBirth(){
        WebElement DropDownDay = driver.findElement(By.id("years"));
        Select select = new Select(DropDownDay);
        select.selectByValue("1997");
    }

    public void clickNewsletter(){
        Registration.newsletter_check.click();
    }
    public void clickOffers(){
        Registration.offers_check.click();
    }

    public void enterCompany(){
        Registration.company.sendKeys(Registration.COMPANY);
    }
    public void enterAddress1() { Registration.address_1.sendKeys(Registration.ADDRESS_1);}
    public void enterAddress2() { Registration.address_2.sendKeys(Registration.ADDRESS_2);}
    public void enterCity() { Registration.city.sendKeys(Registration.CITY);}
    public void enterState(){
        WebElement DropDownDay = driver.findElement(By.id("id_state"));
        Select select = new Select(DropDownDay);
        select.selectByValue("43");
    }
    public void enterPostalCode() { Registration.post_code.sendKeys(Registration.POSTAL_CODE);}

    public void enterCountry(){
        WebElement DropDownDay = driver.findElement(By.id("id_country"));
        Select select = new Select(DropDownDay);
        select.selectByValue("21");
    }

    public void enterAddInfo() { Registration.add_Info.sendKeys(Registration.ADDINFO);}

    public void enterHomePhone(){ Registration.home_phone.sendKeys(Registration.HOME_PHONE);}

    public void enterMobilePhone(){ Registration.phone_mobile.sendKeys(Registration.MOBILE_PHONE);}

    public void enterAlias(){
        Registration.alias.clear();
        Registration.alias.sendKeys(Registration.ALIAS);}

    public void clickRegisterButton(){
        Registration.register.click();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
    }

    public void invalidMessage(){
        String expectedHeading = "Invalid email address.";

        //Storing the text of the heading in a string
        String heading = driver.findElement(By.xpath("//li[contains(text(),'Invalid email address.')]")).getText();
        if(expectedHeading.equalsIgnoreCase(heading))
            System.out.println("The expected heading is same as actual heading "+heading);
        else
            System.out.println("The expected heading doesn't match the actual heading "+heading);
    }

    public void myAccountHeader(){
        String expectedHeading = "Create an account";

        //Storing the text of the heading in a string
        String account = driver.findElement(By.xpath("//h1[contains(text(),'Create an account')]")).getText();
        if(expectedHeading.equalsIgnoreCase(account))
            System.out.println("The expected heading is same as actual heading "+account);
        else
            System.out.println("The expected heading doesn't match the actual heading "+account);
    }
    public void verifyAlertSuccess(){

        Registration.invalidEmailMsg.isDisplayed();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
    }

}

    


