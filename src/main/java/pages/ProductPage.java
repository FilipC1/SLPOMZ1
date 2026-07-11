package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage {

    private By imeProizvodaLokator = By.className("inventory_details_name");
    private By dodajUKorpuDugmeLokator = By.id("add-to-cart");
    private By korpaLokator = By.className("shopping_cart_link");
    private By korpaIkonaLokator = By.className("shopping_cart_badge");

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public boolean proizvodiStranica() {
        return isDisplayed(imeProizvodaLokator);
    }

    public String imeProizvoda() {
        return getText(imeProizvodaLokator);
    }

    public void dodajProizvodUKorpu() {
        click(dodajUKorpuDugmeLokator);
    }

    public boolean ikonaKorpe() {
        return isDisplayed(korpaIkonaLokator);
    }

    public void otvoriKorpu() {
        click(korpaLokator);
    }





}