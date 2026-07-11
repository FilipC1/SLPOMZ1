package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private By usernameLokator = By.id("user-name");
    private By passwordLokator = By.id("password");
    private By loginDugmeLokator = By.id("login-button");
    private By loginLogoLokator = By.className("login_logo");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void enterUsername(String username) {
        type(this.usernameLokator, username);
    }

    public void enterPassword(String password) {
        type(passwordLokator, password);
    }

    public void clickLoginButton() {
        click(loginDugmeLokator);
    }

    public boolean loginStrana() {
        return isDisplayed(loginLogoLokator);
    }

    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLoginButton();
    }





}