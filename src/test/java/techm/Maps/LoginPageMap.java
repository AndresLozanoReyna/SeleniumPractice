package techm.Maps;

import org.openqa.selenium.By;

public class LoginPageMap {

    public By emailInput = By.cssSelector("#email");
    public By emailErrorMessage = By.xpath("//span[@class='error']//parent::div//span");
    // By.cssSelector("input[id='email']"); ////span[@class='error']//parent::div//input//following-sibling::span
    public By passwordInput = By.cssSelector("#password");
    public By passwordErrorMessage = By.xpath("//span[contains(text(),'Field required')]");
    public By loginButton = By.cssSelector("button[type='submit']");


}
