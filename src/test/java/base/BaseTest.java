package base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {

    public static WebDriver driver;


    public static WebDriver setUp(){
        String browserName="chrome";
        switch(browserName){
            case "chrome":
                driver=new ChromeDriver();
                break;
            case "firefox":
                driver=new FirefoxDriver();
                break;
            case "edge":
                driver=new EdgeDriver();
                break;
            case "safari":
                driver=new SafariDriver();
                break;
            case "headless":
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--headless");
                options.addArguments("window-size=1920,1080");
                driver = new ChromeDriver(options);
                break;
            default:
                System.out.println("Please pass the correct browser..");
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.saucedemo.com/");
        System.out.println("page opened");

        PageInitializer.initialize();
        return driver;

    }


    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
