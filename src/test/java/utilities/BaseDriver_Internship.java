package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Parent;

public class BaseDriver_Internship {
    public static WebDriver driver;
    public static WebDriver getDriver(){


        if(driver==null){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();}

        return driver;

    }


    public static void DriverQuit(){

        Parent.Wait(2);

        if(driver!=null)
        {

            driver.quit();
            driver=null;
        }

    }
}