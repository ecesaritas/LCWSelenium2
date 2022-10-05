package utils.driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DriverFactory {

    public static WebDriver getDriver(String driverName, WebDriver driver) {
        Properties properties = new Properties();

        try{properties.load(new FileReader("src/main/resources/test.properties"));}
        catch (IOException ignored){}

        ChromeOptions chromeOptions = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        chromeOptions.addArguments("disable-extensions");
        chromeOptions.addArguments("disable-infobars");
        return driver;
    }

}
