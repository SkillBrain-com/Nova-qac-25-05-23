package Mentor;

import org.example.Mentor.Pages.AppointmentPage;
import org.example.Mentor.Pages.LoginPage;
import org.example.Mentor.Pages.MainPage;
import org.example.Mentor.TestBase;
import org.testng.annotations.Test;

@Test
public class LoginTest extends TestBase {

    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();
    AppointmentPage appointmentPage = new AppointmentPage();

    public void successfulLogin() throws InterruptedException {
        mainPage.navigateToLoginPage();
        loginPage.login("John Doe", "ThisIsNotAPassword");
        appointmentPage.verifyAppointmentPage();
    }

    public void badLogin(){
        mainPage.navigateToLoginPage();
        loginPage.login("username", "password");
        loginPage.verifyBadLogin();
    }
}
