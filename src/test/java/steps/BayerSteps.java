package steps;

import base.test.BaseTestWIthLogIn;
import business.layer.pages.HomePage;
import business.layer.pages.LoginPage;

public class BayerSteps extends BaseTestWIthLogIn {
    private static HomePage homePage = new HomePage(getDriver());
    private static LoginPage loginPage = new LoginPage(getDriver());

    public static HomePage searchProductWithLogin(String item) {
        return homePage.goToMainPage().inputSearchField(item);
    }

    public static HomePage searchProductFromFileWIthLogin() {
        return homePage.goToMainPage().inputSearchFieldFromFile();
    }

    public static HomePage choosePrintedDressOnMainPage() {
        return homePage.goToMainPage().clickOnPrintedDress();
    }

    public static HomePage choosePrintedSummerDressOnMainPage() {
        return homePage.goToMainPage().clickOnPrintedSummerDress();
    }

    public static HomePage writeWrongLoginTest(String email, String pass) {
        return homePage.clickLoginButton().logIn(email, pass);
    }
}
