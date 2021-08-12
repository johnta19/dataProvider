package ui.tests;

import base.test.BaseTestWithoutLogin;
import business.layer.pages.HomePage;
import business.layer.pages.LoginPage;
import data.providers.LoginDataProvider;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;


public class LoginTest extends BaseTestWithoutLogin {

    HomePage homePage;
    LoginPage loginPage;

    @AfterClass
    public void logOut() {
        homePage = new HomePage(getDriver(), getWait());
        homePage.clickLogoutButton();
    }

    @Test(dataProvider = "correctIncorrectLogin", dataProviderClass = LoginDataProvider.class)
    public void loginTest(String email, String pass) {
        homePage = new HomePage(getDriver(), getWait());
        loginPage = new LoginPage(getDriver(), getWait());
        homePage.clickLoginButton();
        loginPage.logIn(email, pass);
    }

}
