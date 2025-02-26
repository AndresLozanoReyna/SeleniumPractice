package techm.Test;

import org.testng.annotations.Test;
import techm.Utils.BaseTest;

// metodos = acciones
// attributos =  colores, etc

public class LoginPageTest extends BaseTest {
    @Test
    public void loginValidCredentials() {
        loginPage.login();
        ordersPage.validteLogin();
    }

    @Test
    public void loginEmptyUsername() {
        loginPage.emptyEmail();
    }

    @Test
    public void loginEmptyPassword() {
        loginPage.emptyPassword();
    }

    @Test
    public void emptyLoginForm() {
        loginPage.emptyLoginForm();
    }

}