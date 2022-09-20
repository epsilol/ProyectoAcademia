package Steps;

import Pages.Shopping_Cart;
import Pages.Home_Page;
import Pages.Login;
import Test.User_Story_Tests_7;
import Utilerias.Accounts;

import java.util.concurrent.TimeUnit;

import static Test.User_Story_Tests_7.driver;

public class User_Story_Step_7 {




    public void ClickSignIn(){

        Home_Page.Sign_in.click();


    }

    public void EnterUser(){
        Login.email.sendKeys(Accounts.EMAIL);
    }


    public void EnterPassword(){
        Login.password.sendKeys(Accounts.PASSWORD);
    }

    public void SubmitButton(){
        Login.submit_button.click();
    }


    public void AddtoCart(){
        Home_Page.Add_to_cart.click();
    }

    public void clickAddCart(){
        User_Story_Tests_7.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Shopping_Cart.AddItem.click();

    }

    //click on homepage logO button

    public void clickLogo(){
        Login.Logo.click();
    }



}

    


