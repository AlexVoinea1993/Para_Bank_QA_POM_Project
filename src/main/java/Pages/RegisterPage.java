package Pages;

import Utils.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

    @FindBy(css = "#customer\\.firstName")
    WebElement firstName;
    @FindBy(xpath = "//input[@id='customer.lastName']")
    WebElement lastName;
    @FindBy(css = "#customer\\.address\\.street")
    WebElement address;
    @FindBy(xpath = "//input[@id='customer.address.city']")
    WebElement city;
    @FindBy(css = "#customer\\.address\\.state")
    WebElement state;
    @FindBy(xpath = "//input[@id='customer.address.zipCode']")
    WebElement zipCode;
    @FindBy(css = "#customer\\.phoneNumber")
    WebElement phoneNumber;
    @FindBy(xpath = "//input[@id='customer.ssn']")
    WebElement ssn;
    @FindBy(css = "#customer\\.username")
    WebElement userName;
    @FindBy(xpath = "//input[@id='customer.password']")
    WebElement password;
    @FindBy(css = "#repeatedPassword")
    WebElement repeatedPassword;
    @FindBy(xpath = "(//input[@class='button'])[2]")
    WebElement submitRegistration;
    @FindBy(xpath = "//a[contains(text(),'Log Out')]")
    WebElement logOut;

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void inputFirstName() {
        firstName.sendKeys(Constants.FIRST_NAME);
    }
    public void inputLastName() {
        lastName.sendKeys(Constants.LAST_NAME);
    }
    public void inputAddress(){
        address.sendKeys(Constants.ADDRESS);
    }
    public void inputCity(){
        city.sendKeys(Constants.CITY);
    }
    public void inputState(){
        state.sendKeys(Constants.STATE);
    }
    public void inputZipCode(){
        zipCode.sendKeys(Constants.ZIP_CODE);
    }
    public void inputPhoneNumber(){
        phoneNumber.sendKeys(Constants.PHONE_NUMBER);
    }
    public void inputSsn(){
        ssn.sendKeys(Constants.SSN);
    }
    public void inputUserName(){
        userName.sendKeys(Constants.USER_NAME);
    }
    public void inputPassword(){
        password.sendKeys(Constants.PASSWORD);
    }
    public void inputRepeatPassword(){
        repeatedPassword.sendKeys(Constants.PASSWORD);
    }
    public void clickRegistrationButton(){
        submitRegistration.click();
    }
    public void clickLogOutButton(){
        logOut.click();
    }
}
