package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static util.Constants.*;

public class BasePage {
    public static WebDriver driver;

    public static HomePage homePage;
    public static ProductDetailPage productDetailPage;
    public static ShoppingCartPage shoppingCartPage;
    public static SignInPage signInPage;


    public WebDriver openUrl() {

        System.setProperty(BROWSER_DRIVER, DRIVER_PATH);
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(HOMEPAGE_URL);
        homePage = PageFactory.initElements(driver, HomePage.class);
        productDetailPage = PageFactory.initElements(driver, ProductDetailPage.class);
        shoppingCartPage = PageFactory.initElements(driver, ShoppingCartPage.class);
        signInPage = PageFactory.initElements(driver, SignInPage.class);
        return driver;
    }

    public static void clickElement(WebDriver driver, WebElement element){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}
