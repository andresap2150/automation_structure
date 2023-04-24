package steps;

import config.Context;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.aeonbits.owner.ConfigFactory;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import config.DriverConfig;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Hooks {

    static Logger log = LoggerFactory.getLogger(Hooks.class);

    @Before
    public void setUp(){
        String browser = getBrowser();
        WebDriver configuredDriver = getDriver(browser);
        Context.driver = configuredDriver;
        Context.softAssertions = new SoftAssertions();
    }

    private WebDriver getDriver(String browser) {
        DriverConfig config = ConfigFactory.create(DriverConfig.class);
        switch (browser) {
            case "CHROME":
                WebDriverManager.chromedriver().setup();
                ChromeOptions options = new ChromeOptions();
                options.addArguments(config.chromeArguments());
                return new ChromeDriver(options);
            case "FIREFOX":
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
        }
        return null;
    }

    private String getBrowser() {
        if (System.getProperty("BROWSER")==null || System.getProperty("BROWSER").isEmpty()){
            log.info("no browser provided, used CHROME as default");
            return "CHROME";
        }else{
            return System.getProperty("BROWSER");
        }
    }

    @After
    public void tearDown(){
        log.info("In After tests.......");
        Context.softAssertions.assertAll();
        Context.driver.close();
        Context.driver.quit();
    }

}
