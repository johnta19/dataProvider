package ui.tests;

import base.test.BaseTestWIthLogIn;
import business.layer.pages.HomePage;
import org.testng.annotations.Test;
import steps.BayerSteps;

public class ChooseProductFromMainPage extends BaseTestWIthLogIn {

    @Test
    public void choosePrintedDress() {
        BayerSteps.choosePrintedDressOnMainPage();
    }

    @Test
    public void choosePrintedSummerDress() {
        BayerSteps.choosePrintedSummerDressOnMainPage();
    }
}
