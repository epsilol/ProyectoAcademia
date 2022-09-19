package Steps;

import Pages.Home_Page;

import java.util.concurrent.TimeUnit;

import static Test.User_Story_Tests_7.driver;

public class User_Story_Step_1 {

    public void timeOutStep1(){

        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

    }

    }

    


