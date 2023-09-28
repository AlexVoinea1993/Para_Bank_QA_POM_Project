package Tests;

import Pages.AccountServicesPage;
import Pages.HomePage;
import org.testng.annotations.Test;

public class AccountServicesTests extends BaseTest{

    @Test
    public void billPayButtonTest(){
        HomePage homePage = new HomePage(driver);
        homePage.inputUserName();
        homePage.inputPassword();
        homePage.clickLoginButton();
        AccountServicesPage accountServicesPage = new AccountServicesPage(driver);
        accountServicesPage.clickBillPayButton();
    }
}
