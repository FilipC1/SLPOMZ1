package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {

    private By korpaLokator = By.className("title");
    private By proizvodUKorpiLokator = By.className("cart_item");
    private By ranacLokator = By.xpath("//div[text()='Sauce Labs Backpack']");
    private By checkoutDugmeLokator = By.id("checkout");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public boolean korpaStranica() {
        return isDisplayed(korpaLokator);
    }

    public boolean proizvodJeUKorpi() {
                return isDisplayed(proizvodUKorpiLokator);
    }

    public boolean ranacJeUKorpi() {
                return isDisplayed(ranacLokator);
    }

    public boolean checkoutDugme() {
                return isDisplayed(checkoutDugmeLokator);
    }




}