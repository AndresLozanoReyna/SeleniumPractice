package techm.Pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import techm.Maps.OrdersPageMap;
import techm.Utils.CommonMethods;

public class OrdersPage {
    WebDriver driver;
    CommonMethods commonMethods;
    OrdersPageMap orders;

    // constructor mejorado
    public OrdersPage(WebDriver driver) {
        this.driver = driver;
        orders = new OrdersPageMap();
        commonMethods = new CommonMethods(driver);

    }

    public void validteLogin() {
        commonMethods.waitForVisibilityOfElement(orders.orderTitle);
        Assert.assertEquals(driver.getCurrentUrl(), "https://ecommercepractice.letskodeit.com/account/orders/");
    }
}
