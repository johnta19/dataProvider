package properties;

import base.test.BaseTestWIthLogIn;
import base.test.BaseTestWithoutLogin;
import ui.tests.parallel.tests.ParallelTest2;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ConfigProperties {

    static Properties prop = new Properties();
    static String projectPath = System.getProperty("user.dir");

    public static void main(String[] args) {
        getProperties();
    }

    public static void getProperties() {
        try {
            InputStream input = new FileInputStream(projectPath+"/src/main/resources/config.properties");
            prop.load(input);
            String browser = prop.getProperty("browser");
            String login = prop.getProperty("login");
            String password = prop.getProperty("password");
            System.out.println(browser);
            BaseTestWIthLogIn.browserName = browser;
            BaseTestWIthLogIn.login = login;
            BaseTestWIthLogIn.password = password;
            BaseTestWithoutLogin.browserName = browser;
            ParallelTest2.browserName = browser;
            ParallelTest2.login = login;
            ParallelTest2.password = password;
        } catch (Exception  e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();
        }
    }
}
