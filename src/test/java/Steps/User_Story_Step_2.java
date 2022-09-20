package Steps;


import Pages.Home_Page;

import java.util.concurrent.TimeUnit;

import static Test.User_Story_Tests_7.driver;

public class User_Story_Step_2 {

    public void dressSearch() {
        Home_Page.Search_Bar.click();
        Home_Page.Search_Bar.sendKeys("PRINTED DRESS");
        Home_Page.Submit_Button_Search_Bar.click();
    }

    public void navDresses(){

    }
    public void navTshirts(){

    }public void navWomen(){

    }


    public void gridDetails(){

    }
    public void listDetails(){

    }

}

    


