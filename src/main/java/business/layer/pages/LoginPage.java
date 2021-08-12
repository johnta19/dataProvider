package business.layer.pages;

import business.layer.basePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "email")
    private WebElement login;

    @FindBy(id = "passwd")
    private WebElement pass;

    @FindBy(id = "SubmitLogin")
    private WebElement submitLogin;

    public void logIn(String email, String password) {
        waitForElementToBeClickable(login);
        login.sendKeys(email);
        waitForElementToBeClickable(pass);
        pass.sendKeys(password);
        waitForElementToBeClickable(submitLogin);
        submitLogin.click();
    }
}
