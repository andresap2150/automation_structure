package config;

import org.aeonbits.owner.Config;

import java.util.List;

@Config.Sources("file:src/test/resources/webdriver.config")
public interface DriverConfig extends Config {
    @Key("chrome.properties")
    public List<String> chromeArguments();

    @Key("driver.waitTimeOutSec")
    public int getTimeOutSeconds();

    @Key("driver.pollingIntervalMill")
    public int getPollingIntervalMillis();

    @Key("app.mainURL")
    public String getMainURL();
}
