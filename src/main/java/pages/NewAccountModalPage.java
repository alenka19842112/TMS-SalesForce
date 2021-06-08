package pages;

import constans.IConstans;
import elements.*;
import object.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewAccountModalPage extends BasePage implements IConstans {
    public NewAccountModalPage(WebDriver driver) {
        super(driver);
    }

    /**
     * open Page "https://onliner3.lightning.force.com/lightning/o/Account/new"
     *
     * @return NewAccountModalPage
     */
    public NewAccountModalPage openNewAccountPage() {
        driver.get(NEW_ACCOUNT_MODAL_URL);
        waitForPageOpened(By.xpath("//button[@title='Save']"));
        return this;
    }

    /**
     * create new Account in Modal Page
     *
     * @param account data account
     * @return NewAccountModalPage
     */
    public NewAccountModalPage create(Account account) {
        new Input(driver, "Account Name").writeText(account.getAccountName());
        new Input(driver, "Phone").writeText(account.getPhone());
        new Input(driver, "Fax").writeText(account.getFax());
        new Input(driver, "Website").writeText(account.getWebSite());
        new DropDown(driver, "Type").select(account.getType());
        new DropDown(driver, "Industry").select(account.getIndustry());
        new Input(driver, "Employees").writeText(account.getEmployees());
        new Input(driver, "Annual Revenue").writeText(account.getAnnualRevenue());
        new TextArea(driver, "Description").writeTextArea(account.getDescription());
        new TextArea(driver, "Billing Street").writeTextArea(account.getBillingStreet());
        new Input(driver, "Billing City").writeText(account.getBillingCity());
        new Input(driver, "Billing State/Province").writeText(account.getBillingStateProvince());
        new Input(driver, "Billing Zip/Postal Code").writeText(account.getBillingZip());
        new Input(driver, "Billing Country").writeText(account.getBillingCountry());
        new Checkbox(driver, "Copy Billing Address to Shipping Address").clickCheckbox();
        new Button(driver, "Save").clickButton();
        new Button(driver, "Close this window").clickButton();
        return this;
    }
}
