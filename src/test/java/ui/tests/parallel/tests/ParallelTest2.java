package ui.tests.parallel.tests;

import business.layer.pages.HomePage;
import business.layer.pages.LoginPage;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import properties.ConfigProperties;

import java.util.concurrent.TimeUnit;

public class ParallelTest2 {

    private WebDriver driver;
    private WebDriverWait wait;
    private HomePage homePage;
    private LoginPage loginPage;
    public static String browserName;
    public static String login;
    public static String password;
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
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
    }

    @BeforeTest
    public void goToUrl() {
        driver.get(url);
        driver.manage().window().maximize();
    }

    @BeforeClass
    public void logIn() {
        homePage.clickLoginButton();
        loginPage.logIn(login, password);
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
    @Description("Parallel Test  Choose printed dress from main page")
    public void addPrintedDress() {
        homePage.goToMainPage();
        homePage.clickOnPrintedDress();
    }

}