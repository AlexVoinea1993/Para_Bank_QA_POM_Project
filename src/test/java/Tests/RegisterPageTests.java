package Tests;

import Pages.HomePage;
import Pages.RegisterPage;
import org.testng.annotations.Test;

public class RegisterPageTests extends BaseTest{


    @Test
    public void registerTest(){
        HomePage homePage = new HomePage(driver);
        homePage.clickRegisterButton();
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputFirstName();
        registerPage.inputLastName();
        registerPage.inputAddress();
        registerPage.inputCity();
        registerPage.inputState();
        registerPage.inputZipCode();
        registerPage.inputPhoneNumber();
        registerPage.inputSsn();
        registerPage.inputUserName();
        registerPage.inputPassword();
        registerPage.inputRepeatPassword();
        registerPage.clickRegistrationButton();
        registerPage.clickLogOutButton();
    }
}
