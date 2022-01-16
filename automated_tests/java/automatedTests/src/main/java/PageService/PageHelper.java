package PageService;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageHelper extends PageObject {

    WebDriverWait wait;
    int secondsWait = 30;

    public PageHelper(WebDriver driver) {
        super(driver);
        wait = new WebDriverWait(driver, secondsWait);
    }

    public void clickElement(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
        System.out.println("Clicked: " + element.toString());
    }
}
