package ui.tests;

import base.test.BaseTestWithoutLogin;
import business.layer.pages.HomePage;
import business.layer.pages.LoginPage;
import data.providers.LoginDataProvider;
import io.qameta.allure.Description;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import steps.BayerSteps;


public class LoginTest extends BaseTestWithoutLogin {

    HomePage homePage;
    LoginPage loginPage;

    @AfterClass
    public void logOut() {
        homePage = new HomePage(getDriver());
        homePage.clickLogoutButton();
    }

    @Test(dataProvider = "correctIncorrectLogin", dataProviderClass = LoginDataProvider.class)
    @Description("Login Test with wrong and write login, password")
    public void loginTest(String email, String pass) {
        homePage = new HomePage(getDriver());
        loginPage = new LoginPage(getDriver());
        homePage.clickLoginButton();
        loginPage.logIn(email, pass);
    }

}
