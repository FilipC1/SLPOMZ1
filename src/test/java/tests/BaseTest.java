package tests;

import org.junit.Assert;
import org.junit.Test;
import pages.CartPage;
import pages.LoginPage;
import pages.ProductPage;
import pages.ProductsPage;

public class BaseTest extends SLTest {

    @Test
    public void dodajRanacUKorpuTest() {
        LoginPage loginStrana = new LoginPage(driver);
        ProductsPage proizvodiStrana = new ProductsPage(driver);
        ProductPage proizvodStrana = new ProductPage(driver);
        CartPage korpaStrana = new CartPage(driver);

        Assert.assertTrue(loginStrana.loginStrana());
        loginStrana.login("standard_user", "secret_sauce");

        Assert.assertTrue(proizvodiStrana.proizvodiStrana());
        Assert.assertTrue(proizvodiStrana.izaberiProizvod().equals("Products"));
        proizvodiStrana.ranacProizvod();

        Assert.assertTrue(proizvodStrana.proizvodiStranica());
        Assert.assertTrue(proizvodStrana.imeProizvoda().equals("Sauce Labs Backpack"));
        proizvodStrana.dodajProizvodUKorpu();

        Assert.assertTrue(proizvodStrana.ikonaKorpe());
        proizvodStrana.otvoriKorpu();

        Assert.assertTrue(korpaStrana.korpaStranica());
        Assert.assertTrue(korpaStrana.proizvodJeUKorpi());
        Assert.assertTrue(korpaStrana.ranacJeUKorpi());
        Assert.assertTrue(korpaStrana.checkoutDugme());
    }




}