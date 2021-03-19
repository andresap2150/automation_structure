package methods;

import org.openqa.selenium.WebElement;
import pages.LoginPage;

public class LoginMethods extends CommonMethods{
    private LoginPage loginPage = new LoginPage();

    public void goLoginPage(){
        goUrl(config.getMainURL());
        clickOnWebelement(loginPage.startLoginButton);
    }

    public void setUsernameAndPassword(String username, String password) {
        setValueOnWebElement(loginPage.usernameInput, username);
        setValueOnWebElement(loginPage.passwordInput, password);
        clickOnWebelement(loginPage.loginButton);
    }

    public String getErrorMessage() {
        return getValueOnWebElement(loginPage.errorMsg);
    }
}
