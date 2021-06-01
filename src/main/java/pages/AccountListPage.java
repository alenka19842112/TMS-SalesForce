package pages;

import elements.Input;
import org.openqa.selenium.WebDriver;

public class AccountListPage extends BasePage {

    public AccountListPage(WebDriver driver) {
        super(driver);
    }

    private static final String URL = "https://onliner3.lightning.force.com/lightning/o/Account/list?filterName=Recent";

    /**
     * open Page "https://onliner3.lightning.force.com/lightning/o/Account/list?filterName=Recent"
     */
    public AccountListPage openAccountListPage() {
        driver.get(URL);
        return this;
    }

    /**
     * out Data Account
     *
     * @param label line name
     * @return entered text
     */
    public String outDataAccount(String label) {
        return new Input(driver, label).getAccountText();
    }
}
