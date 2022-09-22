package Steps;


import Pages.Compare_Productos_Page;
import Pages.Customer_Support;
import Pages.Login;
import Utilerias.Accounts;

public class User_Story_Step_9 {

    public void SearchProduct(){
        Compare_Productos_Page.Search_Bar.click();
        Compare_Productos_Page.Search_Bar.sendKeys("Dress");
        Compare_Productos_Page.Submit_Button_Search_Bar.click();
    }

}
