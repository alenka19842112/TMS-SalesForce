package pages;

import elements.Buttons;
import elements.Checkbox;
import elements.DropDown;
import elements.Input;
import org.openqa.selenium.WebDriver;

public class NewAccountModalPage extends BasePage {
    public NewAccountModalPage(WebDriver driver) {
        super(driver);
    }

    private static final String URL = "https://onliner3.lightning.force.com/lightning/o/Account/new";

    /**
     * open Page "https://onliner3.lightning.force.com/lightning/o/Account/new"
     *
     * @return NewAccountModalPage
     */
    public NewAccountModalPage openNewAccountPage() {
        driver.get(URL);
        return this;
    }

    /**
     * input Account Information
     *
     * @param accountName   "Account Name"
     * @param phone         "Phone"
     * @param fax           "Fax"
     * @param website       "Website"
     * @return NewAccountModalPage
     */
    public NewAccountModalPage inputAccountInformation(String accountName, String phone,
                                                       String fax, String website) {
        new Input(driver, "Account Name").writeText(accountName);
        new Input(driver, "Phone").writeText(phone);
        new Input(driver, "Fax").writeText(fax);
        new Input(driver, "Website").writeText(website);
        return this;
    }

    /**
     * input Additional Information
     *
     * @param option1              Type
     * @param employees            Employees
     * @param option2              Industry
     * @param annualRevenue        Annual Revenue
     * @param description          Description
     * @param billingStreet        Billing Street
     * @param billingCity          Billing City
     * @param billingStateProvince Billing State/Province
     * @param billingZip           Billing Zip/Postal Code
     * @param billingCountry       Billing Country
     * @return NewAccountModalPage
     */
    public NewAccountModalPage inputAdditionalInformation(String option1, String employees, String option2,
                                                          String annualRevenue, String description, String billingStreet,
                                                          String billingCity, String billingStateProvince,
                                                          String billingZip, String billingCountry) {
        new DropDown(driver, "Type").select(option1);
        new DropDown(driver, "Industry").select(option2);
        new Input(driver, "Employees").writeText(employees);
        new Input(driver, "Annual Revenue").writeText(annualRevenue);
        new Input(driver, "Description").writeTextAreaDescription(description);
        new Input(driver, "Billing Street").writeTextAreaStreet(billingStreet);
        new Input(driver, "Billing City").writeText(billingCity);
        new Input(driver, "Billing State/Province").writeText(billingStateProvince);
        new Input(driver, "Billing Zip/Postal Code").writeText(billingZip);
        new Input(driver, "Billing Country").writeText(billingCountry);
        return this;
    }

    /**
     * click Checkbox on New Account Page
     * @return NewAccountModalPage
     */
    public NewAccountModalPage clickCheckboxOnNewAccountPage() {
        new Checkbox(driver, "Copy Billing Address to Shipping Address").clickCheckbox();
        return this;
    }

    /**
     * click Save Button
     * @return AccountListPage
     */
    public AccountListPage clickSaveButton() {
        new Buttons(driver, "Save").clickButton();
        return new AccountListPage(driver);
    }
}
