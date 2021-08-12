package ui.tests;

import base.test.BaseTestWIthLogIn;
import business.layer.pages.HomePage;
import org.testng.annotations.Test;

public class ChooseProductFromMainPage extends BaseTestWIthLogIn {

    HomePage homePage;

    @Test
    public void addPrintedDress() {
        homePage = new HomePage(getDriver());
        homePage.goToMainPage();
        homePage.clickOnPrintedDress();
    }

    @Test
    public void addPrintedSummerDress() {
        homePage = new HomePage(getDriver());
        homePage.goToMainPage();
        homePage.clickOnPrintedSummerDress();
    }
}
