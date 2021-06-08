package pages;

import constans.IConstans;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage implements IConstans {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    /**
     * open Page "https://onliner3.my.salesforce.com"
     */
    public LoginPage openLoginPage() {
        driver.get(BASE_URL);
        waitForPageOpened(By.id("Login"));
        return this;
    }

    /**
     * login to the page "https://onliner3.my.salesforce.com"
     */
    public void login(String login, String password) {
        driver.findElement(By.id("username")).sendKeys(login);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("Login")).click();
    }
}
