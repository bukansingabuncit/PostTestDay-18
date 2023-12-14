package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.RecruitmentPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RecruitmentTest {

    private WebDriver driver;

    private LoginPage loginPage;
    private RecruitmentPage candidatePage;

    @BeforeClass
    public void setUp() {
        DriverSingleton.getInstance("chrome");
        driver = DriverSingleton.getDriver();
        String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login\n";
        driver.get(url);
        loginPage = new LoginPage();
        candidatePage = new RecruitmentPage();

    }

    @AfterClass
    public void finish() {
        DriverSingleton.delay(3);
        DriverSingleton.closeObjectInstance();
    }

    @Test(priority = 1)
    public void testValidLogin() {
        loginPage.login("Admin", "admin123");
        Assert.assertEquals(loginPage.getTxtDashboard(), "Dashboard");
    }

    @Test(priority = 2)
    public void testFirstName() {
        candidatePage.candidate("Punya", "Singa", "Buncit");
        Assert.assertEquals(candidatePage, "Punya Singa Buncit");
    }

    @Test(priority = 3)
    public void testVacancy() {
        candidatePage.vacancy("SoftwareEngineer");
        Assert.assertEquals(candidatePage, "SoftwareEngineer");
    }

    @Test(priority = 4)
    public void testEmail() {
        candidatePage.email("test@testing.com");
        Assert.assertEquals(candidatePage, "test@testing.com");
    }

    @Test(priority = 5)
    public void testContactNumber() {
        candidatePage.contactNumber();
        Assert.assertEquals(candidatePage, "0812345678");
    }

    @Test(priority = 6)
    public void testResume() {
        candidatePage.resume();
        Assert.assertEquals(candidatePage,"");
    }

    @Test(priority = 7)
    public void testKeywords() {
        candidatePage.keywords();
        Assert.assertEquals(candidatePage, "testing");
    }

//    @Test(priority = 8)
//    public void testDateOfApplication() {
//        candidatePage.dateOfApplication("");
//        Assert.assertEquals(candidatePage, "14-12-2023");
//    }

    @Test(priority = 9)
    public void testNotes() {
        candidatePage.notes();
        Assert.assertEquals(candidatePage,"test juara coding");
    }








}
