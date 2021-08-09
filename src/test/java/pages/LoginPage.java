package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    WebDriver driver;
    WebDriverWait wait;

    public LoginPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "email")
    private WebElement login;

    @FindBy(id = "passwd")
    private WebElement pass;

    @FindBy(id = "SubmitLogin")
    private WebElement submitLogin;

    public void logIn(String email, String password) {
        wait.until(ExpectedConditions.elementToBeClickable(login)).click();
        login.sendKeys(email);
        wait.until(ExpectedConditions.elementToBeClickable(pass)).click();
        pass.sendKeys(password);
        wait.until(ExpectedConditions.elementToBeClickable(submitLogin)).click();
    }
}
