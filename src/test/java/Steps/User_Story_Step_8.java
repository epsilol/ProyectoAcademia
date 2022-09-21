package Steps;


import Pages.Home_Page;
import Pages.Login;
import Utilerias.Accounts;

import java.util.concurrent.TimeUnit;

import static Test.User_Story_Tests_7.driver;

public class User_Story_Step_8 {

    public void ClickContactUs(){
        Home_Page.contactUs_button.click();
    }

    public void HeadingDropDown(){
        Home_Page.HeadingDropDown.click();
    }

    public void ChooseDropDown(){
        Home_Page.chooseDropDown.click();
    }

    public void ContactUsEmail(){
        Home_Page.ContactUsEmail.click();
    }

    public void EnterEmail(){
        Login.email.sendKeys(Accounts.EMAIL);
    }

    public void CustomerServiceEnterText(){
        Home_Page.CustomerServiceEnterText.click();
    }

    public void CustomerServiceSend(){
        Home_Page.CustomerServiceSend.click();
    }
}
