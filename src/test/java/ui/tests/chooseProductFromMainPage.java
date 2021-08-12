package ui.tests;

import base.test.baseTestWIthLogIn;
import business.layer.pages.HomePage;
import org.testng.annotations.Test;

public class chooseProductFromMainPage extends baseTestWIthLogIn {

    HomePage homePage;

    @Test
    public void addPrintedDress() {
        homePage = new HomePage(getDriver(), getWait());
        homePage.goToMainPage();
        homePage.clickOnPrintedDress();
    }

    @Test
    public void addPrintedSummerDress() {
        homePage = new HomePage(getDriver(), getWait());
        homePage.goToMainPage();
        homePage.clickOnPrintedSummerDress();
    }
}
