package Steps;


import Pages.Home_Page;
import Pages.Search_Page;

import java.util.concurrent.TimeUnit;

import static Test.User_Story_Tests_7.driver;

public class User_Story_Step_2 {

    public void dressSearch() {
        Home_Page.Search_Bar.click();
        Home_Page.Search_Bar.sendKeys("PRINTED DRESS");
        Home_Page.Submit_Button_Search_Bar.click();
    }

    public void navDresses() throws InterruptedException {
        Home_Page.Dresses_Button.click();
        Thread.sleep(5000);
        Home_Page.Logo.click();
    }
    public void navT_shirts() throws InterruptedException {
        Home_Page.T_shirt_Button.click();
        Thread.sleep(5000);
        Home_Page.Logo.click();
    }
    public void navWomen() throws InterruptedException {
        Home_Page.Women_Button.click();
        Thread.sleep(5000);
        Home_Page.Logo.click();
    }


    public void gridDetails()throws InterruptedException{
        Thread.sleep(1000);
        Search_Page.Grid_Button.click();
    }
    public void listDetails() throws InterruptedException {
        Thread.sleep(1000);
        Search_Page.List_Button.click();
    }

}

    


