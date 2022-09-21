package Steps;

import Pages.Shopping_Cart;
import Pages.Checkout;
import Pages.Home_Page;
import Pages.Login;
import Test.User_Story_Tests_7;
import Utilerias.Accounts;
import org.junit.Assert.*;
import org.hamcrest.CoreMatchers.*;

import java.util.concurrent.TimeUnit;

import static Test.User_Story_Tests_7.driver;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

public class User_Story_Step_7 {




    public void ClickSignIn(){

        Home_Page.Sign_in.click();


    }

    public void EnterUser(){
        Login.email.sendKeys(Accounts.EMAIL);
    }


    public void EnterPassword(){
        Login.password.sendKeys(Accounts.PASSWORD);
    }

    public void SubmitButton(){
        Login.submit_button.click();
    }


    public void AddtoCart(){
        Home_Page.Add_to_cart.click();
    }

    public void clickAddCart(){
        User_Story_Tests_7.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Shopping_Cart.AddItem.click();

    }

    //click on homepage logO button

    public void clickLogo(){
        Login.Logo.click();
    }

    //click on shopping cart button
    public void clickShoppingCart(){
        Checkout.Cart.click();
    }
    public void clickShoppingCart2(){
        Checkout.Cart2.click();
    }

    //click on proceed to checkout summary button
    public void clickProceedToCheckoutSummary(){
        Checkout.Proceed_to_checkout_summary.click();
    }

    //click on proceed to checkout address button
    public void clickProceedToCheckoutAddress(){
        Checkout.Proceed_to_checkout_address.click();
    }

    //click on proceed to checkout shipping button
    public void clickProceedToCheckoutShipping(){
        Checkout.Proceed_to_checkout_shipping.click();
    }

    //click on proceed to checkout payment button
    public void clickProceedToCheckoutPayment(){
        Checkout.Proceed_to_checkout_payment.click();
    }

    //click on proceed to checkout confirm order button
    public void ClickTermsAndConditions(){
        Checkout.Checkbox.click();
    }

    //send keys to email address field
    public void sendKeysToEmailAddress(){
        Checkout.Email2.sendKeys(Accounts.EMAIL);
    }

    //send keys to password field
    public void sendKeysToPassword(){
        Checkout.Password2.sendKeys(Accounts.PASSWORD);
    }

    //click on submit login button
    public void clickSubmitLogin2(){
        Checkout.SubmitLogin2.click();
    }

   //click on dropdown addresses
   public void clickDropdownAddresses(){
       Checkout.Dropdown_addresses.click();
   }

   //click on dropdown value 2
    public void clickDropdownAddressesValue2(){
         Checkout.Dropdown_addresses2.click();
    }

    //click on continue shopping button
    public void clickContinueShopping(){
        Checkout.Continue_shopping.click();
    }


    //assert Shopping_cart_number_of_products != 0;
    public void assertShoppingCartNumberProducts(){
             assertThat(Checkout.Shopping_cart_number_of_products.getText(), is(not(0)));
    }


}

    


