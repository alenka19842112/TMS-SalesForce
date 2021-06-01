package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Buttons {
    WebDriver driver;
    String label;

    public Buttons(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }
    private static final String BUTTON_LOCATOR ="//button[@title='%s']";

    /**
     * click Button
     */
    public void clickButton(){
        driver.findElement(By.xpath(String.format(BUTTON_LOCATOR,label))).click();
    }

}
