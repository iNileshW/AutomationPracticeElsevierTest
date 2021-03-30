package pageObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage{
    public @FindBy(css = ".standard-checkout.button-medium > span:nth-child(1)") WebElement proceedToCheckoutButton;

}
