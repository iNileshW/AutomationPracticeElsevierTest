package pageObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailPage extends BasePage{
    public @FindBy(css = "#add_to_cart") WebElement addToCartButton;
    public @FindBy(css = "a.button-medium") WebElement proceedToCheckoutButton;
    public @FindBy(css = ".button-container > a > span") WebElement proceedToCheckoutButtonPopUp;

}
