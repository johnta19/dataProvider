package base.test;

import business.layer.pages.HomePage;
import business.layer.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import properties.ConfigProperties;

import java.util.concurrent.TimeUnit;


public class baseTest {
    private WebDriver driver;
    private WebDriverWait wait;
    public static String browserName;
    private String url = "http://automationpractice.com/";

    @BeforeSuite
    public void beforeSuite() {
        ConfigProperties.getProperties();
        if(browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if(browserName.equalsIgnoreCase("opera")) {
            System.setProperty("webdriver.opera.driver", "operadriver.exe");
            driver = new OperaDriver();
        }
        else if(browserName.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
            driver = new FirefoxDriver();
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 20);

    }

        @BeforeTest
    public void goToUrl() {
        driver.get(url);
        driver.manage().window().maximize();
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWait() {
        return wait;
    }
}
