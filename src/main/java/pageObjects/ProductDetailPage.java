package pageObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailPage extends BasePage{
    public @FindBy(css = "a.btn.btn-default.button.button-medium") WebElement proceedToCheckoutButton;
    public @FindBy(css = ".button-container > a > span") WebElement proceedToCheckoutButtonPopUp;

}
