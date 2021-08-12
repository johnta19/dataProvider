package base.test;

import business.layer.pages.HomePage;
import business.layer.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import properties.ConfigProperties;

import java.util.concurrent.TimeUnit;


public class baseTestWIthLogIn {
    private WebDriver driver;
    private WebDriverWait wait;
    private HomePage homePage;
    private LoginPage loginPage;
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

    @BeforeClass
    public void logIn() {
        homePage = new HomePage(getDriver(), getWait());
        loginPage = new LoginPage(getDriver(), getWait());
        homePage.clickLoginButton();
        loginPage.logIn("test123333@test.com", "test123333");
    }
    @AfterClass
    public void logOoout() {
        homePage = new HomePage(getDriver(), getWait());
        homePage.clickLogoutButton();
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
