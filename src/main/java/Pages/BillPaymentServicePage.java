package Pages;

import Utils.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BillPaymentServicePage extends BasePage{

    @FindBy(xpath = "//input[@name='payee.name']")
    WebElement name;
    @FindBy(xpath = "//input[@ng-model='payee.address.street']")
    WebElement address;
    @FindBy(xpath = "//input[@ng-model='payee.address.city']")
    WebElement city;
    @FindBy(xpath = "//input[@ng-model='payee.address.state']")
    WebElement state;
    @FindBy(xpath = "//input[@ng-model='payee.address.zipCode']")
    WebElement zipCode;
    @FindBy(xpath = "//input[@name='payee.phoneNumber']")
    WebElement phoneNumber;
    @FindBy(xpath = "//input[@name='payee.accountNumber']")
    WebElement account;
    @FindBy(xpath = "//input[@name='verifyAccount']")
    WebElement verifyAccount;
    @FindBy(xpath = "//input[@name='amount']")
    WebElement moneyAmmount;
    @FindBy(xpath = "//input[@class='button']")
    WebElement sendPayment;

    public BillPaymentServicePage(WebDriver driver) {
        super(driver);
    }
    public void inputPayeeName(){
        name.sendKeys(Constants.FIRST_NAME);
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
    public void inputAccount(){
        account.sendKeys(Constants.ACCOUNT);
    }
    public void inputVerifyAccount(){
        verifyAccount.sendKeys(Constants.ACCOUNT);
    }
    public void inputAmmountOfMoney(){
        moneyAmmount.sendKeys(Constants.AMMOUT_OF_MONEY);
    }
    public void clickSendPaymentButton(){
        sendPayment.click();
    }
}
