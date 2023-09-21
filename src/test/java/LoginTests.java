import org.example.Pages.MainPage;
import org.example.Pages.SigninPage;
import org.example.Utils.TestBase;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

    @Test
    public void successfulLogin(){
        MainPage mainPage = new MainPage(driver);
        SigninPage signinPage = new SigninPage(driver);

        mainPage.navigateToSignIn();
        signinPage.login("demouser", "testingisfun99");
    }

    @Test
    public void incorrectLogin(){
        MainPage mainPage = new MainPage(driver);
        SigninPage signinPage = new SigninPage(driver);

        mainPage.navigateToSignIn();
        signinPage.login("orice", "orice");
        signinPage.verifyErrorMessage();
    }
}
