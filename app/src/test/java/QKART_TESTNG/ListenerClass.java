package QKART_TESTNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener {
    // public void onStart(ITestContext context) {
    //     System.out.println("onStart method started");
    // }

    // public void onFinish(ITestContext context) {
    //     System.out.println("onFinish method started");
    // }

    public void onTestStart(ITestResult result) {
        QKART_Tests.takeScreenshot(QKART_Tests.driver, "Start", result.getName());
    }

    //When test case ends ==> 2 scenarios i.e., test success and test fail
    public void onTestSuccess(ITestResult result) {
        QKART_Tests.takeScreenshot(QKART_Tests.driver, "Success", result.getName());

    }

    public void onTestFailure(ITestResult result) {
        QKART_Tests.takeScreenshot(QKART_Tests.driver, "Failure", result.getName());

    }

    // public void onTestSkipped(ITestResult result) {
    //     System.out.println("onTestSkipped Method" +result.getName());
    // }

    // public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    //     System.out.println("onTestFailedButWithinSuccessPercentage" +result.getName());
    // }
}
