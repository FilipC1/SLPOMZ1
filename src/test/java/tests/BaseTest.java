package tests;

import org.junit.Assert;
import org.junit.Test;
import pages.CartPage;
import pages.LoginPage;
import pages.ProductPage;
import pages.ProductsPage;

public class BaseTest extends SLTest {

    LoginPage loginStrana = new LoginPage(driver);
    ProductsPage proizvodiStrana = new ProductsPage(driver);
    ProductPage proizvodStrana = new ProductPage(driver);
    CartPage korpaStrana = new CartPage(driver);

    @Test
    public void uspesanLoginTest() {
        Assert.assertTrue(loginStrana.loginStrana());
        loginStrana.login("standard_user", "secret_sauce");
        Assert.assertTrue(proizvodiStrana.proizvodiStrana());
    }

    @Test
    public void otvoriProizvodTest() {
        loginStrana.login("standard_user", "secret_sauce");
        proizvodiStrana.ranacProizvod();
        Assert.assertTrue(proizvodStrana.proizvodiStranica());
        Assert.assertTrue(proizvodStrana.imeProizvoda().equals("Sauce Labs Backpack"));
    }

    @Test
    public void otvoriKorpuTest() {
        loginStrana.login("standard_user", "secret_sauce");
        proizvodiStrana.otvoriKorpu();
        Assert.assertTrue(korpaStrana.korpaStranica());
    }




}