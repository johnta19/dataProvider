package data.providers;

import org.testng.annotations.DataProvider;

public class LoginDataProvider {
    @DataProvider(name = "correctIncorrectLogin")
    public Object[][] correctIncorrectLogin() {
        return new Object[][] {
                {"test@test.com", "testest"},
                {"test123333@test.com", "test123333"}
        };
    }
}
