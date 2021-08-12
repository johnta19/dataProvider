package ui.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import business.layer.pages.HomePage;
import business.layer.pages.LoginPage;
import properties.ConfigProperties;

import java.util.concurrent.TimeUnit;

public class chooseProductFromMainPage {

    WebDriver driver;
    public static String browserName;
    WebDriverWait wait;
    HomePage homePage;
    LoginPage loginPage;
    private String url = "http://automationpractice.com/";

    @BeforeSuite
    public void setUp() {
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
        homePage = new HomePage(driver, wait);
        loginPage = new LoginPage(driver, wait);
    }

    @BeforeTest
    public void goToUrl() {
        driver.get(url);
        driver.manage().window().maximize();
    }

    @BeforeClass
    public void logIn() {
        homePage.clickLoginButton();
        loginPage.logIn("test123333@test.com", "test123333");
    }

    @AfterClass
    public void logOut() {
        homePage.clickLogoutButton();
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }

    @Test
    public void addPrintedDress() {
        homePage.goToMainPage();
        homePage.clickOnPrintedDress();
    }

    @Test
    public void addPrintedSummerDress() {
        homePage.goToMainPage();
        homePage.clickOnPrintedSummerDress();
    }
}
