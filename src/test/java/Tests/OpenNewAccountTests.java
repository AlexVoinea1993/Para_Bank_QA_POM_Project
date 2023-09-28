package Tests;

import Pages.HomePage;
import Pages.OpenNewAccountPage;
import Utils.Constants;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenNewAccountTests extends BaseTest{

    @Test
    public void openNewAccountTest(){

        HomePage homePage = new HomePage(driver);
        homePage.inputUserName();
        homePage.inputPassword();
        homePage.clickLoginButton();
        homePage.clickOpenAccountButton();
        OpenNewAccountPage openNewAccountPage = new OpenNewAccountPage(driver);
        openNewAccountPage.selectAccountType();
        openNewAccountPage.selectExistingAccount();
        openNewAccountPage.printNewAccountButtonColor();
        Assert.assertEquals(openNewAccountPage.getNewAccountButtonColor(), Constants.ORANGE_COLOR);
    }
}
