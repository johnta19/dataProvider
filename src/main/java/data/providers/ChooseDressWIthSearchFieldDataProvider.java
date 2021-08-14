package data.providers;

import org.testng.annotations.DataProvider;

public class ChooseDressWIthSearchFieldDataProvider {

    @DataProvider(name = "searchSomeDress")
    public Object[][] searchSomeDress() {
        return new Object[][] {
                {"printed dress"},
                {"printed summer dress"}
        };
    }
}
