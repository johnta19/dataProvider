package ui.tests.parallel.tests;

import base.test.BaseTestWIthLogIn;
import business.layer.pages.HomePage;
import io.qameta.allure.Description;
import org.testng.annotations.*;

public class ParallelTest extends BaseTestWIthLogIn {

    @Test
    @Description("Parallel Test  Choose printed summer dress from main page")
    public void addPrintedSummerDress() {
        HomePage homePage = new HomePage(getDriver());
        homePage.goToMainPage();
        homePage.clickOnPrintedSummerDress();
    }
}
