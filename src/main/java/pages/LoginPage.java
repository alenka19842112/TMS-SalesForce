package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    private static final String LOGIN = "ei123-eajd@force.com";
    private static final String PASSWORD = "&YP39TJUrqxy!Mp*";
    private static final String URL = "https://onliner3.my.salesforce.com";

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    /**
     * open Page "https://onliner3.my.salesforce.com"
     */
    public LoginPage openLoginPage() {
        driver.get(URL);
        return this;
    }

    /**
     * login to the page "https://onliner3.my.salesforce.com"
     */
    public void login() {
        driver.findElement(By.id("username")).sendKeys(LOGIN);
        driver.findElement(By.id("password")).sendKeys(PASSWORD);
        driver.findElement(By.id("Login")).click();
    }
}
