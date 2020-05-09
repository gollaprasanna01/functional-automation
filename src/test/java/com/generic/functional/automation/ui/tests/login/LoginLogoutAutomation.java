package com.generic.functional.automation.ui.tests.login;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ExtentHtmlReporterConfiguration;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.generic.functional.automation.ui.tests.common.TestConfig;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;


public class LoginLogoutAutomation extends TestConfig {


    @Test
    public void btnShadowTest() throws Exception {

        test = extent.createTest("Button Test",
                "Verifying Button Shadow");
        test.createNode("ImagePresentYes");
        WebElement btn = driver.findElement(By.xpath("//div[@id='gatsby-focus-wrapper']/div/main/div/main/div/form/button"));

        // 1. Button style
        String style = btn.getAttribute("style");
        if (style.contains("box-shadow: rgba(255, 105, 135, 0.3)")) {
            // Fail it because the style is not valid.
            System.out.println("==> " + style);
            System.err.println("Style is not what we desired.");
        }
    }

    @Test
    public void testLogin() throws Exception {
        test = extent.createTest("Button Test",
                "Verifying Button Shadow");
        login.doLogin(driver, test);
    }


    @Test
    public void testLoginElementsAndLogout() throws Exception {
        driver.findElement(By.xpath("//*[text()='Data Studio']"));
        driver.findElement(By.xpath("//*[text()='Articulator']"));
        driver.findElement(By.xpath("//*[text()='Cluster Studio']"));
        driver.findElement(By.xpath("//*[text()='Entitles']"));
        driver.findElement(By.xpath("//*[text()='Logout']")).click();
        // 2. How do I know I actually Logged In?
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[text()='Sign in']"));
    }


}





