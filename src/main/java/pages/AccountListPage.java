package pages;

import constans.IConstans;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountListPage extends BasePage implements IConstans {

    public AccountListPage(WebDriver driver) {
        super(driver);
    }

    private static final String OUTPUT_XPATH = "//*[contains(text(),'%s')]/ancestor::div[contains(@class,'output')]//slot[@slot='outputField']";
    private static final String ACCOUNT = "//a[contains(text(),'%s')]";

    /**
     *
     * @param accountName account Name
     */
    public AccountListPage clickAccountLink(String accountName){
        driver.findElement(By.xpath(String.format(ACCOUNT,accountName))).click();
        return this;
    }

    /**
     * open Page "https://onliner3.lightning.force.com/lightning/o/Account/list?filterName=Recent"
     */
    public AccountListPage openAccountListPage() {
        driver.get(ACCOUNT_LIST_URL);
        return this;
    }

    /**
     * get out Data Account
     *
     * @param label line name
     * @return entered text
     */
    public String outDataAccount(String label) {
        return driver.findElement(By.xpath(String.format(OUTPUT_XPATH, label))).getText();
    }
}
