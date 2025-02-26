package techm.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import techm.Pages.LoginPage;
import techm.Pages.OrdersPage;

import java.time.Duration;

public class BaseTest {

    protected WebDriver driver;
    protected LoginPage loginPage;
    protected OrdersPage ordersPage;
    protected CommonMethods commonMethods;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver(); // una instancia de webDriver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://ecommercepractice.letskodeit.com/login/");
        commonMethods = new CommonMethods(driver);
        loginPage = new LoginPage(driver);
        ordersPage = new OrdersPage(driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
