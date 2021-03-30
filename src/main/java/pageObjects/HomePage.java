package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public @FindBy(css = ".active:nth-child(1) .first-item-of-mobile-line:nth-child(5) .product-container img") WebElement summerDressElement;
    public @FindBy(css = "#add_to_cart") WebElement addToCartButton;

}
