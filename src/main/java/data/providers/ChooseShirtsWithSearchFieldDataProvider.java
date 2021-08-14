package data.providers;

import org.testng.annotations.DataProvider;

public class ChooseShirtsWithSearchFieldDataProvider {

    @DataProvider(name = "searchSomeShirts")
    public Object[][] searchSomeShirts() {
        return new Object[][] {
                {"T SHIRTS"},
                {"t shirts"}
        };
    }
}
