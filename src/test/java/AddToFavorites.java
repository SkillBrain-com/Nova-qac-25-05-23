import org.example.Pages.FavoritePage;
import org.example.Pages.MainPage;
import org.example.Pages.SigninPage;
import org.example.Utils.TestBase;
import org.testng.annotations.Test;

public class AddToFavorites extends TestBase {

    @Test
    public void addToFavorites(){

        MainPage mainPage = new MainPage(driver);
        SigninPage signinPage = new SigninPage(driver);
        FavoritePage favoritePage = new FavoritePage(driver);

        mainPage.navigateToSignIn();
        signinPage.login("demouser", "testingisfun99");

        mainPage.setAddToFavorite();
        mainPage.navigateToFavoritePage();
        favoritePage.setAddToFavorit();


    }


}
