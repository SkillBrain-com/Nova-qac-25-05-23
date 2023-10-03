import org.example.Pages.SwagLabPages.*;
import org.example.Utils.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SwagLabAddToCart extends TestBase {
@Test
    public void swagLabAddToCart(){

        LoginPage loginPage = new LoginPage(driver);

        SwagLabCheckOut swagLabCheckOut = new SwagLabCheckOut(driver);

        SwagLabProducts swagLabProducts = new SwagLabProducts(driver);

        SwagLabCheckOutComplete swagLabCheckOutComplete = new SwagLabCheckOutComplete(driver);

        SwagLabCartPage swagLabCartPage = new SwagLabCartPage(driver);

        loginPage.loginPage("standard_user", "secret_sauce");

        swagLabProducts.setAddToCartButton();

        swagLabCartPage.setCheckout();

        swagLabCartPage.setCredentials();

        swagLabCheckOut.setFinishButton();

        swagLabCheckOutComplete.setBackHome();

    }

}
