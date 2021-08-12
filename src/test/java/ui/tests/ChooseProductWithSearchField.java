package ui.tests;

import base.test.BaseTestWIthLogIn;
import business.layer.pages.HomePage;
import data.providers.ChooseDressWIthSearchFieldDataProvider;
import data.providers.ChooseShirtsWithSearchFieldDataProvider;
import org.testng.annotations.Test;

public class ChooseProductWithSearchField extends BaseTestWIthLogIn {

    HomePage homePage;

    @Test(dataProvider = "searchSomeDress", dataProviderClass = ChooseDressWIthSearchFieldDataProvider.class)
    public void addDress(String dress) {
        homePage = new HomePage(getDriver());
        homePage.goToMainPage();
        homePage.inputSearchField(dress);
    }

    @Test(dataProvider = "searchSomeShirts", dataProviderClass = ChooseShirtsWithSearchFieldDataProvider.class)
    public void addShirts(String shirts) {
        homePage = new HomePage(getDriver());
        homePage.goToMainPage();
        homePage.inputSearchField(shirts);
    }

    @Test
    public void searchItemFromFile() {
        homePage = new HomePage(getDriver());
        homePage.goToMainPage();
        homePage.inputSearchFieldFromFile();
    }
}
