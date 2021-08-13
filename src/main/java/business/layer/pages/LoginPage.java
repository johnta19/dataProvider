package business.layer.pages;

import business.layer.basePage.BasePage;
import io.qameta.allure.Step;
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

    @Step("Log in step with username {0}, password {1}")
    public HomePage logIn(String email, String password) {
        waitForElementToBeClickable(login);
        login.sendKeys(email);
        waitForElementToBeClickable(pass);
        pass.sendKeys(password);
        waitForElementToBeClickable(submitLogin);
        submitLogin.click();
        return new HomePage(driver);
    }
}
