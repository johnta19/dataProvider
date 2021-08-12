package ui.tests.parallelTests;

import base.test.BaseTestWIthLogIn;
import business.layer.pages.HomePage;
import org.testng.annotations.*;

public class ParallelTest extends BaseTestWIthLogIn {

    @Test
    public void addPrintedSummerDress() {
        HomePage homePage = new HomePage(getDriver(), getWait());
        homePage.goToMainPage();
        homePage.clickOnPrintedSummerDress();
    }
}
