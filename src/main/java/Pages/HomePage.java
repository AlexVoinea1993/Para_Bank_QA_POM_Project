package Pages;

import Utils.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement registerButton;
    @FindBy(xpath = "(//input[@class='input'])[1]")
    WebElement userName;
    @FindBy(xpath = "(//input[@class='input'])[2]")
    WebElement password;
    @FindBy(xpath = "//input[@class='button']")
    WebElement logIn;
    @FindBy(xpath = "//a[contains(text(),'Open New Account')]")
    WebElement openAccount;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickRegisterButton() {
        registerButton.click();
    }

    public void inputUserName() {
        userName.sendKeys(Constants.USER_NAME);
    }

    public void inputPassword() {
        password.sendKeys(Constants.PASSWORD);
    }

    public void clickLoginButton() {
        logIn.click();
    }
    public void clickOpenAccountButton(){
        openAccount.click();
    }
}

