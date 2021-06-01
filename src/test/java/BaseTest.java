import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.AccountListPage;
import pages.LoginPage;
import pages.NewAccountModalPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    NewAccountModalPage newAccountModalPage;
    AccountListPage accountListPage;
    WebDriver driver;
    LoginPage loginPage;

    @BeforeMethod
    public void initTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        newAccountModalPage = new NewAccountModalPage(driver);
        accountListPage = new AccountListPage(driver);
        loginPage = new LoginPage(driver);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterMethod(alwaysRun = true)
    public void endTest() {
        driver.quit();
    }
}
