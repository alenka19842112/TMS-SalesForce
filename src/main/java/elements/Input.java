package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Input {
    WebDriver driver;
    String label;
    private static final String INPUT_XPATH = "//*[contains(text(),'%s')]/ancestor::div[contains(@class,'uiInput')]//input";
    private static final String INPUT_XPATH_LOCATOR = "//*[contains(text(),'%s')]/ancestor::div[contains(@class,'uiInputTextArea')]";

    private static final String INPUT_TEXT_AREA_DESCRIPTION = "//*[@class=' textarea']";
    private static final String INPUT_TEXT_AREA_STREET = "//*[contains(@class,'street')]";
    private static final String OUTPUT_XPATH = "//*[contains(text(),'%s')]/ancestor::div[contains(@class,'output')]//slot[@slot='outputField']";

    public Input(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    /**
     * data entry for registration
     *
     * @param text input text
     */
    public void writeText(String text) {
        driver.findElement(By.xpath(String.format(INPUT_XPATH, label))).sendKeys(text);
    }

    /**
     * data entry for registration in text area Description
     *
     * @param text input text
     */
    public void writeTextAreaDescription(String text) {
        driver.findElement(By.xpath(String.format(INPUT_XPATH_LOCATOR, label))).click();
        driver.switchTo();
        driver.findElement(By.xpath(INPUT_TEXT_AREA_DESCRIPTION)).sendKeys(text);
        driver.switchTo().defaultContent();
    }

    /**
     * data entry for registration in text area Street
     *
     * @param text input text
     */
    public void writeTextAreaStreet(String text) {
        driver.findElement(By.xpath(String.format(INPUT_XPATH_LOCATOR, label))).click();
        driver.switchTo();
        driver.findElement(By.xpath(INPUT_TEXT_AREA_STREET)).sendKeys(text);
        driver.switchTo().defaultContent();
    }

    /**
     * get Account Text
     *
     * @return output text
     */
    public String getAccountText() {
        return driver.findElement(By.xpath(String.format(OUTPUT_XPATH, label))).getText();
    }
}
