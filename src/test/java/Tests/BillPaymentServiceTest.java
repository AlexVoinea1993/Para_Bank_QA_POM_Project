package Tests;

import Pages.AccountServicesPage;
import Pages.BillPaymentServicePage;
import Pages.HomePage;
import org.testng.annotations.Test;

public class BillPaymentServiceTest extends BaseTest{

    @Test
    public void billPaymentServiceTest() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.inputUserName();
        homePage.inputPassword();
        homePage.clickLoginButton();
        AccountServicesPage accountServicesPage = new AccountServicesPage(driver);
        accountServicesPage.clickBillPayButton();
        BillPaymentServicePage billPaymentServicePage = new BillPaymentServicePage(driver);
        billPaymentServicePage.inputPayeeName();
        billPaymentServicePage.inputAddress();
        billPaymentServicePage.inputCity();
        billPaymentServicePage.inputState();
        billPaymentServicePage.inputZipCode();
        billPaymentServicePage.inputPhoneNumber();
        billPaymentServicePage.inputAccount();
        billPaymentServicePage.inputVerifyAccount();
        billPaymentServicePage.inputAmmountOfMoney();
        billPaymentServicePage.clickSendPaymentButton();
    }
}
