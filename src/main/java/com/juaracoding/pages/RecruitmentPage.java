package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecruitmentPage {

    private WebDriver driver;

    // locator use page factory
    @FindBy(xpath = "//input[@placeholder='Username']")
    private WebElement username;

    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnLogin;

    public RecruitmentPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[normalize-space()='Recruitment']")
    private WebElement menuRecruitment;

    @FindBy(xpath = "//button[normalize-space()='Add']")
    private WebElement btnAddCandidate;

    @FindBy(xpath = "//input[@placeholder='First Name']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@placeholder='Middle Name']")
    private WebElement middleName;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    private WebElement lastName;

    @FindBy(xpath = "//div[@class='oxd-select-text-input']")
    private WebElement vacancy;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/input")
    private WebElement email;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div/div[2]/input")
    private WebElement contactNumber;

    @FindBy(xpath = "//div[@class='oxd-file-input-div']")
    private WebElement resume;

    @FindBy(xpath = "//input[@placeholder='Enter comma seperated words...']")
    private WebElement keywords;

    @FindBy(xpath = "//input[@placeholder='yyyy-mm-dd']")
    private WebElement dateOfApplication;

    @FindBy(xpath = "//textarea[@placeholder='Type here']")
    private WebElement notes;

    @FindBy(xpath = "//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']")
    private WebElement checklistConsent;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnSave;

    @FindBy(xpath = "//h6[normalize-space()='Application Stage']")
    private WebElement txtApplicationStage;

    // step action method
    public void login(String username, String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        btnLogin.click();
    }

    public void candidate(String firstName, String middleName, String lastName) {
        this.firstName.sendKeys(firstName);
        this.middleName.sendKeys(middleName);
        this.lastName.sendKeys(lastName);
    }


    public void vacancy(String SoftwareEngineer) {
        this.vacancy.sendKeys(SoftwareEngineer);
    }

    public void email (String mail) {
        this.email.sendKeys();
    }

    public void contactNumber() {
        this.contactNumber.sendKeys();
    }

    public void resume() {
        this.resume.sendKeys();
    }

    public void keywords() {
        this.keywords.sendKeys();
    }

    public void dateOfApplication() {
        this.dateOfApplication.sendKeys();
    }

    public void notes() {
        this.notes.sendKeys();
    }

    public void save() {
        this.checklistConsent.click();
        btnSave.click();
    }


    //step validation method return
    public String getTxtApplicationStage(){
        return txtApplicationStage.getText();
    }




}

