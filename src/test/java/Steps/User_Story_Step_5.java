package Steps;


import Pages.Shopping_Cart;
import java.util.concurrent.TimeUnit;

import static Test.User_Story_Tests_5.driver;

public class User_Story_Step_5 {

    public void clickButtonCart(){
        Shopping_Cart.buttonCart.click();
        driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
    }

    public void addItem(){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Shopping_Cart.AddItem.click();

    }

    public void verityAlertSuccess(){
        driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
        Shopping_Cart.AlertSuccess.isDisplayed();

    }




}

    


