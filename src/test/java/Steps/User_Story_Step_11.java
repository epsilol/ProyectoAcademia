package Steps;


import Pages.Home_Page;
import Pages.Login;
import Pages.My_Account;
import Pages.Personal_Information;
import Utilerias.Accounts;

import java.util.concurrent.TimeUnit;

import static Test.User_Story_Tests_11.driver;

public class User_Story_Step_11 {

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

    public void ClickMyPersonalInfo(){
        My_Account.personal_info.click();
    }

    public void addPasswordToSave(){
        Personal_Information.old_password.sendKeys(Accounts.PASSWORD);
    }

    public void clickOnSaveChanges(){
        Personal_Information.save_info.click();
    }

    public void editUserEmail(){
        Personal_Information.e_mail.clear();
        Personal_Information.e_mail.sendKeys(Personal_Information.NEW_MAIL);
    }

    public void editUserLastName(){
        Personal_Information.last_name.sendKeys(Personal_Information.NEW_LAST_NAME);
    }
    public void editUserDayBirth(){
        Personal_Information.days.sendKeys(Personal_Information.NEW_DAY);
    }

    public void editUserMonthBirth(){
        Personal_Information.months.sendKeys(Personal_Information.NEW_MONTH);
    }

    public void editUserYearBirth(){
        Personal_Information.years.sendKeys(Personal_Information.NEW_YEAR);
    }

    public void editUserName(){
        Personal_Information.first_name.sendKeys(Personal_Information.NEW_FIRST_NAME);
    }

}

    


