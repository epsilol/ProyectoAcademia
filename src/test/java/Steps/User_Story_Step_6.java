package Steps;


import Pages.AddMyAddress_Page;
import Pages.Home_Page;
import Pages.Login;
import Utilerias.Accounts;
import Utilerias.AddMyAddressForm;
import org.openqa.selenium.WebDriver;
public class User_Story_Step_6 {

    final WebDriver driver;

    public User_Story_Step_6(WebDriver driver) {
        this.driver=driver;
    }
    public void ClickSignIn(){

        Home_Page.Sign_in.click();

    }
    public void EnterUser(){
        Login.email.sendKeys(Accounts.EMAIL);
    }
    public void EnterPassword() { Login.password.sendKeys(Accounts.PASSWORD); }
    public void EnterSubmit(){
        Login.submit_button.click();
    }
    public void EnterMyAdresses(){AddMyAddress_Page.buttonMyAddresses.click(); }
    public void EnterAddMyAdresses(){AddMyAddress_Page.buttonAddAddress.click(); }
    public void EnterFirstNameMyAddress(){AddMyAddress_Page.firstNameMyAddress.sendKeys(AddMyAddressForm.FIRST_NAME); }
    public void EnterLastNameMyAddress(){AddMyAddress_Page.lastNameMyAddress.sendKeys(AddMyAddressForm.LAST_NAME); }
    public void EnterCompanyMyAddress(){AddMyAddress_Page.companyMyAddress.sendKeys(AddMyAddressForm.COMPANY); }
    public void EnterAddressMyAddress(){AddMyAddress_Page.address1MyAddress.sendKeys(AddMyAddressForm.ADDRESS); }
    public void EnterCityMyAddress(){AddMyAddress_Page.cityMyAddress.sendKeys(AddMyAddressForm.CITY); }
    public void EnterStateMyAddress(){AddMyAddress_Page.id_stateMyAddress.sendKeys(AddMyAddressForm.STATE); }
    public void EnterZipcodeMyAddress(){AddMyAddress_Page.postcodeMyAddress.sendKeys(AddMyAddressForm.ZIPCODE); }
    public void EnterCountryMyAddress(){AddMyAddress_Page.id_countryMyAddress.sendKeys(AddMyAddressForm.COUNTRY); }
    public void EnterPhoneMyAddress(){AddMyAddress_Page.phoneMyAddress.sendKeys(AddMyAddressForm.HOME_PHONE); }
    public void EnterMobilePhoneMyAddress(){AddMyAddress_Page.phoneMobileAddress.sendKeys(AddMyAddressForm.MOBILE_PHONE); }
    public void EnterAliasMyAddress(){AddMyAddress_Page.aliasMyAddress.sendKeys(AddMyAddressForm.ALIAS); }
    public void EnterSubmitMyAddress(){AddMyAddress_Page.submitAddressMyAddress.click(); }
    public void DeleteMyAddress(){AddMyAddress_Page.deleteAddressMyAddress.click(); }


}