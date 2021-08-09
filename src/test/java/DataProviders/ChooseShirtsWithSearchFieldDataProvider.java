package DataProviders;

import org.testng.annotations.DataProvider;

public class ChooseShirtsWithSearchFieldDataProvider {

    @DataProvider(name = "searchSomeShirts")
    public Object[][] searchSomeDress() {
        return new Object[][] {
                {"T SHIRTS"},
                {"t shirts"}
        };
    }
}
