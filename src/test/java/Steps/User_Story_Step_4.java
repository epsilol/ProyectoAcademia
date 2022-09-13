package Steps;


import Pages.Home_Page;

import java.util.concurrent.TimeUnit;

import static Test.User_Story_Tests_7.driver;

public class User_Story_Step_4 {




    public void enterFirstName(){

        Home_Page.first_name.sendKeys(Home_Page.FIRST_NAME);

    }

    public void enterLastName(){

        Home_Page.last_name.sendKeys(Home_Page.LAST_NAME);

    }

    public void enterJobTitle(){

        Home_Page.job_title.sendKeys(Home_Page.JOB_TITLE);

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

    


