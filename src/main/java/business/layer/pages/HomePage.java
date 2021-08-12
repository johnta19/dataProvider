package business.layer.pages;

import business.layer.ReadFileToString;
import business.layer.basePage.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class HomePage extends BasePage {

    ReadFileToString readFileToString = new ReadFileToString();

    public HomePage(WebDriver driver) {
        super(driver);
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

    public LoginPage clickLoginButton() {
        waitForElementToBeClickable(loginButton);
        loginButton.click();
        return new LoginPage(driver);
    }

    public HomePage clickLogoutButton() {
        waitForElementToBeClickable(logOutButton);
        logOutButton.click();
        return new HomePage(driver);
    }

    public HomePage inputSearchField(String item) {
        waitForElementToBeClickable(searchField);
        searchField.sendKeys(item, Keys.ENTER);
        return new HomePage(driver);
    }

    public HomePage goToMainPage() {
        waitForElementToBeClickable(mainPage);
        mainPage.click();
        return new HomePage(driver);
    }

    public HomePage clickOnPrintedDress() {
        waitForElementToBeClickable(printedDress);
        printedDress.click();
        return new HomePage(driver);
    }

    public HomePage clickOnPrintedSummerDress() {
        waitForElementToBeClickable(printedSummerDress);
        printedDress.click();
        return new HomePage(driver);
    }

    public HomePage inputSearchFieldFromFile() {
        String str;
        try {
            str = readFileToString.readFile();
            waitForElementToBeClickable(searchField);
            searchField.sendKeys(str, Keys.ENTER);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new HomePage(driver);
    }

}
