package com.extentereport.listener;

import com.aventstack.extentreports.ExtentTest;


/**
 * @description:
 * @author:yang
 * @time:2023/2/10 16:15
 */
public class MyReporter {
    public static ExtentTest report;
    private static String testName;

    public static String getTestName() {
        return testName;
    }

    public static void setTestName(String testName) {
        MyReporter.testName = testName;
    }

}
