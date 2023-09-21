import org.example.Page;
import org.example.Setup;
import org.testng.annotations.Test;

public class Testul extends Setup {


    @Test
    public void test() throws InterruptedException {
        Page page = new Page(driver);
        page.click();
        Thread.sleep(5000);
    }
}
