package listeners;

import base.test.BaseTestWIthLogIn;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class ListenersTest extends BaseTestWIthLogIn implements ITestListener {

    private static String getTestMethodName(ITestResult iTestResult) {
        return iTestResult.getMethod().getConstructorOrMethod().getName();
    }

    //text attachment for allure
    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] saveScreenshotPNG(WebDriver driver) {
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }

    //text attachment for allure
    @Attachment(value = "{0}", type = "text/plain")
    public static String saveTextLog(String massage) {
        return massage;
    }

    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println(iTestResult.getName() + " test case started");
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("The name of the testcase passed is : "+ iTestResult.getName());
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("I'm on TestFailure method " + getTestMethodName(iTestResult) + " failed");

        Object testClass = iTestResult.getInstance();
        WebDriver driver = ((BaseTestWIthLogIn) testClass).getDriver();

        if (driver instanceof WebDriver) {
            System.out.println("Screenshot captured for test case: " + getTestMethodName(iTestResult));
            saveScreenshotPNG(driver);
        }
        saveTextLog(getTestMethodName(iTestResult) + " failed and screenshot taken");
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
