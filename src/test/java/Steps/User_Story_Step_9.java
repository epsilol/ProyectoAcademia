package Steps;


import Pages.Compare_Products_Page;
import Pages.Customer_Support;
import Pages.Home_Page;
import Pages.Login;
import Utilerias.Accounts;

import java.util.concurrent.TimeUnit;

import static Test.User_Story_Tests_5.driver;

public class User_Story_Step_9 {

    public void SearchProduct() {
        Compare_Products_Page.Search_Bar.click();
        Compare_Products_Page.Search_Bar.sendKeys("Dress");
        Compare_Products_Page.Submit_Button_Search_Bar.click();
        Compare_Products_Page.ButtonAddCompare1.click();
    }

    public void DeleteProduct() {
        Compare_Products_Page.Delete_Button.click();
    }

    public void ShareProduct() {
        Compare_Products_Page.Twitter_Share.click();
    }



}
