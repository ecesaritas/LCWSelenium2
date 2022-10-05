package utils.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Driver {

    public static WebDriver driver;

    public void initiliaze(){
        driver = DriverFactory.getDriver("chrome", driver);
    }

    public void terminate(){
        driver.quit();
    }

}
