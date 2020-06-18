package com.generic.functional.automation.ui.tests.home;

import com.aventstack.extentreports.Status;
import com.generic.functional.automation.ui.tests.common.TestConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.File;

public class HomePageAutomation extends TestConfig {


    @Test
    public void testHelpButtonShipmentsClick() throws Exception {
        test = extent.createTest("Help Button Shipments Click");
        login.doLogin(test);
        test.log(Status.INFO, "Looking for help button");
        WebElement helpButton = driver.findElement(By.cssSelector(".explore-quiries-inner"));
        helpButton.click();
        test.log(Status.INFO, "Help Button Clicked");
        driver.findElement(By.id("mainArc-0b981a1b-32dc-43b1-b257-70c8c5a6cc6d")).click();
        Thread.sleep(5 * 1000);
        test.log(Status.INFO, "Shipments cluster found");
        driver.findElement(By.id("mainArc-d5f6e57b-d157-4ec5-bbc4-9fd35cc68775")).click();
        Thread.sleep(5 * 1000);
        test.log(Status.INFO, "Service cluster found");
        driver.findElement(By.id("mainArc-f18c2bb1-ad7d-4583-8b64-7ef98ba647cc")).click();
        Thread.sleep(5 * 1000);
        driver.findElement(By.xpath("//*[text()=' Total Records']"));
        //driver.findElement(By.xpath("//*[text()='28']"));

        test.createNode("Total Records found means table loaded");

    }

    @Test
    public void testVerifyResetButtonSearchBar() throws Exception {
        test = extent.createTest("Home > Verify Reset Button / Clear the Search Bubble");
        login.doLogin(test);
        test.log(Status.INFO, "Help Button Clicked");
        WebElement helpButton = driver.findElement(By.cssSelector(".explore-quiries-inner"));
        helpButton.click();
        Thread.sleep(5 * 1000);
        test.log(Status.INFO, "Shipments Clicked");
        driver.findElement(By.id("mainArc-0b981a1b-32dc-43b1-b257-70c8c5a6cc6d")).click();
        Thread.sleep(7 * 1000);
        test.log(Status.INFO, "International Clicked");
        driver.findElement(By.id("mainArc-71ef3c15-be01-454d-bd1e-c59d13904a65")).click();
        Thread.sleep(7 * 1000);
        test.log(Status.INFO, "XXXXXXX Clicked");
        driver.findElement(By.id("mainArc-fa581093-0286-4f62-a4a1-5abf224fa8f1")).click();
        Thread.sleep(7 * 1000);
        driver.findElement(By.className("search_icon")).click();
        Thread.sleep(7 * 1000);

        WebElement element = driver.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div/main/div/div/div/div[4]/div/div[2]/div[2]/div/div/div/div/div/div/div/div[1]"));
        element.click();
        WebElement element1 = driver.findElement(By.id("copy-query-0"));
        //WebElement element = driver.findElement(By.cssSelector("#copy-query-0 > path"));
        System.out.println("Is Element Enabled -> " + element1.isEnabled());
        System.out.println("Is Element is Displayed -> " + element1.isDisplayed());
        element1.click();
        Thread.sleep(7 * 1000);
        test.log(Status.INFO, "Query Copied");
        driver.findElement(By.cssSelector("svg.MuiSvgIcon-root.highlightIcon")).click();  // Reset Button
        Thread.sleep(7 * 1000);


    }


    @Test
    public void testVerifyInternationalCountryOfOrigin() throws Exception {
        test = extent.createTest("Verify International Facts Country Of Origin");
        driver.manage().window().maximize();
        login.doLogin(test);
        Thread.sleep(7 * 1000);
        // driver.manage().window().maximize();
        test.log(Status.INFO, "Help button Clicked");
        WebElement helpButton = driver.findElement(By.cssSelector(".explore-quiries-inner"));
        helpButton.click();
        Thread.sleep(7 * 1000);
        test.log(Status.INFO, "Sunburst Shown");
        test.log(Status.INFO, "Shipments Cluster Clicked on the Sunburst");
        driver.findElement(By.id("mainArc-0b981a1b-32dc-43b1-b257-70c8c5a6cc6d")).click();
        Thread.sleep(7 * 1000);
        test.log(Status.INFO, "International Clicked on the Sunburst");
        driver.findElement(By.id("mainArc-71ef3c15-be01-454d-bd1e-c59d13904a65")).click();
        Thread.sleep(7 * 1000);
        test.log(Status.INFO, "Country of Origin Element Clicked on the Sunburst");
        WebElement helpButtoncountry = driver.findElement(By.id("mainArc-466ed1b9-526b-45c7-a02c-e6d419ef606f"));
        helpButtoncountry.click();
        Thread.sleep(7 * 1000);
        driver.findElement(By.xpath("//*[text()=' Total Records']"));
        test.log(Status.INFO, "Total Records found and table shown");
        Thread.sleep(7 * 1000);


    }

    @Test
    public void testVerifyInternationalDocumentsClick() throws Exception {
        test = extent.createTest("Verify International Documents");
        login.doLogin(test);
        Thread.sleep(5 * 1000);
        test.log(Status.INFO, "Help Button Clicked");
        WebElement helpButton = driver.findElement(By.cssSelector(".explore-quiries-inner"));
        helpButton.click();
        Thread.sleep(5 * 1000);
        test.log(Status.INFO, "Sunburst Shown");
        driver.findElement(By.id("mainArc-0b981a1b-32dc-43b1-b257-70c8c5a6cc6d")).click();
        Thread.sleep(5 * 1000);
        test.log(Status.INFO, "Shipments Cluster Clicked");
        driver.findElement(By.id("mainArc-71ef3c15-be01-454d-bd1e-c59d13904a65")).click();
        Thread.sleep(5 * 1000);
        test.log(Status.INFO, "International Clicked on Sunburst");
        driver.findElement(By.id("mainArc-044c1070-d406-443b-a9e5-2fdbdf4daaae")).click();
        Thread.sleep(5 * 1000);
        test.log(Status.INFO, "Documents Element Clicked");
        driver.findElement(By.xpath("//*[text()=' Total Records']"));
        test.log(Status.INFO, "Total Records found and table shown");
        Thread.sleep(5 * 1000);
        driver.findElement(By.cssSelector("svg.MuiSvgIcon-root.helpIcon.explore-query-svg.ml-2 > path")).click();
        driver.findElement(By.xpath("//button[@id='simple-tab-1']/span")).click();
        driver.findElement(By.xpath("(//button[@id='simple-tab-1']/span)[3]")).click();
        driver.findElement(By.cssSelector("svg.css-19bqh2r")).click();
        driver.findElement(By.id("react-select-5-option-0")).click();
        driver.findElement(By.id("react-select-6-option-0")).click();
        driver.findElement(By.id("react-select-7-option-4")).click();
        driver.findElement(By.xpath("//div[@id='panel1d-content']/div/div/form/div[4]/div[2]/button/span")).click();
    }


    @Test
    public void testShipmentsSunburstDocClick() throws Exception {
        test = extent.createTest("Shipments Documents Click");
        driver.manage().window().maximize();
        login.doLogin(test);
        test.createNode("Help Button Click");
        WebElement helpButton = driver.findElement(By.cssSelector(".explore-quiries-inner"));
        helpButton.click();
        Thread.sleep(5 * 1000);
        test.createNode("Subject Shipments Button Click");
        WebElement SubjectShipmentsButtonClick = driver.findElement(By.id("mainArc-0b981a1b-32dc-43b1-b257-70c8c5a6cc6d"));
        SubjectShipmentsButtonClick.click();
        Thread.sleep(5 * 1000);
        test.createNode("Documents Cluster Click");
        WebElement DocumentsCluster = driver.findElement(By.id("mainArc-11a018d0-8978-48ff-9c7b-ea8606201da5"));
        DocumentsCluster.click();
        Thread.sleep(5 * 1000);
        test.createNode("Documents Provider Cluster Click");
        WebElement DocumentsProviderCluster = driver.findElement(By.id("mainArc-cd5709c6-2d2e-4d24-8c1e-df38a9f9b0e5"));
        DocumentsProviderCluster.click();
        Thread.sleep(5 * 1000);
        // driver.findElement(By.cssSelector("svg.MuiSvgIcon-root.helpIcon.explore-query-svg.ml-2 > path")).click();
        WebElement helpButton1 = driver.findElement(By.cssSelector(".explore-quiries-inner"));
        helpButton1.click();
        Thread.sleep(5 * 1000);
        driver.findElement(By.xpath("//button[@id='simple-tab-1']/span")).click();
        Thread.sleep(5 * 1000);

        driver.findElement(By.xpath("(//button[@id='simple-tab-1']/span)[3]")).click();
        Thread.sleep(5 * 1000);
        WebElement Axis1 = driver.findElement(By.xpath("//div[@id='panel1d-content']/div/div/form/div/div[2]/div/div/div"));
        Axis1.click();
        Thread.sleep(5 * 1000);
        test.createNode("Provider clicked in drop down");
        WebElement Provider = driver.findElement(By.id("react-select-2-option-0"));
        Provider.click();
        Thread.sleep(5 * 1000);
        test.createNode("Axis2");
        WebElement Axis2 = driver.findElement(By.xpath("//div[@id='panel1d-content']/div/div/form/div[2]/div[2]/div/div/div"));
        Axis2.click();
        Thread.sleep(5 * 1000);
        test.createNode("Count   clicked  ");
        WebElement Count = driver.findElement(By.id("react-select-3-option-0"));
        Count.click();
        Thread.sleep(5 * 1000);
        test.createNode("Graph");
        WebElement Graph = driver.findElement(By.xpath("//div[@id='panel1d-content']/div/div/form/div[3]/div[2]/div"));
        Graph.click();
        Thread.sleep(5 * 1000);
        test.createNode("Donut view clicked in drop down ");
        WebElement donutView = driver.findElement(By.id("react-select-4-option-3"));
        donutView.click();
        Thread.sleep(5 * 1000);
        test.createNode("Show button");
        WebElement showButton = driver.findElement(By.xpath("//div[@id='panel1d-content']/div/div/form/div[4]/div[2]/button/span"));
        showButton.click();
        Thread.sleep(5 * 1000);
    }


    @Test
    public void testVerifyResetButtonSunburst() throws Exception {
        test = extent.createTest("Home Page Verify Reset Button by Sunburst");
        login.doLogin(test);
        driver.manage().window().maximize();
        // test.createNode("Verified Reset Button");
        test.log(Status.INFO, "Help Button Clicked");
        WebElement helpButton = driver.findElement(By.cssSelector(".explore-quiries-inner"));
        helpButton.click();
        Thread.sleep(7 * 1000);
        test.log(Status.INFO, "Sunburst Shown");
        test.createNode("Verified Reset Button");
        driver.findElement(By.id("mainArc-0b981a1b-32dc-43b1-b257-70c8c5a6cc6d")).click();
        Thread.sleep(7 * 1000);
        test.log(Status.INFO, "Clicked on Shipments Cluster");
        driver.findElement(By.id("mainArc-71ef3c15-be01-454d-bd1e-c59d13904a65")).click();
        Thread.sleep(7 * 1000);
        test.log(Status.INFO, "Clicked on International");
        driver.findElement(By.id("mainArc-7000c84e-b726-405b-ae57-3103e755a869")).click();
        Thread.sleep(7 * 1000);
        test.log(Status.INFO, "Clicked on Sub element to get the Query");
        driver.findElement(By.id("mainArc-a4b796c9-8bbb-4f37-b959-26b2e1dd758e")).click();
        Thread.sleep(7 * 1000);
        test.log(Status.INFO, "Clicked on Sub element to get the Query");
        driver.findElement(By.id("mainArc-dcf61afd-31e9-4faa-9e8f-8743a267ac26")).click();
        Thread.sleep(7 * 1000);
        test.log(Status.INFO, "Clicked on Sub element to get the Query");
        driver.findElement(By.cssSelector("svg.MuiSvgIcon-root.highlightIcon")).click();
        Thread.sleep(7 * 1000);
        driver.findElement(By.xpath("//input[@name='']")).click();
        Thread.sleep(7 * 1000);
        test.log(Status.INFO, "Clicked on Reset Button");
        driver.findElement(By.xpath("//input[@name='']")).clear();
        Thread.sleep(7 * 1000);

    }

    @Test
    public void testVerifySubjectGuides() throws Exception {
        test = extent.createTest("Verify the Subject Guide Test");
        login.doLogin(test);
        test.log(Status.INFO, "Help Button Clicked");
        WebElement helpButton = driver.findElement(By.cssSelector(".explore-quiries-inner"));
        helpButton.click();
        Thread.sleep(5 * 1000);
        test.createNode("Verified Subject Guides Successfully!");
        driver.findElement(By.xpath("//div[@id='gatsby-focus-wrapper']/div/main/div/div/div/div[3]/div/div/div/ul/li[2]/span")).click();
        Thread.sleep(5 * 1000);
        driver.findElement(By.xpath("//div[@id='gatsby-focus-wrapper']/div/main/div/div/div/div[3]/div/div/div/ul/li/span")).click();
        Thread.sleep(5 * 1000);
        driver.findElement(By.xpath("//*[text()=' -- Subjects Guide -- ']"));
        test.log(Status.INFO, "Subjects Guide Displayed");
        driver.findElement(By.xpath("//*[text()='Domain of Values']"));
        test.log(Status.INFO, "Domain of Values Displayed");
        driver.findElement(By.xpath("//*[text()='Drill down for Sub-elements']"));
        test.log(Status.INFO, "Drill down for Sub-elements Displayed");
    }
@Test
public void testDownloadCSVButton() throws Exception {
    test = extent.createTest("DownloadCSVButton");
    login.doLogin(test);
    test.log(Status.INFO, "Help Button Clicked");
    test.createNode("Help Button Click");
    WebElement helpButton = driver.findElement(By.cssSelector(".explore-quiries-inner"));
    helpButton.click();
    Thread.sleep(5 * 1000);
    test.log(Status.INFO, "Subject Shipments Button Click");
    test.createNode("Subject Shipments Button Click");
    WebElement subjectShipmentsButton = driver.findElement(By.id("mainArc-0b981a1b-32dc-43b1-b257-70c8c5a6cc6d"));
    subjectShipmentsButton.click();
    Thread.sleep(5 * 1000);
    test.createNode("Freight Charges Click");
    test.log(Status.INFO, "Freight Charges Click");
    driver.findElement(By.id("mainArc-2609f85e-b113-407e-b007-dcea50347141")).click();
    Thread.sleep(5 * 1000);
    test.createNode("Carrier Identifier Click");
    test.log(Status.INFO, "Carrier Identifier Click");
    driver.findElement(By.id("mainArc-a5cc64db-9de3-414a-98a4-e975accd1246")).click();
    Thread.sleep(5 * 1000);
    test.createNode("DownloadCSVButton");
    driver.findElement(By.id("search-result-download-csv")).click();
    System.out.println(TestConfig.DEFAULT_DOWNLOAD_DIR+File.separator+"export.csv");
    File file = new File(TestConfig.DEFAULT_DOWNLOAD_DIR+File.separator+"export.csv");
    Thread.sleep(5*1000);

    try {
        if (file.delete()) {
            test.createNode("File  deleted  succesfully");
        } else {
            test.createNode("Failed to delete the file");
        }
    }
    catch (Exception e) {
        System.out.println(e);
    }
    }





    @Test
    public void testVerifyPrintButton() throws Exception {
        test = extent.createTest("VerifyPrintButton");
        login.doLogin(test);
        test.log(Status.INFO, "Help Button Clicked");
        test.createNode("Help Button Click");
        WebElement helpButton = driver.findElement(By.cssSelector(".explore-quiries-inner"));
        helpButton.click();
        Thread.sleep(5 * 1000);
        test.log(Status.INFO,"Subject Shipments Button Click");
        test.createNode("Subject Shipments Button Click");
        WebElement subjectShipmentsButton = driver.findElement(By.id("mainArc-0b981a1b-32dc-43b1-b257-70c8c5a6cc6d"));
        subjectShipmentsButton.click();
        Thread.sleep(5 * 1000);
        test.createNode("Freight Charges Click");
        test.log(Status.INFO,"Freight Charges Click");
        driver.findElement(By.id("mainArc-2609f85e-b113-407e-b007-dcea50347141")).click();
        Thread.sleep(5 * 1000);
        test.createNode("Carrier Identifier Click");
        test.log(Status.INFO,"Carrier Identifier Click");
        driver.findElement(By.id("mainArc-a5cc64db-9de3-414a-98a4-e975accd1246")).click();
        Thread.sleep(5 * 1000);
        test.createNode("Print Button Click");
        test.log(Status.INFO,"Print Button Click");
        driver.findElement(By.cssSelector("#search-result-print > span.MuiIconButton-label > svg.MuiSvgIcon-root > path")).click();
        Thread.sleep(5 * 1000);
    }
}













