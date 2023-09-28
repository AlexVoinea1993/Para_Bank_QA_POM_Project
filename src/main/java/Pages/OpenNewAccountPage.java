package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class OpenNewAccountPage extends BasePage{
    @FindBy(css = "#type")
    WebElement accountType;
    @FindBy(css = "#fromAccountId")
    WebElement existingAccount;
    @FindBy(xpath = "//input[@class='button']")
    WebElement buttonColor;

    public OpenNewAccountPage(WebDriver driver) {
        super(driver);
    }
    public void selectAccountType(){
        Select account = new Select(accountType);
        account.selectByValue("1");
    }
    public void selectExistingAccount(){
        Select existingAcc = new Select(existingAccount);
        existingAcc.selectByValue("17784");
    }
    public void printNewAccountButtonColor(){
        System.out.println(buttonColor.getCssValue("background-color"));
    }
    public String getNewAccountButtonColor(){
        return buttonColor.getCssValue("background-color");
    }

}
