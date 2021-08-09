package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    WebDriver driver;
    WebDriverWait wait;

    public HomePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "login")
    private WebElement loginButton;

    @FindBy(id = "search_query_top")
    private WebElement searchField;

    @FindBy(className = "logout")
    private WebElement logOutButton;

    @FindBy(id = "header_logo")
    private WebElement mainPage;

    @FindBy(xpath = "//*[@id=\"homefeatured\"]/li[3]/div/div[2]/h5/a")
    private WebElement printedDress;

    @FindBy(xpath = "//*[@id=\"homefeatured\"]/li[5]/div/div[2]/h5/a")
    private WebElement printedSummerDress;

    public void clickLoginButton() {
        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
    }

    public void clickLogoutButton() {
        wait.until(ExpectedConditions.elementToBeClickable(logOutButton)).click();
    }

    public void inputSearchField(String item) {
        wait.until(ExpectedConditions.elementToBeClickable(searchField)).click();
        searchField.sendKeys(item, Keys.ENTER);
    }

    public void goToMainPage() {
        wait.until(ExpectedConditions.elementToBeClickable(mainPage)).click();
    }

    public void clickOnPrintedDress() {
        wait.until(ExpectedConditions.elementToBeClickable(printedDress)).click();
    }

    public void clickOnPrintedSummerDress() {
        wait.until(ExpectedConditions.elementToBeClickable(printedSummerDress)).click();
    }
}
