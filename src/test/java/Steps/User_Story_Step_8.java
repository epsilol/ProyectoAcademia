package Steps;


import Pages.Customer_Support;
import Pages.Home_Page;
import Pages.Login;
import Utilerias.Accounts;

import java.util.concurrent.TimeUnit;

import static Test.User_Story_Tests_7.driver;

public class User_Story_Step_8 {

    public void ClickContactUs(){
        Customer_Support.contactUs_button.click();
    }

    public void HeadingDropDown(){
        Customer_Support.HeadingDropDown.click();
    }

    public void ChooseDropDown(){
        Customer_Support.chooseDropDown.click();
    }

    public void ContactUsEmail(){
        Customer_Support.ContactUsEmail.click();
    }

    public void EnterEmail(){
        Login.email.sendKeys(Accounts.EMAIL);
    }

    public void CustomerServiceEnterText(){
        Customer_Support.CustomerServiceEnterText.click();
    }

    public void CustomerServiceSend(){Customer_Support.CustomerServiceSend.click();
    }
}
