package techm.Pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import techm.Maps.LoginPageMap;
import techm.Utils.AppConstants;
import techm.Utils.Base64Decodifier;
import techm.Utils.CommonMethods;

public class LoginPage {

    WebDriver driver;
    CommonMethods commonMethods;
    LoginPageMap loginPageMap = new LoginPageMap();

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        commonMethods = new CommonMethods(driver);
        loginPageMap = new LoginPageMap();

    }

    public void login() {

        commonMethods.sendKeysToElement(loginPageMap.emailInput, AppConstants.EMAIL);
        commonMethods.sendKeysToElement(loginPageMap.passwordInput, Base64Decodifier.decodedPass(AppConstants.PASSWORD));
        commonMethods.clickElement(loginPageMap.loginButton);

    }

    public void login(String email, String password) {

        commonMethods.sendKeysToElement(loginPageMap.emailInput, email);
        commonMethods.sendKeysToElement(loginPageMap.passwordInput, password);
        commonMethods.clickElement(loginPageMap.loginButton);

    }


    public void emptyEmail() {
        login("", Base64Decodifier.decodedPass(AppConstants.PASSWORD));
        String actualText = commonMethods.getTextOfElement(loginPageMap.emailErrorMessage);
        Assert.assertEquals(actualText, "Please use a valid email address, such as user@example.com.");

    }

    public void emptyPassword() {
        login(AppConstants.EMAIL, "");
        String actualText = commonMethods.getTextOfElement(loginPageMap.passwordErrorMessage);
        Assert.assertEquals(actualText, "Field required");
    }

    public void emptyLoginForm() {
        login("", "");
        String actualText = commonMethods.getTextOfElement(loginPageMap.emailErrorMessage);
        Assert.assertEquals(actualText, "Please use a valid email address, such as user@example.com.");
        String actualText1 = commonMethods.getTextOfElement(loginPageMap.passwordErrorMessage);
        Assert.assertEquals(actualText1, "Field required");

    }


}
