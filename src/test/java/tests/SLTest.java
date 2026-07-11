package tests;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SLTest {

    protected static WebDriver driver;

    @BeforeClass
    public static void openChrome() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Before
    public void openWebPage() {
        driver.get("https://www.saucedemo.com/");
    }

    @AfterClass
    public static void closeChrome() {
        driver.quit();
    }




}