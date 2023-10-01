import com.github.javafaker.Faker;
import org.example.Pages.MainPage;
import org.example.Pages.OrderConfirmation;
import org.example.Pages.ShippingAdress;
import org.example.Pages.SigninPage;
import org.example.Utils.TestBase;
import org.testng.annotations.Test;

public class CheckoutTest extends TestBase {

    @Test
    public void checkout(){
        MainPage mainPage = new MainPage(driver);
        SigninPage signinPage = new SigninPage(driver);
        ShippingAdress shippingAdress = new ShippingAdress(driver);
        Faker faker = new Faker();
        OrderConfirmation orderConfirmation = new OrderConfirmation(driver);

        mainPage.addToCart();
        mainPage.checkout();
        signinPage.login("demouser", "testingisfun99");

        shippingAdress.fillInAdress(faker.name().firstName(),faker.name().lastName(),faker.address().fullAddress(),faker.address().state(),faker.address().zipCode());

        orderConfirmation.verifyOrderPlacement();

    }
}
