import org.example.Pages.MainPage;
import org.example.Pages.SigninPage;
import org.example.Utils.TestBase;
import org.testng.annotations.Test;

public class LogoutTests extends TestBase {

    @Test
    public void logoutTests(){

        MainPage mainPage = new MainPage(driver);
        SigninPage signinPage = new SigninPage(driver);

        mainPage.navigateToSignIn();
        signinPage.login("demouser", "testingisfun99");
        mainPage.logout();
        mainPage.verifyLogout();




    }


}
