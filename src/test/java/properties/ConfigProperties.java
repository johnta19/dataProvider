package properties;


import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import ui.tests.chooseProductFromMainPage;
import ui.tests.chooseProductWithSearchField;
import ui.tests.loginTest;
import base.test.baseTest;


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
            System.out.println(browser);
            loginTest.browserName = browser;
            chooseProductFromMainPage.browserName = browser;
            chooseProductWithSearchField.browserName = browser;
//            baseTest.browserName = browser;
        } catch (Exception  e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();
        }
    }
}
