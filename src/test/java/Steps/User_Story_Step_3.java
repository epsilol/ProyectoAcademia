package Steps;


import Pages.Home_Page;
import Pages.Registration;

import java.util.concurrent.TimeUnit;

import static Test.User_Story_Tests_7.driver;

public class User_Story_Step_3 {


    public void clickSignIn(){
        Home_Page.Sign_in.click();
    }
    public void enterEmailCreated(){

        Registration.email_create.sendKeys(Registration.EMAIL_CREATE);
    }

    public void clickCreateAnAccount(){

        Registration.createAnAccountbtn.click();
    }

    public void pressMr(){

        Registration.Mrbutton.click();
    }

    public void pressMrs(){

        Registration.Mrsbutton.click();
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

    public void pressSubmitButton(){
        Home_Page.submit_button.click();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
    }

    public void verifyAlertSuccess(){

        Home_Page.alertSuccess.isDisplayed();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
    }


}

    


