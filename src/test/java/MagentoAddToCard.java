import org.example.Pages.Magento.JacketPage;
import org.example.Pages.Magento.ProdactsPage;
import org.example.Utils.TestBase;
import org.testng.annotations.Test;

public class MagentoAddToCard extends TestBase {
    @Test
    public void magentoAddToCard(){
        ProdactsPage prodactsPage = new ProdactsPage(driver);
        JacketPage jacketPage = new JacketPage(driver);
        prodactsPage.setFirstProdact();
        jacketPage.setAddCard();
        jacketPage.Verify();


    }

}
