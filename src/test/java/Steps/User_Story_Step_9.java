package Steps;


import Pages.Compare_Products_Page;
import Pages.Home_Page;
import org.apache.maven.model.Reporting;

public class User_Story_Step_9 {

    public void SearchProduct() throws InterruptedException {
       Home_Page.Search_Bar.click();
        Home_Page.Search_Bar.sendKeys("Dress");
        Home_Page.Submit_Button_Search_Bar.click();
        Compare_Products_Page.ButtonAddCompare1.click();
        Thread.sleep(10000);
        Compare_Products_Page.ButtonAddCompare2.click();
        Thread.sleep(5000);
        Compare_Products_Page.ButtonPageCompare.click();
        Thread.sleep(7000);
    }

    public void DeleteProduct() {
        Compare_Products_Page.Delete_Button.click();
    }

    public void ShareProduct() {
        Compare_Products_Page.Twitter_Share.click();
    }



}
