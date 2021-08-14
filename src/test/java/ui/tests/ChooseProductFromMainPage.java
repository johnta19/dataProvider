package ui.tests;

import base.test.BaseTestWIthLogIn;
import business.layer.pages.HomePage;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import steps.BayerSteps;

public class ChooseProductFromMainPage extends BaseTestWIthLogIn {

    @Test
    @Description("Choose printed dress from main page")
    public void choosePrintedDress() {
        BayerSteps.choosePrintedDressOnMainPage();
    }

    @Test
    @Description("Choose printed summer dress from main page")
    public void choosePrintedSummerDress() {
        BayerSteps.choosePrintedSummerDressOnMainPage();
    }
}
