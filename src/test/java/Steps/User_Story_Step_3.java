package Steps;


import Pages.Home_Page;
import Pages.Registration;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static Test.User_Story_Tests_3.driver;

public class User_Story_Step_3 {


    public void clickSignIn(){
        Home_Page.Sign_in.click();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
    }
    public void enterEmailCreated(){

        Registration.email_create.sendKeys(Registration.EMAIL_NEWACC);
    }

    public void clickCreateAnAccount(){

        Registration.createAnAccountbtn.click();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
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

    public void enterEmail(){

        Registration.email_user.sendKeys(Registration.EMAIL);

    }

    public void enterPassword(){
        Registration.password.sendKeys(Registration.PASSWORD);
    }

    public void enterDayOfBirth(){
      //  Registration.day.sendKeys(Registration.DAY);
        Select drpDay = new Select(driver.findElement(By.id("days")));
        drpDay.selectByVisibleText("11");
        drpDay.selectByIndex(11);
    }

    public void enterMonthOfBirth(){
        Registration.month.sendKeys(Registration.MONTH);
    }

    public void enterYearOfBirth(){
        Registration.year.sendKeys(Registration.YEAR);
    }

    public void clickNewsletter(){
        Registration.newsletter_check.click();
    }
    public void clickOffers(){
        Registration.offers_check.click();
    }

    public void enterCompany(){
        Registration.year.sendKeys(Registration.YEAR);
    }
    public void enterAddress1() { Registration.address_1.sendKeys(Registration.ADDRESS_1);}
    public void enterAddress2() { Registration.address_2.sendKeys(Registration.ADDRESS_2);}
    public void enterCity() { Registration.city.sendKeys(Registration.CITY);}

    //state dropdown
    public void enterPostalCode() { Registration.post_code.sendKeys(Registration.POSTAL_CODE);}
    //country dropdown
    public void enterAddInfo() { Registration.add_Info.sendKeys(Registration.ADDINFO);}

    public void pressSubmitButton(){
        Home_Page.submit_button.click();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
    }

    public void verifyAlertSuccess(){

        Home_Page.alertSuccess.isDisplayed();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
    }

}

    


