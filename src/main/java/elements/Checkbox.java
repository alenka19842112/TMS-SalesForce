package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkbox {
    WebDriver driver;
    String label;
    private static final String CHECKBOX_LOCATOR = "//*[contains(text(),'%s')]/ancestor::div[contains(@class,'uiInputCheckbox')]//input[@type='checkbox']";

    public Checkbox(WebDriver driver,String label) {
        this.driver = driver;
        this.label = label;
    }

    /**
     * click Checkbox
     */
    public void clickCheckbox(){
        driver.findElement(By.xpath(String.format(CHECKBOX_LOCATOR, label))).click();
    }
}
