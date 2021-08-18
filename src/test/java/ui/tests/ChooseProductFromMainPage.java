package ui.tests;

import base.test.BaseTestWIthLogIn;
import io.qameta.allure.Description;
import listeners.ListenersTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import steps.BayerSteps;

@Listeners({ListenersTest.class})
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
