import org.example.Pages.MainPage;
import org.example.Utils.TestBase;
import org.testng.annotations.Test;

public class AddToCartTest extends TestBase {
    @Test
    public void addToCart(){
        MainPage mainPage = new MainPage(driver);
       mainPage.addToCart();
       mainPage.verifyAddToCart();
    }

}
