package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage {

    private By proizvodiLokator = By.className("title");
    private By ranacLokator = By.id("item_4_title_link");
    private By korpaLokator = By.className("shopping_cart_link");

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public boolean proizvodiStrana() {
        return isDisplayed(proizvodiLokator);
    }

    public String izaberiProizvod() {
        return getText(proizvodiLokator);
    }

    public void ranacProizvod() {
        click(ranacLokator);
    }

    public void otvoriKorpu() {
        click(korpaLokator);
    }





}