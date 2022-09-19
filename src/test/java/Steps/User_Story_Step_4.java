package Steps;


import Pages.Home_Page;
import Pages.Login;
import Utilerias.Accounts;


import static Test.User_Story_Tests_4.driver;

public class User_Story_Step_4 {

        // prueba de la prueba


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
}

    


