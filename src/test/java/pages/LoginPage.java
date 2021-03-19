package pages;

import config.Context;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private static final String cssStartLoginButton = "div.our-story-header a.authLinks";
    private static final String idUsernameInput = "id_userLoginId";
    private static final String idPasswordInput = "id_password";
    private static final String cssLoginButton = "button.login-button";
    private static final String cssErrorMsg = "div.ui-message-contents";

    public LoginPage() {
        PageFactory.initElements(Context.driver, this);
    }

    @FindBy(css = cssStartLoginButton)
    public WebElement startLoginButton;

    @FindBy(id = idUsernameInput)
    public WebElement usernameInput;

    @FindBy(id = idPasswordInput)
    public WebElement passwordInput;

    @FindBy(css = cssLoginButton)
    public WebElement loginButton;

    @FindBy(css = cssErrorMsg)
    public WebElement errorMsg;
}
