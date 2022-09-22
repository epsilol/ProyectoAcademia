package Steps;


import Pages.Shopping_Cart;
import java.util.concurrent.TimeUnit;

import static Test.User_Story_Tests_5.driver;

public class User_Story_Step_5 {

    public void clickLogo(){
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        Shopping_Cart.Logo.click();
    }
    public void clickButtonCart(){
        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
        Shopping_Cart.buttonCart.click();

    }

    public void addItem(){
        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
        Shopping_Cart.AddItem.click();
    }

    public void DetailsItem2(){
        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
        Shopping_Cart.AddItem2.click();
    }

    public void DetailsItem3(){
        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
        Shopping_Cart.AddItem3.click();
    }
    public void ButtonCardItems(){
        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
        Shopping_Cart.ButtonAddCartDetails.click();
    }



    public void verityAlertSuccess(){
        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
        Shopping_Cart.Overlayer.isDisplayed();
        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
        Shopping_Cart.AlertSuccess.isDisplayed();
        driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
    }
    public void closeModalSuccess(){
        driver.manage().timeouts().implicitlyWait(130,TimeUnit.SECONDS);
        Shopping_Cart.CloseModalButton.click();
    }


    public void buttonDelete(){
        driver.manage().timeouts().implicitlyWait(130,TimeUnit.SECONDS);
        Shopping_Cart.buttonDelete.click();
    }

    public void addQuantity(){

        driver.manage().timeouts().implicitlyWait(130,TimeUnit.SECONDS);
        Shopping_Cart.buttonQuantityUp.click();
    }

    public void downQuantity(){
        driver.manage().timeouts().implicitlyWait(130,TimeUnit.SECONDS);
        Shopping_Cart.buttonQuantityDown.click();
    }



}

    


