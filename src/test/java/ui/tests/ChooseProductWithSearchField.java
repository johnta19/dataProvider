package ui.tests;

import base.test.BaseTestWIthLogIn;
import data.providers.ChooseDressWIthSearchFieldDataProvider;
import data.providers.ChooseShirtsWithSearchFieldDataProvider;
import io.qameta.allure.Description;
import listeners.ListenersTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import steps.BayerSteps;

@Listeners({ListenersTest.class})
public class ChooseProductWithSearchField extends BaseTestWIthLogIn {


    @Test(dataProvider = "searchSomeDress", dataProviderClass = ChooseDressWIthSearchFieldDataProvider.class)
    @Description("Choose some product from data provider(printed dress, printed summer dress) with search field")
    public void addDress(String dress) {
        BayerSteps.searchProductWithLogin(dress);
    }

    @Test(dataProvider = "searchSomeShirts", dataProviderClass = ChooseShirtsWithSearchFieldDataProvider.class)
    @Description("Choose some product from data provider(T SHIRTS, t shirts) with search field")
    public void addShirts(String shirts) {
        BayerSteps.searchProductWithLogin(shirts);
    }

    @Test
    @Description("Chose some product(blue dress) from file searchItem")
    public void searchItemFromFile() {
        BayerSteps.searchProductFromFileWIthLogin();
    }
}
