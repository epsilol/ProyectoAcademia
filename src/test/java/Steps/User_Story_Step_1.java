package Steps;

import Pages.Home_Page;
import Utilerias.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import static Test.User_Story_Tests_7.driver;

public class User_Story_Step_1 {

    public void openBrowser() {
        driver.get(Utils.BASE_URL);
        Home_Page Home_Page = new Home_Page(driver);

    }

}


    


