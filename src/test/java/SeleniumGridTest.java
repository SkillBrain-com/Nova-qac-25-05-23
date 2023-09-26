import org.example.Pages.MainPage;
import org.example.Utils.TestBase;
import org.testng.annotations.Test;

public class SeleniumGridTest extends TestBase {

    @Test(groups = {"grid"})
    public void seleniumGridTest(){
        MainPage mainPage = new MainPage(remoteDriver);
        mainPage.addToCart();
        mainPage.verifyAddToCart();
    }
}
