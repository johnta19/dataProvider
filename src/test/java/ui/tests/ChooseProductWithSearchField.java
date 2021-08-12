package ui.tests;

import base.test.BaseTestWIthLogIn;
import data.providers.ChooseDressWIthSearchFieldDataProvider;
import data.providers.ChooseShirtsWithSearchFieldDataProvider;
import org.testng.annotations.Test;
import steps.BayerSteps;

public class ChooseProductWithSearchField extends BaseTestWIthLogIn {


    @Test(dataProvider = "searchSomeDress", dataProviderClass = ChooseDressWIthSearchFieldDataProvider.class)
    public void addDress(String dress) {
        BayerSteps.searchProductWithLogin(dress);
    }

    @Test(dataProvider = "searchSomeShirts", dataProviderClass = ChooseShirtsWithSearchFieldDataProvider.class)
    public void addShirts(String shirts) {
        BayerSteps.searchProductWithLogin(shirts);
    }

    @Test
    public void searchItemFromFile() {
        BayerSteps.searchProductFromFileWIthLogin();
    }
}
