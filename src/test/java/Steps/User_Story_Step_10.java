package Steps;


import Pages.Home_Page;
import Pages.Login;
import Pages.My_Account;
import Pages.Registration;
import Utilerias.Accounts;



import java.util.concurrent.TimeUnit;

import static Test.User_Story_Tests_10.driver;

public class User_Story_Step_10 {



    public void ClickSignIn(){
        Home_Page.Sign_in.click();
    }

    public void EnterUser(){
        Login.email.sendKeys(Accounts.EMAIL);
    }

    public void EnterPassword(){
        Login.password.sendKeys(Accounts.PASSWORD);
    }

    public void pressSubmitButton(){
        Login.submit_button.click();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
    }

    public void ClickSignOut(){
        My_Account.signOut_button.click();
    }

    public void verifyAlertSuccess(){

        Home_Page.alertSuccess.isDisplayed();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
    }


}

    


