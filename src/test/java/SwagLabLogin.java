import org.example.Pages.SwagLabPages.LoginPage;
import org.example.Pages.SwagLabPages.SwagLabProducts;
import org.example.Utils.TestBase;
import org.testng.annotations.Test;

public class SwagLabLogin extends TestBase {

    @Test
    public void swagLabLogin(){

        LoginPage loginPage = new LoginPage(driver);

        SwagLabProducts swagLabProducts = new SwagLabProducts(driver);

        loginPage.loginPage("standard_user", "secret_sauce");

        swagLabProducts.verifyProducts();


    }
}
