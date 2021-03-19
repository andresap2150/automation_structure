package methods;

import config.Context;
import config.DriverConfig;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class CommonMethods {

    protected DriverConfig config = ConfigFactory.create(DriverConfig.class);

    public void clickOnWebelement(WebElement clickableWebElement){
        FluentWait<WebDriver> wait = getFluentWait();
        wait.until(ExpectedConditions.elementToBeClickable(clickableWebElement));
        clickableWebElement.click();
    }

    public void setValueOnWebElement(WebElement element, String value){
        getFluentWait().until(ExpectedConditions.elementToBeClickable(element));
        element.clear();
        element.sendKeys(value);
    }

    public String getValueOnWebElement(WebElement errorMsg) {
        getFluentWait().ignoring(NoSuchElementException.class).until(ExpectedConditions.visibilityOf(errorMsg));
        return errorMsg.getText();
    }

    private FluentWait<WebDriver> getFluentWait() {
        return new FluentWait<WebDriver>(Context.driver).
                    withTimeout(Duration.ofSeconds(config.getTimeOutSeconds())).
                    pollingEvery(Duration.ofMillis(config.getPollingIntervalMillis()));
    }

    public void goUrl(String url){
        Context.driver.get(url);
    }
}
