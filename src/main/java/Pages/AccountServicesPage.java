package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountServicesPage extends BasePage{

    @FindBy(xpath = "//a[contains(text(),'Bill Pay')]")
    WebElement billPay;

    public AccountServicesPage(WebDriver driver) {
        super(driver);
    }
    public void clickBillPayButton(){
        billPay.click();
    }
}
