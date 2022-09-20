package Steps;


import Pages.Home_Page;

import java.util.concurrent.TimeUnit;

import static Test.User_Story_Tests_7.driver;

public class User_Story_Step_2 {

    public void enterFirstName(){

        Home_Page.first_name.sendKeys(Home_Page.FIRST_NAME);

    }

    public void dressSearch() throws InterruptedException {

        Home_Page.Search_Bar.click();
        Thread.sleep(5000);
        Home_Page.Search_Bar.sendKeys("PRINTED DRESS");

        Home_Page.Submit_Button_Search_Bar.click();



    }

    public void pressSubmitButton(){
        Home_Page.submit_button.click();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
    }



}

    


