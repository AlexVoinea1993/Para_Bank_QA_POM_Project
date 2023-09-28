package Tests;

import Pages.HomePage;
import Utils.Constants;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest{


    @Test
    public void registerTest(){
        HomePage homePage = new HomePage(driver);
        homePage.clickRegisterButton();
    }
    @Test
    public void loginTest(){
        HomePage homePage = new HomePage(driver);
        homePage.inputUserName();
        homePage.inputPassword();
        homePage.clickLoginButton();
        homePage.clickOpenAccountButton();

    }
}
