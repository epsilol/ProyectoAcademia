package Steps;


import Pages.Home_Page;
import Pages.Login;
import Pages.My_Account;
import Utilerias.Accounts;
import java.util.concurrent.TimeUnit;


import static Test.User_Story_Tests_4.driver;

public class User_Story_Step_4 {


    public void ClickSignIn(){

        Home_Page.Sign_in.click();

    }

    public void ClickShopCart(){

        My_Account.shopping_cart.click();

    }

    public void EnterUser(){
        Login.email.sendKeys(Accounts.EMAIL);
    }

    public void EnterWrongUser(){
        Login.email.sendKeys(Accounts.WRONG_EMAIL1);
        System.out.println("Wrong Email");
    }

    public void EnterUserNoAccount(){
        Login.email.sendKeys(Accounts.EMAIL_NO_ACCOUNT);
        System.out.println("Email with no account");
    }

    public void CheckWrongMail(){
        Login.mail_error_not.isDisplayed();
    }

    public void CheckMailOk(){
        Login.mail_ok_not.isDisplayed();
        System.out.println("Email correct");
    }

    public void MailErrorMessage(){
        Login.invalid_mail_not.isDisplayed();
    }

    public void NoAddressMessage(){
        Login.email_address_required.isDisplayed();
    }

    public void EnterPassword(){
        Login.password.sendKeys(Accounts.PASSWORD);
    }

    public void EnterPasswordNoAccount(){
        Login.password.sendKeys(Accounts.PASSWORD_NO_ACCOUNT);
    }

    public void EnterWrongPassword(){
        Login.password.sendKeys(Accounts.WRONG_PASS1);
        System.out.println("Wrong Password");
    }

    public void PassErrorMessage(){
        Login.invalid_pass_not.isDisplayed();
    }

    public void NoPassMessage(){
        Login.password_required.isDisplayed();
    }

    public void AuthFailed(){
        Login.authentication_failed.isDisplayed();
    }

    public void SubmitButton(){
        Login.submit_button.click();
    }
}

    


